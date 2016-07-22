package com.liudonghua.ws;

import cn.edu.ynu.web_service.validate_person.PERSON;
import cn.edu.ynu.web_service.validate_person.RTNPERSON;
import cn.edu.ynu.web_service.validate_person.ValidatePersonRequest;
import cn.edu.ynu.web_service.validate_person.ValidatePersonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.List;

@Endpoint
public class PersonEndpoint {
    private static final String NAMESPACE_URI = "http://web-service.ynu.edu.cn/validate-person";

    private PersonRepository personRepository;

    @Autowired
    public PersonEndpoint(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "validatePersonRequest")
    @ResponsePayload
    public ValidatePersonResponse validatePerson(@RequestPayload ValidatePersonRequest personRequest) {
        PERSON person = personRequest.getPERSON();
        List<PERSON.PERSONINFOLIST.PERSONINFO> personInfolist = person.getPERSONINFOLIST().getPERSONINFO();

        ValidatePersonResponse personResponse = new ValidatePersonResponse();
        RTNPERSON rtnPerson = new RTNPERSON();
        personResponse.setRTNPERSON(rtnPerson);
        rtnPerson.setERRID("OK");
        rtnPerson.setERRMSG("");
        RTNPERSON.RTNPERSONINFOLIST rtnPersonInfoWrapper = new RTNPERSON.RTNPERSONINFOLIST();
        rtnPerson.setRTNPERSONINFOLIST(rtnPersonInfoWrapper);
        List<RTNPERSON.RTNPERSONINFOLIST.RTNPERSONINFO> rtnPersonInfolist = rtnPersonInfoWrapper.getRTNPERSONINFO();
        for (int i = 0; i < personInfolist.size(); i++) {
            PERSON.PERSONINFOLIST.PERSONINFO personInfo = personInfolist.get(i);
            RTNPERSON.RTNPERSONINFOLIST.RTNPERSONINFO rtnPersonInfo = new RTNPERSON.RTNPERSONINFOLIST.RTNPERSONINFO();
            rtnPersonInfo.setSORTID(personInfo.getSORTID());
            rtnPersonInfo.setPERSONTYPE("OK");
            rtnPersonInfolist.add(rtnPersonInfo);
        }
        return personResponse;
    }
}
