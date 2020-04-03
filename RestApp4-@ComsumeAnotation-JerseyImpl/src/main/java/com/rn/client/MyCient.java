package com.rn.client;


import com.rn.beans.Products;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

public class MyCient {
    public static void main(String[] args) throws JAXBException {
        String url = "http://localhost:8090/RestApp4__ComsumeAnotation_JerseyImpl_war/root/product/register";
        Client client = Client.create();
        WebResource resource = client.resource(url);
        WebResource.Builder builder = resource.type(MediaType.APPLICATION_XML);

        Products products = new Products();
        products.setPid(101);products.setpName("Some Product");

        JAXBContext jaxbContext = JAXBContext.newInstance(Products.class);

        Marshaller marshaller = jaxbContext.createMarshaller();
        StringWriter writer = new StringWriter();
        marshaller.marshal(products,writer);
        String productXml = writer.toString();

        ClientResponse clientresponse = builder.post(ClientResponse.class , productXml);
        String response = clientresponse.getEntity(String.class);
        System.out.println(clientresponse.getStatus() + "----"+clientresponse.getResponseStatus());
        System.out.println(response);
    }
}


