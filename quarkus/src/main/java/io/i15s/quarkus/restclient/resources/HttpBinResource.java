package io.i15s.quarkus.restclient.resources;

import io.i15s.quarkus.restclient.services.HttpBinService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/v1/anything")
@RequestScoped
public class HttpBinResource {

    @Inject
    HttpBinService service;

    @GET
    public Response anything() {
        var result = service.anything();

        return Response.ok(result)
                .build();
    }
}
