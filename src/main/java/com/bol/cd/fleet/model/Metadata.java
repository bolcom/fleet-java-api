package com.bol.cd.fleet.model;

import java.util.HashMap;
import java.util.Map;

public class Metadata {

    private Map<String, Object> properties = new HashMap<>();
    private Map<String, Object> additionalProperties = new HashMap<>();

    public Map<String, Object> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }
}
