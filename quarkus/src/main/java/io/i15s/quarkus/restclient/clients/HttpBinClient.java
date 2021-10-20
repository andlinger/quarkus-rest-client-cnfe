package io.i15s.quarkus.restclient.clients;

import io.i15s.quarkus.restclient.models.HttpBin;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/anything")
@RegisterRestClient
public interface HttpBinClient {

    @GET
    HttpBin anything();
}
