package com.globant.bootcamp.rest;

import static org.junit.Assert.assertEquals;

import java.io.InputStream;

import javax.ws.rs.core.Response;

import com.globant.bootcamp.rest.resource.HelloWorldResource;
import org.apache.cxf.helpers.IOUtils;
import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Before;
import org.junit.Test;

public class HelloWorldResourceTest {

    HelloWorldResource resource = new HelloWorldResource();

    private static String endpointUrl;

    @Before
    public void setup() {
        endpointUrl = System.getProperty("service.url");
    }

    @Test
    public void shouldReturnTheInputAsAString() throws Exception {
        String param = "hola!";

        String result = resource.echo(param);

        assertEquals(param, result);

        /*
        WebClient client = WebClient.create(endpointUrl + "/hello/echo/SierraTangoNevada");

        Response r = client.accept("text/plain").get();

        assertEquals(Response.Status.OK.getStatusCode(), r.getStatus());

        String value = IOUtils.toString((InputStream)r.getEntity());
        assertEquals("SierraTangoNevada", value);
        */
    }
}
