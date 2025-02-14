// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appcontainers.models.AppLogsConfiguration;
import com.azure.resourcemanager.appcontainers.models.EnvironmentProvisioningState;
import com.azure.resourcemanager.appcontainers.models.VnetConfiguration;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Managed environment resource specific properties. */
@Fluent
public final class ManagedEnvironmentProperties {
    /*
     * Provisioning state of the Environment.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private EnvironmentProvisioningState provisioningState;

    /*
     * Azure Monitor instrumentation key used by Dapr to export Service to
     * Service communication telemetry
     */
    @JsonProperty(value = "daprAIInstrumentationKey")
    private String daprAIInstrumentationKey;

    /*
     * Vnet configuration for the environment
     */
    @JsonProperty(value = "vnetConfiguration")
    private VnetConfiguration vnetConfiguration;

    /*
     * Any errors that occurred during deployment or deployment validation
     */
    @JsonProperty(value = "deploymentErrors", access = JsonProperty.Access.WRITE_ONLY)
    private String deploymentErrors;

    /*
     * Default Domain Name for the cluster
     */
    @JsonProperty(value = "defaultDomain", access = JsonProperty.Access.WRITE_ONLY)
    private String defaultDomain;

    /*
     * Static IP of the Environment
     */
    @JsonProperty(value = "staticIp", access = JsonProperty.Access.WRITE_ONLY)
    private String staticIp;

    /*
     * Cluster configuration which enables the log daemon to export
     * app logs to a destination. Currently only "log-analytics" is
     * supported
     */
    @JsonProperty(value = "appLogsConfiguration")
    private AppLogsConfiguration appLogsConfiguration;

    /**
     * Get the provisioningState property: Provisioning state of the Environment.
     *
     * @return the provisioningState value.
     */
    public EnvironmentProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the daprAIInstrumentationKey property: Azure Monitor instrumentation key used by Dapr to export Service to
     * Service communication telemetry.
     *
     * @return the daprAIInstrumentationKey value.
     */
    public String daprAIInstrumentationKey() {
        return this.daprAIInstrumentationKey;
    }

    /**
     * Set the daprAIInstrumentationKey property: Azure Monitor instrumentation key used by Dapr to export Service to
     * Service communication telemetry.
     *
     * @param daprAIInstrumentationKey the daprAIInstrumentationKey value to set.
     * @return the ManagedEnvironmentProperties object itself.
     */
    public ManagedEnvironmentProperties withDaprAIInstrumentationKey(String daprAIInstrumentationKey) {
        this.daprAIInstrumentationKey = daprAIInstrumentationKey;
        return this;
    }

    /**
     * Get the vnetConfiguration property: Vnet configuration for the environment.
     *
     * @return the vnetConfiguration value.
     */
    public VnetConfiguration vnetConfiguration() {
        return this.vnetConfiguration;
    }

    /**
     * Set the vnetConfiguration property: Vnet configuration for the environment.
     *
     * @param vnetConfiguration the vnetConfiguration value to set.
     * @return the ManagedEnvironmentProperties object itself.
     */
    public ManagedEnvironmentProperties withVnetConfiguration(VnetConfiguration vnetConfiguration) {
        this.vnetConfiguration = vnetConfiguration;
        return this;
    }

    /**
     * Get the deploymentErrors property: Any errors that occurred during deployment or deployment validation.
     *
     * @return the deploymentErrors value.
     */
    public String deploymentErrors() {
        return this.deploymentErrors;
    }

    /**
     * Get the defaultDomain property: Default Domain Name for the cluster.
     *
     * @return the defaultDomain value.
     */
    public String defaultDomain() {
        return this.defaultDomain;
    }

    /**
     * Get the staticIp property: Static IP of the Environment.
     *
     * @return the staticIp value.
     */
    public String staticIp() {
        return this.staticIp;
    }

    /**
     * Get the appLogsConfiguration property: Cluster configuration which enables the log daemon to export app logs to a
     * destination. Currently only "log-analytics" is supported.
     *
     * @return the appLogsConfiguration value.
     */
    public AppLogsConfiguration appLogsConfiguration() {
        return this.appLogsConfiguration;
    }

    /**
     * Set the appLogsConfiguration property: Cluster configuration which enables the log daemon to export app logs to a
     * destination. Currently only "log-analytics" is supported.
     *
     * @param appLogsConfiguration the appLogsConfiguration value to set.
     * @return the ManagedEnvironmentProperties object itself.
     */
    public ManagedEnvironmentProperties withAppLogsConfiguration(AppLogsConfiguration appLogsConfiguration) {
        this.appLogsConfiguration = appLogsConfiguration;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (vnetConfiguration() != null) {
            vnetConfiguration().validate();
        }
        if (appLogsConfiguration() != null) {
            appLogsConfiguration().validate();
        }
    }
}
