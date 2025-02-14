// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.Context;

/** Samples for ContainerAppsRevisions ActivateRevision. */
public final class ContainerAppsRevisionsActivateRevisionSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/preview/2022-01-01-preview/examples/Revisions_Activate.json
     */
    /**
     * Sample code: Activate Container App's revision.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void activateContainerAppSRevision(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .containerAppsRevisions()
            .activateRevisionWithResponse("rg", "testcontainerApp0", "testcontainerApp0-pjxhsye", Context.NONE);
    }
}
