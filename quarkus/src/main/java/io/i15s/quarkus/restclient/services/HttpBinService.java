package io.i15s.quarkus.restclient.services;

import io.i15s.quarkus.restclient.clients.HttpBinClient;
import io.i15s.quarkus.restclient.models.HttpBin;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HttpBinService {

    @RestClient
    HttpBinClient client;

    public HttpBin anything() {
        return client.anything();
    }
}
