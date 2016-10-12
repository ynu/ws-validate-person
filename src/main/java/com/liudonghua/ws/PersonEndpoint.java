package com.liudonghua.ws;
//
import cn.edu.ynu.web_service_ceair.validate_person.PERSON;
import cn.edu.ynu.web_service_ceair.validate_person.RTNPERSON;
import cn.edu.ynu.web_service_ceair.validate_person.ValidatePersonRequest;
import cn.edu.ynu.web_service_ceair.validate_person.ValidatePersonResponse;
//import com.sun.xml.internal.bind.marshaller.CharacterEscapeHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.XmlMappingException;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.springframework.xml.transform.StringResult;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;
import java.util.regex.Pattern;

@Endpoint
public class PersonEndpoint {
    private static final String NAMESPACE_URI = "http://web-service-ceair.ynu.edu.cn/validate-person";

    private PersonRepository personRepository;

    @Autowired
    public PersonEndpoint(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Autowired
    public Marshaller marshaller;
    @Autowired
    public Unmarshaller unmarshaller;

//    @Autowired
    public Jaxb2Marshaller jaxb2Marshaller;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "validatePersonRequest")
    @ResponsePayload
    public ValidatePersonResponse validatePerson(@RequestPayload ValidatePersonRequest personRequest) {

        String personString = personRequest.getIn0();
        StreamSource source = new StreamSource(new StringReader(personString));
        PERSON person = null;
        try {
            JAXBElement<PERSON> personjaxbElement = unmarshaller.unmarshal(source, PERSON.class);
            person = personjaxbElement.getValue();
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        List<PERSON.PERSONINFOLIST.PERSONINFO> personInfolist = person.getPERSONINFOLIST().getPERSONINFO();
        RTNPERSON rtnPerson = new RTNPERSON();
        rtnPerson.setERRID("OK");
        rtnPerson.setERRMSG("");
        RTNPERSON.RTNPERSONINFOLIST rtnPersonInfoWrapper = new RTNPERSON.RTNPERSONINFOLIST();
        rtnPerson.setRTNPERSONINFOLIST(rtnPersonInfoWrapper);
        List<RTNPERSON.RTNPERSONINFOLIST.RTNPERSONINFO> rtnPersonInfolist = rtnPersonInfoWrapper.getRTNPERSONINFO();
        for (int i = 0; i < personInfolist.size(); i++) {
            PERSON.PERSONINFOLIST.PERSONINFO personInfo = personInfolist.get(i);
            RTNPERSON.RTNPERSONINFOLIST.RTNPERSONINFO rtnPersonInfo = new RTNPERSON.RTNPERSONINFOLIST.RTNPERSONINFO();
            rtnPersonInfo.setSORTID(personInfo.getSORTID());
            rtnPersonInfo.setPERSONTYPE("1");
            rtnPersonInfolist.add(rtnPersonInfo);
        }
        StringWriter result = new StringWriter();
        try {
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            // fix package com.sun.xml.internal.bind.marshaller does not exist
//            marshaller.setProperty("com.sun.xml.internal.bind.marshaller.CharacterEscapeHandler",
//                    new CharacterEscapeHandler() {
//                        @Override
//                        public void escape(char[] ch, int start, int length,
//                                           boolean isAttVal, Writer writer)
//                                throws IOException {
//                            writer.write(ch, start, length);
//                        }
//                    });
            marshaller.marshal(rtnPerson, result);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        String personRtnString = result.toString();
//        String personRtnCDataString = "<![CDATA[" + personRtnString + "]]>";

        ValidatePersonResponse personResponse = new ValidatePersonResponse();
        personResponse.setOut(personRtnString);

        return personResponse;
    }
}
