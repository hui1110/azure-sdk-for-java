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

/** configurationManagerClientEnabledFeatures configuration Manager client enabled features. */
@Fluent
public final class MicrosoftGraphConfigurationManagerClientEnabledFeatures {
    /*
     * Whether compliance policy is managed by Intune
     */
    @JsonProperty(value = "compliancePolicy")
    private Boolean compliancePolicy;

    /*
     * Whether device configuration is managed by Intune
     */
    @JsonProperty(value = "deviceConfiguration")
    private Boolean deviceConfiguration;

    /*
     * Whether inventory is managed by Intune
     */
    @JsonProperty(value = "inventory")
    private Boolean inventory;

    /*
     * Whether modern application is managed by Intune
     */
    @JsonProperty(value = "modernApps")
    private Boolean modernApps;

    /*
     * Whether resource access is managed by Intune
     */
    @JsonProperty(value = "resourceAccess")
    private Boolean resourceAccess;

    /*
     * Whether Windows Update for Business is managed by Intune
     */
    @JsonProperty(value = "windowsUpdateForBusiness")
    private Boolean windowsUpdateForBusiness;

    /*
     * configuration Manager client enabled features
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the compliancePolicy property: Whether compliance policy is managed by Intune.
     *
     * @return the compliancePolicy value.
     */
    public Boolean compliancePolicy() {
        return this.compliancePolicy;
    }

    /**
     * Set the compliancePolicy property: Whether compliance policy is managed by Intune.
     *
     * @param compliancePolicy the compliancePolicy value to set.
     * @return the MicrosoftGraphConfigurationManagerClientEnabledFeatures object itself.
     */
    public MicrosoftGraphConfigurationManagerClientEnabledFeatures withCompliancePolicy(Boolean compliancePolicy) {
        this.compliancePolicy = compliancePolicy;
        return this;
    }

    /**
     * Get the deviceConfiguration property: Whether device configuration is managed by Intune.
     *
     * @return the deviceConfiguration value.
     */
    public Boolean deviceConfiguration() {
        return this.deviceConfiguration;
    }

    /**
     * Set the deviceConfiguration property: Whether device configuration is managed by Intune.
     *
     * @param deviceConfiguration the deviceConfiguration value to set.
     * @return the MicrosoftGraphConfigurationManagerClientEnabledFeatures object itself.
     */
    public MicrosoftGraphConfigurationManagerClientEnabledFeatures withDeviceConfiguration(
        Boolean deviceConfiguration) {
        this.deviceConfiguration = deviceConfiguration;
        return this;
    }

    /**
     * Get the inventory property: Whether inventory is managed by Intune.
     *
     * @return the inventory value.
     */
    public Boolean inventory() {
        return this.inventory;
    }

    /**
     * Set the inventory property: Whether inventory is managed by Intune.
     *
     * @param inventory the inventory value to set.
     * @return the MicrosoftGraphConfigurationManagerClientEnabledFeatures object itself.
     */
    public MicrosoftGraphConfigurationManagerClientEnabledFeatures withInventory(Boolean inventory) {
        this.inventory = inventory;
        return this;
    }

    /**
     * Get the modernApps property: Whether modern application is managed by Intune.
     *
     * @return the modernApps value.
     */
    public Boolean modernApps() {
        return this.modernApps;
    }

    /**
     * Set the modernApps property: Whether modern application is managed by Intune.
     *
     * @param modernApps the modernApps value to set.
     * @return the MicrosoftGraphConfigurationManagerClientEnabledFeatures object itself.
     */
    public MicrosoftGraphConfigurationManagerClientEnabledFeatures withModernApps(Boolean modernApps) {
        this.modernApps = modernApps;
        return this;
    }

    /**
     * Get the resourceAccess property: Whether resource access is managed by Intune.
     *
     * @return the resourceAccess value.
     */
    public Boolean resourceAccess() {
        return this.resourceAccess;
    }

    /**
     * Set the resourceAccess property: Whether resource access is managed by Intune.
     *
     * @param resourceAccess the resourceAccess value to set.
     * @return the MicrosoftGraphConfigurationManagerClientEnabledFeatures object itself.
     */
    public MicrosoftGraphConfigurationManagerClientEnabledFeatures withResourceAccess(Boolean resourceAccess) {
        this.resourceAccess = resourceAccess;
        return this;
    }

    /**
     * Get the windowsUpdateForBusiness property: Whether Windows Update for Business is managed by Intune.
     *
     * @return the windowsUpdateForBusiness value.
     */
    public Boolean windowsUpdateForBusiness() {
        return this.windowsUpdateForBusiness;
    }

    /**
     * Set the windowsUpdateForBusiness property: Whether Windows Update for Business is managed by Intune.
     *
     * @param windowsUpdateForBusiness the windowsUpdateForBusiness value to set.
     * @return the MicrosoftGraphConfigurationManagerClientEnabledFeatures object itself.
     */
    public MicrosoftGraphConfigurationManagerClientEnabledFeatures withWindowsUpdateForBusiness(
        Boolean windowsUpdateForBusiness) {
        this.windowsUpdateForBusiness = windowsUpdateForBusiness;
        return this;
    }

    /**
     * Get the additionalProperties property: configuration Manager client enabled features.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: configuration Manager client enabled features.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphConfigurationManagerClientEnabledFeatures object itself.
     */
    public MicrosoftGraphConfigurationManagerClientEnabledFeatures withAdditionalProperties(
        Map<String, Object> additionalProperties) {
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
