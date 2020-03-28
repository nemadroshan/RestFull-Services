package com.rn.controller;

import com.rn.beans.Products;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/product")
public class MyController {
    @GET
    @Path("/search")
    @Produces(MediaType.APPLICATION_JSON)
    public Products searchPoduct(@QueryParam("productId") Integer productid) {
        Products p = new Products();
        if (productid != null || productid.equals(101)) {
            p.setProductId(productid);
            p.setProductExpDate("some date");
            p.setProductMrfDate("some date");
            p.setProductName("Dettol");
            return p;
        } else {
            return null;
        }
    }

    //Multiple query Param resorce
    @GET
    @Path("/searchProducts")
    @Produces(MediaType.APPLICATION_XML)
    public Products searchPoducts(@QueryParam("productId") Integer productid, @QueryParam("productName") String pname) {
        Products p = new Products();
        if (productid != null || productid.equals(101)) {
            p.setProductId(productid);
            p.setProductExpDate("some date");
            p.setProductMrfDate("some date");
            p.setProductName(pname);
            return p;
        } else {
            return null;
        }
    }

    //Resorce for Path Param and
    //http://localhost:8090/RestApp2__JerseyImpl_QueryParamExample_war/product/setProduct/roshan/101

    @GET
    @Path("/setProduct/{name}/{pid}")
    @Produces(MediaType.APPLICATION_JSON)
    public Products setProjectByPathParam(@PathParam("name") String name, @PathParam("pid") Integer pid) {
        Products p = new Products();
        p.setProductName(name);
        p.setProductId(pid);
        p.setProductMrfDate("Some Date");
        p.setProductExpDate("some Date");
        return p;
    }


    //to check this resource hit this link to browser or postman
    //http://localhost:8090/RestApp2__JerseyImpl_QueryParamExample_war/product/setProductName;name=shubh;pid=101
    @GET
    @Path("/setProductName")
    @Produces(MediaType.APPLICATION_JSON)
    public Response setProjectByMatrixParam(@MatrixParam("name") String name, @MatrixParam("pid") Integer pid) {
        Products p = new Products();
        p.setProductName(name);
        p.setProductId(pid);
        p.setProductMrfDate("Some Date");
        p.setProductExpDate("some Date");
        return Response.ok("Successful").build();
    }



    // @formparam Demo
    @POST
    @Path("/register")
    public Response registerForm(@FormParam("pid") Integer pid , @FormParam("pname") String pname,
                                 @FormParam("mrfDate")String mrfDate ,@FormParam("expDate") String expDate ){
        System.out.println("Register Form Is called");
        String result = "Product id = "+pid +" , Product Name = "+pname +", Maufacturing Date = "+ mrfDate + " , Expiry Date = "+expDate + " is saved Sussessfully .";

        return Response.status(200).entity(result).build();
    }

    /*the formparam method is problem beacause if form with the 10 filed then
     we have to write 10 time @form param annotation for each fields
     to overcome this we have @BeanParam anotation
    */
}
