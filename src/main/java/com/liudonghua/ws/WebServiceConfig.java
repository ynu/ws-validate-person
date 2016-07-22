package com.liudonghua.ws;

import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

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

    @Bean(name = "wsdl")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema wsdlSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("validatePersonsPort");
        wsdl11Definition.setLocationUri("/ws/validate-person");
        wsdl11Definition.setTargetNamespace("http://web-service.ynu.edu.cn/validate-person");
        wsdl11Definition.setSchema(wsdlSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema wsdlSchema() {
        return new SimpleXsdSchema(new ClassPathResource("wsdl.xsd"));
    }
}
