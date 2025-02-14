// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Virtual Network Tap properties. */
@Fluent
public final class VirtualNetworkTapPropertiesFormatInner {
    /*
     * Specifies the list of resource IDs for the network interface IP
     * configuration that needs to be tapped.
     */
    @JsonProperty(value = "networkInterfaceTapConfigurations", access = JsonProperty.Access.WRITE_ONLY)
    private List<NetworkInterfaceTapConfigurationInner> networkInterfaceTapConfigurations;

    /*
     * The resource GUID property of the virtual network tap resource.
     */
    @JsonProperty(value = "resourceGuid", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGuid;

    /*
     * The provisioning state of the virtual network tap resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The reference to the private IP Address of the collector nic that will
     * receive the tap.
     */
    @JsonProperty(value = "destinationNetworkInterfaceIPConfiguration")
    private NetworkInterfaceIpConfigurationInner destinationNetworkInterfaceIpConfiguration;

    /*
     * The reference to the private IP address on the internal Load Balancer
     * that will receive the tap.
     */
    @JsonProperty(value = "destinationLoadBalancerFrontEndIPConfiguration")
    private FrontendIpConfigurationInner destinationLoadBalancerFrontEndIpConfiguration;

    /*
     * The VXLAN destination port that will receive the tapped traffic.
     */
    @JsonProperty(value = "destinationPort")
    private Integer destinationPort;

    /**
     * Get the networkInterfaceTapConfigurations property: Specifies the list of resource IDs for the network interface
     * IP configuration that needs to be tapped.
     *
     * @return the networkInterfaceTapConfigurations value.
     */
    public List<NetworkInterfaceTapConfigurationInner> networkInterfaceTapConfigurations() {
        return this.networkInterfaceTapConfigurations;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the virtual network tap resource.
     *
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Get the provisioningState property: The provisioning state of the virtual network tap resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the destinationNetworkInterfaceIpConfiguration property: The reference to the private IP Address of the
     * collector nic that will receive the tap.
     *
     * @return the destinationNetworkInterfaceIpConfiguration value.
     */
    public NetworkInterfaceIpConfigurationInner destinationNetworkInterfaceIpConfiguration() {
        return this.destinationNetworkInterfaceIpConfiguration;
    }

    /**
     * Set the destinationNetworkInterfaceIpConfiguration property: The reference to the private IP Address of the
     * collector nic that will receive the tap.
     *
     * @param destinationNetworkInterfaceIpConfiguration the destinationNetworkInterfaceIpConfiguration value to set.
     * @return the VirtualNetworkTapPropertiesFormatInner object itself.
     */
    public VirtualNetworkTapPropertiesFormatInner withDestinationNetworkInterfaceIpConfiguration(
        NetworkInterfaceIpConfigurationInner destinationNetworkInterfaceIpConfiguration) {
        this.destinationNetworkInterfaceIpConfiguration = destinationNetworkInterfaceIpConfiguration;
        return this;
    }

    /**
     * Get the destinationLoadBalancerFrontEndIpConfiguration property: The reference to the private IP address on the
     * internal Load Balancer that will receive the tap.
     *
     * @return the destinationLoadBalancerFrontEndIpConfiguration value.
     */
    public FrontendIpConfigurationInner destinationLoadBalancerFrontEndIpConfiguration() {
        return this.destinationLoadBalancerFrontEndIpConfiguration;
    }

    /**
     * Set the destinationLoadBalancerFrontEndIpConfiguration property: The reference to the private IP address on the
     * internal Load Balancer that will receive the tap.
     *
     * @param destinationLoadBalancerFrontEndIpConfiguration the destinationLoadBalancerFrontEndIpConfiguration value to
     *     set.
     * @return the VirtualNetworkTapPropertiesFormatInner object itself.
     */
    public VirtualNetworkTapPropertiesFormatInner withDestinationLoadBalancerFrontEndIpConfiguration(
        FrontendIpConfigurationInner destinationLoadBalancerFrontEndIpConfiguration) {
        this.destinationLoadBalancerFrontEndIpConfiguration = destinationLoadBalancerFrontEndIpConfiguration;
        return this;
    }

    /**
     * Get the destinationPort property: The VXLAN destination port that will receive the tapped traffic.
     *
     * @return the destinationPort value.
     */
    public Integer destinationPort() {
        return this.destinationPort;
    }

    /**
     * Set the destinationPort property: The VXLAN destination port that will receive the tapped traffic.
     *
     * @param destinationPort the destinationPort value to set.
     * @return the VirtualNetworkTapPropertiesFormatInner object itself.
     */
    public VirtualNetworkTapPropertiesFormatInner withDestinationPort(Integer destinationPort) {
        this.destinationPort = destinationPort;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (networkInterfaceTapConfigurations() != null) {
            networkInterfaceTapConfigurations().forEach(e -> e.validate());
        }
        if (destinationNetworkInterfaceIpConfiguration() != null) {
            destinationNetworkInterfaceIpConfiguration().validate();
        }
        if (destinationLoadBalancerFrontEndIpConfiguration() != null) {
            destinationLoadBalancerFrontEndIpConfiguration().validate();
        }
    }
}
