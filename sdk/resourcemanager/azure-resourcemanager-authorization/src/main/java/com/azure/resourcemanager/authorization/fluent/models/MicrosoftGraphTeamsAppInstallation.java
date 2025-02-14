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

/** teamsAppInstallation. */
@Fluent
public class MicrosoftGraphTeamsAppInstallation extends MicrosoftGraphEntity {
    /*
     * teamsApp
     */
    @JsonProperty(value = "teamsApp")
    private MicrosoftGraphTeamsApp teamsApp;

    /*
     * teamsAppDefinition
     */
    @JsonProperty(value = "teamsAppDefinition")
    private MicrosoftGraphTeamsAppDefinition teamsAppDefinition;

    /*
     * teamsAppInstallation
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the teamsApp property: teamsApp.
     *
     * @return the teamsApp value.
     */
    public MicrosoftGraphTeamsApp teamsApp() {
        return this.teamsApp;
    }

    /**
     * Set the teamsApp property: teamsApp.
     *
     * @param teamsApp the teamsApp value to set.
     * @return the MicrosoftGraphTeamsAppInstallation object itself.
     */
    public MicrosoftGraphTeamsAppInstallation withTeamsApp(MicrosoftGraphTeamsApp teamsApp) {
        this.teamsApp = teamsApp;
        return this;
    }

    /**
     * Get the teamsAppDefinition property: teamsAppDefinition.
     *
     * @return the teamsAppDefinition value.
     */
    public MicrosoftGraphTeamsAppDefinition teamsAppDefinition() {
        return this.teamsAppDefinition;
    }

    /**
     * Set the teamsAppDefinition property: teamsAppDefinition.
     *
     * @param teamsAppDefinition the teamsAppDefinition value to set.
     * @return the MicrosoftGraphTeamsAppInstallation object itself.
     */
    public MicrosoftGraphTeamsAppInstallation withTeamsAppDefinition(
        MicrosoftGraphTeamsAppDefinition teamsAppDefinition) {
        this.teamsAppDefinition = teamsAppDefinition;
        return this;
    }

    /**
     * Get the additionalProperties property: teamsAppInstallation.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: teamsAppInstallation.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphTeamsAppInstallation object itself.
     */
    public MicrosoftGraphTeamsAppInstallation withAdditionalProperties(Map<String, Object> additionalProperties) {
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

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphTeamsAppInstallation withId(String id) {
        super.withId(id);
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
        if (teamsApp() != null) {
            teamsApp().validate();
        }
        if (teamsAppDefinition() != null) {
            teamsAppDefinition().validate();
        }
    }
}
