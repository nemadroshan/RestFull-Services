package com.rn.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.awt.*;
@Path("/product")
public class ProductController {
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_XML)
    @Path("/register")
    public String registerProduct(String xml){
        System.out.println("In Server ");
        System.out.println("xml = " + xml);
        return  "Product Register Successfull";
    }
}
