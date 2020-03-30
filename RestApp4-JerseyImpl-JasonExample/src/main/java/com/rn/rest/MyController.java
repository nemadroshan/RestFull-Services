package com.rn.rest;

import com.nt.beans.Customer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("cutomer")
public class MyController {

    @GET
    @Path("/getCutomer")
    @Produces(MediaType.APPLICATION_JSON)
    public Customer getCustomer(){
        Customer c = new Customer();
        c.setCutomerId(101);c.setCustomerName("roshan");
        c.setCustomerEmail("r@gmail.com");c.setCustomerPhno("13423");
        return  c;
    }
}
