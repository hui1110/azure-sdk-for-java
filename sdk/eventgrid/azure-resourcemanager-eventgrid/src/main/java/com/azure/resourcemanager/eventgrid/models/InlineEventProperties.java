// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Additional information about every inline event. */
@Fluent
public final class InlineEventProperties {
    /*
     * The description for the inline event.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The documentationUrl for the inline event.
     */
    @JsonProperty(value = "documentationUrl")
    private String documentationUrl;

    /*
     * The dataSchemaUrl for the inline event.
     */
    @JsonProperty(value = "dataSchemaUrl")
    private String dataSchemaUrl;

    /**
     * Get the description property: The description for the inline event.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description for the inline event.
     *
     * @param description the description value to set.
     * @return the InlineEventProperties object itself.
     */
    public InlineEventProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the documentationUrl property: The documentationUrl for the inline event.
     *
     * @return the documentationUrl value.
     */
    public String documentationUrl() {
        return this.documentationUrl;
    }

    /**
     * Set the documentationUrl property: The documentationUrl for the inline event.
     *
     * @param documentationUrl the documentationUrl value to set.
     * @return the InlineEventProperties object itself.
     */
    public InlineEventProperties withDocumentationUrl(String documentationUrl) {
        this.documentationUrl = documentationUrl;
        return this;
    }

    /**
     * Get the dataSchemaUrl property: The dataSchemaUrl for the inline event.
     *
     * @return the dataSchemaUrl value.
     */
    public String dataSchemaUrl() {
        return this.dataSchemaUrl;
    }

    /**
     * Set the dataSchemaUrl property: The dataSchemaUrl for the inline event.
     *
     * @param dataSchemaUrl the dataSchemaUrl value to set.
     * @return the InlineEventProperties object itself.
     */
    public InlineEventProperties withDataSchemaUrl(String dataSchemaUrl) {
        this.dataSchemaUrl = dataSchemaUrl;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
