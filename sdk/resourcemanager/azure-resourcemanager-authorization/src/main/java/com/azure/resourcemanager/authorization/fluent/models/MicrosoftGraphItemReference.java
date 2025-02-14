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

/** itemReference. */
@Fluent
public final class MicrosoftGraphItemReference {
    /*
     * Unique identifier of the drive instance that contains the item.
     * Read-only.
     */
    @JsonProperty(value = "driveId")
    private String driveId;

    /*
     * Identifies the type of drive. See [drive][] resource for values.
     */
    @JsonProperty(value = "driveType")
    private String driveType;

    /*
     * Unique identifier of the item in the drive. Read-only.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The name of the item being referenced. Read-only.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Path that can be used to navigate to the item. Read-only.
     */
    @JsonProperty(value = "path")
    private String path;

    /*
     * A unique identifier for a shared resource that can be accessed via the
     * [Shares][] API.
     */
    @JsonProperty(value = "shareId")
    private String shareId;

    /*
     * sharepointIds
     */
    @JsonProperty(value = "sharepointIds")
    private MicrosoftGraphSharepointIds sharepointIds;

    /*
     * The siteId property.
     */
    @JsonProperty(value = "siteId")
    private String siteId;

    /*
     * itemReference
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the driveId property: Unique identifier of the drive instance that contains the item. Read-only.
     *
     * @return the driveId value.
     */
    public String driveId() {
        return this.driveId;
    }

    /**
     * Set the driveId property: Unique identifier of the drive instance that contains the item. Read-only.
     *
     * @param driveId the driveId value to set.
     * @return the MicrosoftGraphItemReference object itself.
     */
    public MicrosoftGraphItemReference withDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }

    /**
     * Get the driveType property: Identifies the type of drive. See [drive][] resource for values.
     *
     * @return the driveType value.
     */
    public String driveType() {
        return this.driveType;
    }

    /**
     * Set the driveType property: Identifies the type of drive. See [drive][] resource for values.
     *
     * @param driveType the driveType value to set.
     * @return the MicrosoftGraphItemReference object itself.
     */
    public MicrosoftGraphItemReference withDriveType(String driveType) {
        this.driveType = driveType;
        return this;
    }

    /**
     * Get the id property: Unique identifier of the item in the drive. Read-only.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Unique identifier of the item in the drive. Read-only.
     *
     * @param id the id value to set.
     * @return the MicrosoftGraphItemReference object itself.
     */
    public MicrosoftGraphItemReference withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: The name of the item being referenced. Read-only.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the item being referenced. Read-only.
     *
     * @param name the name value to set.
     * @return the MicrosoftGraphItemReference object itself.
     */
    public MicrosoftGraphItemReference withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the path property: Path that can be used to navigate to the item. Read-only.
     *
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: Path that can be used to navigate to the item. Read-only.
     *
     * @param path the path value to set.
     * @return the MicrosoftGraphItemReference object itself.
     */
    public MicrosoftGraphItemReference withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the shareId property: A unique identifier for a shared resource that can be accessed via the [Shares][] API.
     *
     * @return the shareId value.
     */
    public String shareId() {
        return this.shareId;
    }

    /**
     * Set the shareId property: A unique identifier for a shared resource that can be accessed via the [Shares][] API.
     *
     * @param shareId the shareId value to set.
     * @return the MicrosoftGraphItemReference object itself.
     */
    public MicrosoftGraphItemReference withShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }

    /**
     * Get the sharepointIds property: sharepointIds.
     *
     * @return the sharepointIds value.
     */
    public MicrosoftGraphSharepointIds sharepointIds() {
        return this.sharepointIds;
    }

    /**
     * Set the sharepointIds property: sharepointIds.
     *
     * @param sharepointIds the sharepointIds value to set.
     * @return the MicrosoftGraphItemReference object itself.
     */
    public MicrosoftGraphItemReference withSharepointIds(MicrosoftGraphSharepointIds sharepointIds) {
        this.sharepointIds = sharepointIds;
        return this;
    }

    /**
     * Get the siteId property: The siteId property.
     *
     * @return the siteId value.
     */
    public String siteId() {
        return this.siteId;
    }

    /**
     * Set the siteId property: The siteId property.
     *
     * @param siteId the siteId value to set.
     * @return the MicrosoftGraphItemReference object itself.
     */
    public MicrosoftGraphItemReference withSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }

    /**
     * Get the additionalProperties property: itemReference.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: itemReference.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphItemReference object itself.
     */
    public MicrosoftGraphItemReference withAdditionalProperties(Map<String, Object> additionalProperties) {
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
        if (sharepointIds() != null) {
            sharepointIds().validate();
        }
    }
}
