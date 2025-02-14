// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Amazon S3 Compatible linked service properties. */
@Fluent
public final class AmazonS3CompatibleLinkedServiceTypeProperties {
    /*
     * The access key identifier of the Amazon S3 Compatible Identity and
     * Access Management (IAM) user. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "accessKeyId")
    private Object accessKeyId;

    /*
     * The secret access key of the Amazon S3 Compatible Identity and Access
     * Management (IAM) user.
     */
    @JsonProperty(value = "secretAccessKey")
    private SecretBase secretAccessKey;

    /*
     * This value specifies the endpoint to access with the Amazon S3
     * Compatible Connector. This is an optional property; change it only if
     * you want to try a different service endpoint or want to switch between
     * https and http. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "serviceUrl")
    private Object serviceUrl;

    /*
     * If true, use S3 path-style access instead of virtual hosted-style
     * access. Default value is false. Type: boolean (or Expression with
     * resultType boolean).
     */
    @JsonProperty(value = "forcePathStyle")
    private Object forcePathStyle;

    /*
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the accessKeyId property: The access key identifier of the Amazon S3 Compatible Identity and Access
     * Management (IAM) user. Type: string (or Expression with resultType string).
     *
     * @return the accessKeyId value.
     */
    public Object accessKeyId() {
        return this.accessKeyId;
    }

    /**
     * Set the accessKeyId property: The access key identifier of the Amazon S3 Compatible Identity and Access
     * Management (IAM) user. Type: string (or Expression with resultType string).
     *
     * @param accessKeyId the accessKeyId value to set.
     * @return the AmazonS3CompatibleLinkedServiceTypeProperties object itself.
     */
    public AmazonS3CompatibleLinkedServiceTypeProperties withAccessKeyId(Object accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }

    /**
     * Get the secretAccessKey property: The secret access key of the Amazon S3 Compatible Identity and Access
     * Management (IAM) user.
     *
     * @return the secretAccessKey value.
     */
    public SecretBase secretAccessKey() {
        return this.secretAccessKey;
    }

    /**
     * Set the secretAccessKey property: The secret access key of the Amazon S3 Compatible Identity and Access
     * Management (IAM) user.
     *
     * @param secretAccessKey the secretAccessKey value to set.
     * @return the AmazonS3CompatibleLinkedServiceTypeProperties object itself.
     */
    public AmazonS3CompatibleLinkedServiceTypeProperties withSecretAccessKey(SecretBase secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
        return this;
    }

    /**
     * Get the serviceUrl property: This value specifies the endpoint to access with the Amazon S3 Compatible Connector.
     * This is an optional property; change it only if you want to try a different service endpoint or want to switch
     * between https and http. Type: string (or Expression with resultType string).
     *
     * @return the serviceUrl value.
     */
    public Object serviceUrl() {
        return this.serviceUrl;
    }

    /**
     * Set the serviceUrl property: This value specifies the endpoint to access with the Amazon S3 Compatible Connector.
     * This is an optional property; change it only if you want to try a different service endpoint or want to switch
     * between https and http. Type: string (or Expression with resultType string).
     *
     * @param serviceUrl the serviceUrl value to set.
     * @return the AmazonS3CompatibleLinkedServiceTypeProperties object itself.
     */
    public AmazonS3CompatibleLinkedServiceTypeProperties withServiceUrl(Object serviceUrl) {
        this.serviceUrl = serviceUrl;
        return this;
    }

    /**
     * Get the forcePathStyle property: If true, use S3 path-style access instead of virtual hosted-style access.
     * Default value is false. Type: boolean (or Expression with resultType boolean).
     *
     * @return the forcePathStyle value.
     */
    public Object forcePathStyle() {
        return this.forcePathStyle;
    }

    /**
     * Set the forcePathStyle property: If true, use S3 path-style access instead of virtual hosted-style access.
     * Default value is false. Type: boolean (or Expression with resultType boolean).
     *
     * @param forcePathStyle the forcePathStyle value to set.
     * @return the AmazonS3CompatibleLinkedServiceTypeProperties object itself.
     */
    public AmazonS3CompatibleLinkedServiceTypeProperties withForcePathStyle(Object forcePathStyle) {
        this.forcePathStyle = forcePathStyle;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the AmazonS3CompatibleLinkedServiceTypeProperties object itself.
     */
    public AmazonS3CompatibleLinkedServiceTypeProperties withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (secretAccessKey() != null) {
            secretAccessKey().validate();
        }
    }
}
