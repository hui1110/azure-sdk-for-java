// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceprovisioningservices.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.deviceprovisioningservices.fluent.models.CertificateResponseInner;
import com.azure.resourcemanager.deviceprovisioningservices.models.CertificateBodyDescription;
import com.azure.resourcemanager.deviceprovisioningservices.models.CertificateProperties;
import com.azure.resourcemanager.deviceprovisioningservices.models.CertificateResponse;

public final class CertificateResponseImpl
    implements CertificateResponse, CertificateResponse.Definition, CertificateResponse.Update {
    private CertificateResponseInner innerObject;

    private final com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public CertificateProperties properties() {
        return this.innerModel().properties();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public CertificateResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String provisioningServiceName;

    private String certificateName;

    private String createIfMatch;

    private CertificateBodyDescription createCertificateDescription;

    private String updateIfMatch;

    private CertificateBodyDescription updateCertificateDescription;

    public CertificateResponseImpl withExistingProvisioningService(
        String resourceGroupName, String provisioningServiceName) {
        this.resourceGroupName = resourceGroupName;
        this.provisioningServiceName = provisioningServiceName;
        return this;
    }

    public CertificateResponse create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDpsCertificates()
                .createOrUpdateWithResponse(
                    resourceGroupName,
                    provisioningServiceName,
                    certificateName,
                    createCertificateDescription,
                    createIfMatch,
                    Context.NONE)
                .getValue();
        return this;
    }

    public CertificateResponse create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDpsCertificates()
                .createOrUpdateWithResponse(
                    resourceGroupName,
                    provisioningServiceName,
                    certificateName,
                    createCertificateDescription,
                    createIfMatch,
                    context)
                .getValue();
        return this;
    }

    CertificateResponseImpl(
        String name, com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager serviceManager) {
        this.innerObject = new CertificateResponseInner();
        this.serviceManager = serviceManager;
        this.certificateName = name;
        this.createIfMatch = null;
        this.createCertificateDescription = new CertificateBodyDescription();
    }

    public CertificateResponseImpl update() {
        this.updateIfMatch = null;
        this.updateCertificateDescription = new CertificateBodyDescription();
        return this;
    }

    public CertificateResponse apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDpsCertificates()
                .createOrUpdateWithResponse(
                    resourceGroupName,
                    provisioningServiceName,
                    certificateName,
                    updateCertificateDescription,
                    updateIfMatch,
                    Context.NONE)
                .getValue();
        return this;
    }

    public CertificateResponse apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDpsCertificates()
                .createOrUpdateWithResponse(
                    resourceGroupName,
                    provisioningServiceName,
                    certificateName,
                    updateCertificateDescription,
                    updateIfMatch,
                    context)
                .getValue();
        return this;
    }

    CertificateResponseImpl(
        CertificateResponseInner innerObject,
        com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.provisioningServiceName = Utils.getValueFromIdByName(innerObject.id(), "provisioningServices");
        this.certificateName = Utils.getValueFromIdByName(innerObject.id(), "certificates");
    }

    public CertificateResponse refresh() {
        String localIfMatch = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDpsCertificates()
                .getWithResponse(
                    certificateName, resourceGroupName, provisioningServiceName, localIfMatch, Context.NONE)
                .getValue();
        return this;
    }

    public CertificateResponse refresh(Context context) {
        String localIfMatch = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDpsCertificates()
                .getWithResponse(certificateName, resourceGroupName, provisioningServiceName, localIfMatch, context)
                .getValue();
        return this;
    }

    public CertificateResponseImpl withCertificate(String certificate) {
        if (isInCreateMode()) {
            this.createCertificateDescription.withCertificate(certificate);
            return this;
        } else {
            this.updateCertificateDescription.withCertificate(certificate);
            return this;
        }
    }

    public CertificateResponseImpl withIsVerified(Boolean isVerified) {
        if (isInCreateMode()) {
            this.createCertificateDescription.withIsVerified(isVerified);
            return this;
        } else {
            this.updateCertificateDescription.withIsVerified(isVerified);
            return this;
        }
    }

    public CertificateResponseImpl withIfMatch(String ifMatch) {
        if (isInCreateMode()) {
            this.createIfMatch = ifMatch;
            return this;
        } else {
            this.updateIfMatch = ifMatch;
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
