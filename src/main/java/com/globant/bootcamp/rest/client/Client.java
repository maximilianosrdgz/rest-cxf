package com.globant.bootcamp.rest.client;

import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Component
public interface Client {

    @GET
    @Consumes("application/json")
    @Produces("application/json")
    Response someMethod(@QueryParam(value = "someQueryParamHere") String query);
}
