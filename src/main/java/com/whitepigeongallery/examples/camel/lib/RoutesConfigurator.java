package com.whitepigeongallery.examples.camel.lib;

import org.apache.camel.CamelContext;
import org.apache.camel.RoutesBuilder;
import org.apache.camel.builder.RouteBuilder;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class RoutesConfigurator extends RouteBuilder {

    @Inject
    private RoutesDefinition routesDefinition;

    @Override
    public void configure() throws Exception {
        routesDefinition.getDefinitionItemSet().forEach(item -> from(item.getFromURI()).to(item.getToURI()));
    }
}
