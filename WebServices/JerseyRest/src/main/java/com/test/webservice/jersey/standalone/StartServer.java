package com.test.webservice.jersey.standalone;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

/**
 * Created by jrout on 12/7/2016.
 */
public class StartServer {
    public static void main(String[] args) {
        JAXRSServerFactoryBean restServer = new JAXRSServerFactoryBean();
        TokenService tokenService = new TokenService();

        restServer.setResourceClasses(TokenService.class);
        restServer.setServiceBeans(tokenService);
        restServer.setAddress("http://localhost:9000/");
        restServer.create();

        System.out.println("Token service Started...");
    }
}
