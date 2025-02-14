// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.synapse.fluent.models.PrivateEndpointConnectionProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The PrivateEndpointConnectionForPrivateLinkHubBasicAutoGenerated model. */
@Fluent
public class PrivateEndpointConnectionForPrivateLinkHubBasicAutoGenerated {
    /*
     * The id property.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Properties of a private endpoint connection.
     */
    @JsonProperty(value = "properties")
    private PrivateEndpointConnectionProperties properties;

    /**
     * Get the id property: The id property.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The id property.
     *
     * @param id the id value to set.
     * @return the PrivateEndpointConnectionForPrivateLinkHubBasicAutoGenerated object itself.
     */
    public PrivateEndpointConnectionForPrivateLinkHubBasicAutoGenerated withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the properties property: Properties of a private endpoint connection.
     *
     * @return the properties value.
     */
    public PrivateEndpointConnectionProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of a private endpoint connection.
     *
     * @param properties the properties value to set.
     * @return the PrivateEndpointConnectionForPrivateLinkHubBasicAutoGenerated object itself.
     */
    public PrivateEndpointConnectionForPrivateLinkHubBasicAutoGenerated withProperties(
        PrivateEndpointConnectionProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
