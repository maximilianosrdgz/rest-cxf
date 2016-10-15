package com.globant.bootcamp.rest.resource;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Component
@Path("/hello")
public class HelloWorldResource {

    @GET
    @Path("/echo/{input}")
    @Produces("text/plain")
    public String echo(@PathParam("input") String input) {
        return input;
    }
}

