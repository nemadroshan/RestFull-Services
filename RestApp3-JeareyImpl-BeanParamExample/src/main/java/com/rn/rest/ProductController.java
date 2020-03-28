package com.rn.rest;

import com.rn.beans.Products;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/product")
public class ProductController {
    @POST
    @Path("/register")
    @Consumes({MediaType.APPLICATION_FORM_URLENCODED})
   // @Consumes(MediaType.APPLICATION_XML)
    public Response registerForm(@BeanParam Products products){
        System.out.println("Inside register form");
        return Response.ok(products.toString()).build();
    }
}
