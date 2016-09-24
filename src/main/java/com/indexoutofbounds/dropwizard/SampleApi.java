package com.indexoutofbounds.dropwizard;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class SampleApi {

    private String version;

    public SampleApi(String version) {
        this.version = version;
    }

    @POST
    @Path("/echo")
    @Produces(MediaType.TEXT_PLAIN)
    public String echo(@QueryParam("str") String str) {
        EchoHandler e = new EchoHandler();
        return e.handle(str);
    }

    @GET
    @Path("/version")
    @Produces(MediaType.TEXT_PLAIN)
    public String version() {
        return this.version;
    }

}
