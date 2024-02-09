package com.cairone.rest;

import com.cairone.calc.AritmeticCalc;
import com.cairone.rest.resource.ResultResource;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("foo")
public class AritmeticCtrl {

    private AritmeticCalc aritmeticCalc;

    public AritmeticCtrl() {
        this.aritmeticCalc = new AritmeticCalc();
    }

    @GET
    @Path("ok")
    @Produces(MediaType.APPLICATION_JSON)
    public Response foo() {

        int result = aritmeticCalc.sumOf(3, 4);
        ResultResource response = new ResultResource(result);
        return Response.ok(response).build();
    }
}
