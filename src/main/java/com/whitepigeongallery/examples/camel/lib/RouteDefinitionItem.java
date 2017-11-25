package com.whitepigeongallery.examples.camel.lib;

public class RouteDefinitionItem {

    private String fromURI;

    private String toURI;

    public RouteDefinitionItem(String fromURI, String toURI) {
        this.fromURI = fromURI;
        this.toURI = toURI;
    }

    public String getFromURI() {
        return fromURI;
    }

    public void setFromURI(String fromURI) {
        this.fromURI = fromURI;
    }

    public String getToURI() {
        return toURI;
    }

    public void setToURI(String toURI) {
        this.toURI = toURI;
    }
}
