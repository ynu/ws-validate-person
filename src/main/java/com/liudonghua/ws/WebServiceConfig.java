package com.liudonghua.ws;

import cn.edu.ynu.web_service_ceair.validate_person.PERSON;
import cn.edu.ynu.web_service_ceair.validate_person.RTNPERSON;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.util.HashMap;
import java.util.Map;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {
    @Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(servlet, "/ws/*");
    }

    @Bean(name = "validate-person")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema wsdlSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("validatePersonsPort");
        wsdl11Definition.setLocationUri("/ws/validate-person");
        wsdl11Definition.setTargetNamespace("http://web-service-ceair.ynu.edu.cn/validate-person");
        wsdl11Definition.setSchema(wsdlSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema wsdlSchema() {
        return new SimpleXsdSchema(new ClassPathResource("wsdl.xsd"));
    }

    @Bean
    public Marshaller marshaller(JAXBContext jaxbContext) {
        try {
            return jaxbContext.createMarshaller();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Bean
    public Unmarshaller unmarshaller(JAXBContext jaxbContext) {
        try {
            return jaxbContext.createUnmarshaller();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Bean
    public JAXBContext jaxbContext() {
        try {
            return JAXBContext.newInstance("cn.edu.ynu.web_service_ceair.validate_person");
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

//    @Bean
//    public Jaxb2Marshaller jaxb2Marshaller() {
//        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
//        jaxb2Marshaller.setContextPath("cn.edu.ynu.web_service_ceair.validate_person");
//        jaxb2Marshaller.setPackagesToScan("cn.edu.ynu.web_service_ceair.validate_person");
//        jaxb2Marshaller.setClassesToBeBound(PERSON.class, RTNPERSON.class);
//        Map<String,Object> map = new HashMap<String,Object>();
//        map.put("jaxb.formatted.output", true);
//        jaxb2Marshaller.setMarshallerProperties(map);
//        return jaxb2Marshaller;
//    }
}
