// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.exception.ManagementError;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The current status of an async operation. */
@Fluent
public final class OperationStatusResultInner {
    /*
     * Fully qualified ID for the async operation.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Name of the async operation.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Operation status.
     */
    @JsonProperty(value = "status", required = true)
    private String status;

    /*
     * Additional information, if available.
     */
    @JsonProperty(value = "properties")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> properties;

    /*
     * If present, details of the operation error.
     */
    @JsonProperty(value = "error", access = JsonProperty.Access.WRITE_ONLY)
    private ManagementError error;

    /**
     * Get the id property: Fully qualified ID for the async operation.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Fully qualified ID for the async operation.
     *
     * @param id the id value to set.
     * @return the OperationStatusResultInner object itself.
     */
    public OperationStatusResultInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: Name of the async operation.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the async operation.
     *
     * @param name the name value to set.
     * @return the OperationStatusResultInner object itself.
     */
    public OperationStatusResultInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the status property: Operation status.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: Operation status.
     *
     * @param status the status value to set.
     * @return the OperationStatusResultInner object itself.
     */
    public OperationStatusResultInner withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the properties property: Additional information, if available.
     *
     * @return the properties value.
     */
    public Map<String, String> properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Additional information, if available.
     *
     * @param properties the properties value to set.
     * @return the OperationStatusResultInner object itself.
     */
    public OperationStatusResultInner withProperties(Map<String, String> properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the error property: If present, details of the operation error.
     *
     * @return the error value.
     */
    public ManagementError error() {
        return this.error;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (status() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property status in model OperationStatusResultInner"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(OperationStatusResultInner.class);
}
