// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Azure storage specific error information. */
@Fluent
public final class AzureStorageErrorInfo {
    /*
     * Error code.
     */
    @JsonProperty(value = "errorCode")
    private Integer errorCode;

    /*
     * Localized error string.
     */
    @JsonProperty(value = "errorString")
    private String errorString;

    /*
     * List of localized recommendations for above error code.
     */
    @JsonProperty(value = "recommendations")
    private List<String> recommendations;

    /**
     * Get the errorCode property: Error code.
     *
     * @return the errorCode value.
     */
    public Integer errorCode() {
        return this.errorCode;
    }

    /**
     * Set the errorCode property: Error code.
     *
     * @param errorCode the errorCode value to set.
     * @return the AzureStorageErrorInfo object itself.
     */
    public AzureStorageErrorInfo withErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Get the errorString property: Localized error string.
     *
     * @return the errorString value.
     */
    public String errorString() {
        return this.errorString;
    }

    /**
     * Set the errorString property: Localized error string.
     *
     * @param errorString the errorString value to set.
     * @return the AzureStorageErrorInfo object itself.
     */
    public AzureStorageErrorInfo withErrorString(String errorString) {
        this.errorString = errorString;
        return this;
    }

    /**
     * Get the recommendations property: List of localized recommendations for above error code.
     *
     * @return the recommendations value.
     */
    public List<String> recommendations() {
        return this.recommendations;
    }

    /**
     * Set the recommendations property: List of localized recommendations for above error code.
     *
     * @param recommendations the recommendations value to set.
     * @return the AzureStorageErrorInfo object itself.
     */
    public AzureStorageErrorInfo withRecommendations(List<String> recommendations) {
        this.recommendations = recommendations;
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
