package com.whitepigeongallery.examples.camel.business;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class CamelContainer {

    @Inject
    private CamelContext context;

}
