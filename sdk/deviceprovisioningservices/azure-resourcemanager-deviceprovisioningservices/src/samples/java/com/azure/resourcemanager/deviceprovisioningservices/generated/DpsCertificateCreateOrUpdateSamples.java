// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceprovisioningservices.generated;

/** Samples for DpsCertificate CreateOrUpdate. */
public final class DpsCertificateCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/deviceprovisioningservices/resource-manager/Microsoft.Devices/stable/2021-10-15/examples/DPSCertificateCreateOrUpdate.json
     */
    /**
     * Sample code: DPSCreateOrUpdateCertificate.
     *
     * @param manager Entry point to IotDpsManager.
     */
    public static void dPSCreateOrUpdateCertificate(
        com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager manager) {
        manager
            .dpsCertificates()
            .define("cert")
            .withExistingProvisioningService("myResourceGroup", "myFirstProvisioningService")
            .withCertificate("############################################")
            .create();
    }
}
