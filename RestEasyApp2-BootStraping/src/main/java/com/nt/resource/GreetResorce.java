package com.nt.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/greet")
public class GreetResorce {
    @GET
    @Path("/msg")
    public String getGreetingMsg(){
        return "Good Morning";
    }
}
