// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SKU of a public IP address. */
@Fluent
public final class PublicIpAddressSku {
    /*
     * Name of a public IP address SKU.
     */
    @JsonProperty(value = "name")
    private PublicIpAddressSkuName name;

    /*
     * Tier of a public IP address SKU.
     */
    @JsonProperty(value = "tier")
    private PublicIpAddressSkuTier tier;

    /**
     * Get the name property: Name of a public IP address SKU.
     *
     * @return the name value.
     */
    public PublicIpAddressSkuName name() {
        return this.name;
    }

    /**
     * Set the name property: Name of a public IP address SKU.
     *
     * @param name the name value to set.
     * @return the PublicIpAddressSku object itself.
     */
    public PublicIpAddressSku withName(PublicIpAddressSkuName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier property: Tier of a public IP address SKU.
     *
     * @return the tier value.
     */
    public PublicIpAddressSkuTier tier() {
        return this.tier;
    }

    /**
     * Set the tier property: Tier of a public IP address SKU.
     *
     * @param tier the tier value to set.
     * @return the PublicIpAddressSku object itself.
     */
    public PublicIpAddressSku withTier(PublicIpAddressSkuTier tier) {
        this.tier = tier;
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
