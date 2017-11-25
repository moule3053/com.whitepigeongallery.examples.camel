package com.whitepigeongallery.examples.camel.business;

import com.whitepigeongallery.examples.camel.lib.RouteDefinitionItem;
import com.whitepigeongallery.examples.camel.lib.RoutesDefinition;

import javax.enterprise.context.ApplicationScoped;
import java.util.HashSet;
import java.util.Set;

@ApplicationScoped
public class JT400ToKafkaRoutesDefinition implements RoutesDefinition {

    @Override
    public Set<RouteDefinitionItem> getDefinitionItemSet() {
        final Set<RouteDefinitionItem> routesDefinitions = new HashSet<>();
        routesDefinitions.add(
                new RouteDefinitionItem(
                        "kafka:inputtest?brokers=localhost:9092&autoOffsetReset=earliest",
                        "kafka:outputtest?brokers=localhost:9092"));
        return routesDefinitions;
    }
}
