// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Properties related to EventHub. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "endpointType")
@JsonTypeName("EventHub")
@Fluent
public final class EventHub extends DigitalTwinsEndpointResourceProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EventHub.class);

    /*
     * PrimaryConnectionString of the endpoint for key-based authentication.
     * Will be obfuscated during read.
     */
    @JsonProperty(value = "connectionStringPrimaryKey")
    private String connectionStringPrimaryKey;

    /*
     * SecondaryConnectionString of the endpoint for key-based authentication.
     * Will be obfuscated during read.
     */
    @JsonProperty(value = "connectionStringSecondaryKey")
    private String connectionStringSecondaryKey;

    /*
     * The URL of the EventHub namespace for identity-based authentication. It
     * must include the protocol 'sb://'.
     */
    @JsonProperty(value = "endpointUri")
    private String endpointUri;

    /*
     * The EventHub name in the EventHub namespace for identity-based
     * authentication.
     */
    @JsonProperty(value = "entityPath")
    private String entityPath;

    /**
     * Get the connectionStringPrimaryKey property: PrimaryConnectionString of the endpoint for key-based
     * authentication. Will be obfuscated during read.
     *
     * @return the connectionStringPrimaryKey value.
     */
    public String connectionStringPrimaryKey() {
        return this.connectionStringPrimaryKey;
    }

    /**
     * Set the connectionStringPrimaryKey property: PrimaryConnectionString of the endpoint for key-based
     * authentication. Will be obfuscated during read.
     *
     * @param connectionStringPrimaryKey the connectionStringPrimaryKey value to set.
     * @return the EventHub object itself.
     */
    public EventHub withConnectionStringPrimaryKey(String connectionStringPrimaryKey) {
        this.connectionStringPrimaryKey = connectionStringPrimaryKey;
        return this;
    }

    /**
     * Get the connectionStringSecondaryKey property: SecondaryConnectionString of the endpoint for key-based
     * authentication. Will be obfuscated during read.
     *
     * @return the connectionStringSecondaryKey value.
     */
    public String connectionStringSecondaryKey() {
        return this.connectionStringSecondaryKey;
    }

    /**
     * Set the connectionStringSecondaryKey property: SecondaryConnectionString of the endpoint for key-based
     * authentication. Will be obfuscated during read.
     *
     * @param connectionStringSecondaryKey the connectionStringSecondaryKey value to set.
     * @return the EventHub object itself.
     */
    public EventHub withConnectionStringSecondaryKey(String connectionStringSecondaryKey) {
        this.connectionStringSecondaryKey = connectionStringSecondaryKey;
        return this;
    }

    /**
     * Get the endpointUri property: The URL of the EventHub namespace for identity-based authentication. It must
     * include the protocol 'sb://'.
     *
     * @return the endpointUri value.
     */
    public String endpointUri() {
        return this.endpointUri;
    }

    /**
     * Set the endpointUri property: The URL of the EventHub namespace for identity-based authentication. It must
     * include the protocol 'sb://'.
     *
     * @param endpointUri the endpointUri value to set.
     * @return the EventHub object itself.
     */
    public EventHub withEndpointUri(String endpointUri) {
        this.endpointUri = endpointUri;
        return this;
    }

    /**
     * Get the entityPath property: The EventHub name in the EventHub namespace for identity-based authentication.
     *
     * @return the entityPath value.
     */
    public String entityPath() {
        return this.entityPath;
    }

    /**
     * Set the entityPath property: The EventHub name in the EventHub namespace for identity-based authentication.
     *
     * @param entityPath the entityPath value to set.
     * @return the EventHub object itself.
     */
    public EventHub withEntityPath(String entityPath) {
        this.entityPath = entityPath;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EventHub withAuthenticationType(AuthenticationType authenticationType) {
        super.withAuthenticationType(authenticationType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EventHub withDeadLetterSecret(String deadLetterSecret) {
        super.withDeadLetterSecret(deadLetterSecret);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EventHub withDeadLetterUri(String deadLetterUri) {
        super.withDeadLetterUri(deadLetterUri);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
