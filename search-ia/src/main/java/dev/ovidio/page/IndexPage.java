package dev.ovidio.page;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

import java.net.URI;

@Path("/")
public class IndexPage {

    @GET
    public Response index() {
        return Response.seeOther(URI.create("/login"))
                .build();
    }

}
