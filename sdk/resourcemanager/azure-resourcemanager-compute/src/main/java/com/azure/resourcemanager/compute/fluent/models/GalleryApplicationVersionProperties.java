// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.models.GalleryApplicationVersionPropertiesProvisioningState;
import com.azure.resourcemanager.compute.models.GalleryApplicationVersionPublishingProfile;
import com.azure.resourcemanager.compute.models.ReplicationStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the properties of a gallery image version. */
@Fluent
public final class GalleryApplicationVersionProperties {
    /*
     * The publishing profile of a gallery image version.
     */
    @JsonProperty(value = "publishingProfile", required = true)
    private GalleryApplicationVersionPublishingProfile publishingProfile;

    /*
     * The current state of the gallery Application Version. The provisioning
     * state, which only appears in the response.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private GalleryApplicationVersionPropertiesProvisioningState provisioningState;

    /*
     * This is the replication status of the gallery image version.
     */
    @JsonProperty(value = "replicationStatus", access = JsonProperty.Access.WRITE_ONLY)
    private ReplicationStatus replicationStatus;

    /**
     * Get the publishingProfile property: The publishing profile of a gallery image version.
     *
     * @return the publishingProfile value.
     */
    public GalleryApplicationVersionPublishingProfile publishingProfile() {
        return this.publishingProfile;
    }

    /**
     * Set the publishingProfile property: The publishing profile of a gallery image version.
     *
     * @param publishingProfile the publishingProfile value to set.
     * @return the GalleryApplicationVersionProperties object itself.
     */
    public GalleryApplicationVersionProperties withPublishingProfile(
        GalleryApplicationVersionPublishingProfile publishingProfile) {
        this.publishingProfile = publishingProfile;
        return this;
    }

    /**
     * Get the provisioningState property: The current state of the gallery Application Version. The provisioning state,
     * which only appears in the response.
     *
     * @return the provisioningState value.
     */
    public GalleryApplicationVersionPropertiesProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the replicationStatus property: This is the replication status of the gallery image version.
     *
     * @return the replicationStatus value.
     */
    public ReplicationStatus replicationStatus() {
        return this.replicationStatus;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (publishingProfile() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property publishingProfile in model GalleryApplicationVersionProperties"));
        } else {
            publishingProfile().validate();
        }
        if (replicationStatus() != null) {
            replicationStatus().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(GalleryApplicationVersionProperties.class);
}
