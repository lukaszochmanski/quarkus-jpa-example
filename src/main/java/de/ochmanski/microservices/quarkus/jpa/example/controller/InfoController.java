package de.ochmanski.microservices.quarkus.jpa.example.controller;


import de.ochmanski.microservices.quarkus.jpa.example.util.ApplicationPropertiesConfig;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/version")
public class InfoController {

    @Inject
    ApplicationPropertiesConfig applicationPropertiesConfig;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String version() {
        return applicationPropertiesConfig.getApplicationVersion();
    }
}
