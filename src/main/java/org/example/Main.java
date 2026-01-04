package org.example;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import org.example.impl.HelloServiceImpl;


public class Main {
    static void main() {

        String address = "http://localhost:8080/services/hello";
        JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
        factory.setServiceClass(HelloServiceImpl.class);
        factory.setAddress(address);
        factory.create();
        System.out.println("WSDL: " + address + "?wsdl");
    }
}
