package com.rn.resource;

import com.rn.bean.Customer;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("customer")
public class CustomerResource {
    /*@GET
    @Path("/hello")
    public String get() {
        return "Hello world";
    }*/

    @GET
    @Path("/getCustomer")
    @Produces(MediaType.APPLICATION_XML)
    public Customer getCustomer() {
        Customer c = new Customer();
        c.setCemail("roshan");
        c.setCid(101);c.setCphNo("1233");
        c.setCname("java");
        return c;
    }

    @POST
    @Path("addCustomer")
    @Consumes(MediaType.APPLICATION_XML)
    public Response Response(Customer c){
        String response ="Submitted Succssfully";
        return Response.ok(response).build();
    }
}
