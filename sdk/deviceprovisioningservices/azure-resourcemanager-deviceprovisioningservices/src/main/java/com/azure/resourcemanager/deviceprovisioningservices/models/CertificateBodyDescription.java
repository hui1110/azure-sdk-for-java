// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceprovisioningservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The JSON-serialized X509 Certificate. */
@Fluent
public final class CertificateBodyDescription {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CertificateBodyDescription.class);

    /*
     * Base-64 representation of the X509 leaf certificate .cer file or just
     * .pem file content.
     */
    @JsonProperty(value = "certificate")
    private String certificate;

    /*
     * True indicates that the certificate will be created in verified state
     * and proof of possession will not be required.
     */
    @JsonProperty(value = "isVerified")
    private Boolean isVerified;

    /**
     * Get the certificate property: Base-64 representation of the X509 leaf certificate .cer file or just .pem file
     * content.
     *
     * @return the certificate value.
     */
    public String certificate() {
        return this.certificate;
    }

    /**
     * Set the certificate property: Base-64 representation of the X509 leaf certificate .cer file or just .pem file
     * content.
     *
     * @param certificate the certificate value to set.
     * @return the CertificateBodyDescription object itself.
     */
    public CertificateBodyDescription withCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * Get the isVerified property: True indicates that the certificate will be created in verified state and proof of
     * possession will not be required.
     *
     * @return the isVerified value.
     */
    public Boolean isVerified() {
        return this.isVerified;
    }

    /**
     * Set the isVerified property: True indicates that the certificate will be created in verified state and proof of
     * possession will not be required.
     *
     * @param isVerified the isVerified value to set.
     * @return the CertificateBodyDescription object itself.
     */
    public CertificateBodyDescription withIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
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
