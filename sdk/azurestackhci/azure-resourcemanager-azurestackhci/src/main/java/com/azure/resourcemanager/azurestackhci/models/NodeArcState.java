// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for NodeArcState. */
public final class NodeArcState extends ExpandableStringEnum<NodeArcState> {
    /** Static value NotSpecified for NodeArcState. */
    public static final NodeArcState NOT_SPECIFIED = fromString("NotSpecified");

    /** Static value Error for NodeArcState. */
    public static final NodeArcState ERROR = fromString("Error");

    /** Static value Succeeded for NodeArcState. */
    public static final NodeArcState SUCCEEDED = fromString("Succeeded");

    /** Static value Canceled for NodeArcState. */
    public static final NodeArcState CANCELED = fromString("Canceled");

    /** Static value Failed for NodeArcState. */
    public static final NodeArcState FAILED = fromString("Failed");

    /** Static value Connected for NodeArcState. */
    public static final NodeArcState CONNECTED = fromString("Connected");

    /** Static value Disconnected for NodeArcState. */
    public static final NodeArcState DISCONNECTED = fromString("Disconnected");

    /** Static value Deleted for NodeArcState. */
    public static final NodeArcState DELETED = fromString("Deleted");

    /** Static value Creating for NodeArcState. */
    public static final NodeArcState CREATING = fromString("Creating");

    /** Static value Updating for NodeArcState. */
    public static final NodeArcState UPDATING = fromString("Updating");

    /** Static value Deleting for NodeArcState. */
    public static final NodeArcState DELETING = fromString("Deleting");

    /** Static value Moving for NodeArcState. */
    public static final NodeArcState MOVING = fromString("Moving");

    /**
     * Creates or finds a NodeArcState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding NodeArcState.
     */
    @JsonCreator
    public static NodeArcState fromString(String name) {
        return fromString(name, NodeArcState.class);
    }

    /** @return known NodeArcState values. */
    public static Collection<NodeArcState> values() {
        return values(NodeArcState.class);
    }
}
