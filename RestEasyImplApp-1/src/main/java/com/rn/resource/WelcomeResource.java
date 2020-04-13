package com.rn.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.Calendar;
@Path("wish")
public class WelcomeResource {
    @GET
    @Path("/wishMsg")
    public String getWishMessage(){
        Calendar cal = Calendar.getInstance();
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        if(hour<12)
            return "Good Morning";
        else if (hour<15)
            return "Good Afternoon";
        else if (hour<20)
            return "Good Evening";
        else
            return "Good Night";
    }
}
