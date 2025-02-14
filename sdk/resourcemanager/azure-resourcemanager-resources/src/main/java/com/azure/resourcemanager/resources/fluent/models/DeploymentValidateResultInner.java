// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.exception.ManagementError;
import com.azure.resourcemanager.resources.models.DeploymentPropertiesExtended;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information from validate template deployment response. */
@Fluent
public final class DeploymentValidateResultInner {
    /*
     * Error Response The deployment validation error.
     */
    @JsonProperty(value = "error", access = JsonProperty.Access.WRITE_ONLY)
    private ManagementError error;

    /*
     * The template deployment properties.
     */
    @JsonProperty(value = "properties")
    private DeploymentPropertiesExtended properties;

    /**
     * Get the error property: Error Response The deployment validation error.
     *
     * @return the error value.
     */
    public ManagementError error() {
        return this.error;
    }

    /**
     * Get the properties property: The template deployment properties.
     *
     * @return the properties value.
     */
    public DeploymentPropertiesExtended properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The template deployment properties.
     *
     * @param properties the properties value to set.
     * @return the DeploymentValidateResultInner object itself.
     */
    public DeploymentValidateResultInner withProperties(DeploymentPropertiesExtended properties) {
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
