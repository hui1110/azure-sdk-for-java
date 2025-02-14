// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** teamsTabConfiguration. */
@Fluent
public final class MicrosoftGraphTeamsTabConfiguration {
    /*
     * Url used for rendering tab contents in Teams. Required.
     */
    @JsonProperty(value = "contentUrl")
    private String contentUrl;

    /*
     * Identifier for the entity hosted by the tab provider.
     */
    @JsonProperty(value = "entityId")
    private String entityId;

    /*
     * Url called by Teams client when a Tab is removed using the Teams Client.
     */
    @JsonProperty(value = "removeUrl")
    private String removeUrl;

    /*
     * Url for showing tab contents outside of Teams.
     */
    @JsonProperty(value = "websiteUrl")
    private String websiteUrl;

    /*
     * teamsTabConfiguration
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the contentUrl property: Url used for rendering tab contents in Teams. Required.
     *
     * @return the contentUrl value.
     */
    public String contentUrl() {
        return this.contentUrl;
    }

    /**
     * Set the contentUrl property: Url used for rendering tab contents in Teams. Required.
     *
     * @param contentUrl the contentUrl value to set.
     * @return the MicrosoftGraphTeamsTabConfiguration object itself.
     */
    public MicrosoftGraphTeamsTabConfiguration withContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
        return this;
    }

    /**
     * Get the entityId property: Identifier for the entity hosted by the tab provider.
     *
     * @return the entityId value.
     */
    public String entityId() {
        return this.entityId;
    }

    /**
     * Set the entityId property: Identifier for the entity hosted by the tab provider.
     *
     * @param entityId the entityId value to set.
     * @return the MicrosoftGraphTeamsTabConfiguration object itself.
     */
    public MicrosoftGraphTeamsTabConfiguration withEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * Get the removeUrl property: Url called by Teams client when a Tab is removed using the Teams Client.
     *
     * @return the removeUrl value.
     */
    public String removeUrl() {
        return this.removeUrl;
    }

    /**
     * Set the removeUrl property: Url called by Teams client when a Tab is removed using the Teams Client.
     *
     * @param removeUrl the removeUrl value to set.
     * @return the MicrosoftGraphTeamsTabConfiguration object itself.
     */
    public MicrosoftGraphTeamsTabConfiguration withRemoveUrl(String removeUrl) {
        this.removeUrl = removeUrl;
        return this;
    }

    /**
     * Get the websiteUrl property: Url for showing tab contents outside of Teams.
     *
     * @return the websiteUrl value.
     */
    public String websiteUrl() {
        return this.websiteUrl;
    }

    /**
     * Set the websiteUrl property: Url for showing tab contents outside of Teams.
     *
     * @param websiteUrl the websiteUrl value to set.
     * @return the MicrosoftGraphTeamsTabConfiguration object itself.
     */
    public MicrosoftGraphTeamsTabConfiguration withWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
        return this;
    }

    /**
     * Get the additionalProperties property: teamsTabConfiguration.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: teamsTabConfiguration.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphTeamsTabConfiguration object itself.
     */
    public MicrosoftGraphTeamsTabConfiguration withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
