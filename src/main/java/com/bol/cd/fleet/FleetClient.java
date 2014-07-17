package com.bol.cd.fleet;

import com.bol.cd.fleet.plugins.JsonApplicationMediaTypeInterceptor;
import feign.Client;
import feign.Feign;
import feign.RequestInterceptor;
import feign.auth.BasicAuthRequestInterceptor;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.jaxrs.JAXRSModule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class FleetClient {

    private String username;
    private String password;
    private boolean requiresAuthentication = false;
    private final String url;

    private Client client;

    public static FleetApi create(final String url) {
        return new FleetClient(url).createClient();
    }

    public static FleetApi create(final String url, final String username, final String password) {
        return new FleetClient(url).authenticated(username, password).createClient();
    }

    public static FleetApi create(Client client, final String url, final String username, final String password) {
        return new FleetClient(url).withClient(client).authenticated(username, password).createClient();
    }

    private FleetClient(final String url) {
        Objects.requireNonNull(url, "url must be provided");
        this.url = url.replaceAll("/\\z", "");
    }

    public FleetClient withClient(Client client) {
        Objects.requireNonNull(client, "username must be provided");
        this.client = client;
        return this;
    }

    public FleetClient authenticated(final String username, final String password) {
        Objects.requireNonNull(username, "username must be provided");
        Objects.requireNonNull(password, "password must be provided");
        this.username = username;
        this.password = password;
        this.requiresAuthentication = true;
        return this;
    }

    private FleetApi createClient() {
        Feign.Builder builder = Feign.builder();
        if (client != null) {
            builder.client(client);
        }
        //@formatter:off
        builder.contract(new JAXRSModule.JAXRSContract())
                .decoder(new JacksonDecoder())
                .encoder(new JacksonEncoder())
                .errorDecoder(new FleetErrorDecoder())
                .requestInterceptors(getRequestInterceptors())
                .target(FleetApi.class, url);
        //@formatter:on
        return builder.target(FleetApi.class, url);

    }

    private Iterable<RequestInterceptor> getRequestInterceptors() {
        final List<RequestInterceptor> base = new ArrayList<RequestInterceptor>(Arrays.asList(new JsonApplicationMediaTypeInterceptor()));
        if (requiresAuthentication) {
            base.add(new BasicAuthRequestInterceptor(username, password));
        }
        return base;
    }

}
