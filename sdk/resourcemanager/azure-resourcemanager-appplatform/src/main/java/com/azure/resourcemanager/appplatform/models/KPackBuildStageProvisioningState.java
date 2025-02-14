// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for KPackBuildStageProvisioningState. */
public final class KPackBuildStageProvisioningState extends ExpandableStringEnum<KPackBuildStageProvisioningState> {
    /** Static value NotStarted for KPackBuildStageProvisioningState. */
    public static final KPackBuildStageProvisioningState NOT_STARTED = fromString("NotStarted");

    /** Static value Running for KPackBuildStageProvisioningState. */
    public static final KPackBuildStageProvisioningState RUNNING = fromString("Running");

    /** Static value Succeeded for KPackBuildStageProvisioningState. */
    public static final KPackBuildStageProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for KPackBuildStageProvisioningState. */
    public static final KPackBuildStageProvisioningState FAILED = fromString("Failed");

    /**
     * Creates or finds a KPackBuildStageProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding KPackBuildStageProvisioningState.
     */
    @JsonCreator
    public static KPackBuildStageProvisioningState fromString(String name) {
        return fromString(name, KPackBuildStageProvisioningState.class);
    }

    /** @return known KPackBuildStageProvisioningState values. */
    public static Collection<KPackBuildStageProvisioningState> values() {
        return values(KPackBuildStageProvisioningState.class);
    }
}
