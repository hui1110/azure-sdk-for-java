// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.WebActivityAuthentication;
import com.azure.resourcemanager.datafactory.models.WebhookActivityMethod;
import com.fasterxml.jackson.annotation.JsonProperty;

/** WebHook activity type properties. */
@Fluent
public final class WebhookActivityTypeProperties {
    /*
     * Rest API method for target endpoint.
     */
    @JsonProperty(value = "method", required = true)
    private WebhookActivityMethod method;

    /*
     * WebHook activity target endpoint and path. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "url", required = true)
    private Object url;

    /*
     * The timeout within which the webhook should be called back. If there is
     * no value specified, it defaults to 10 minutes. Type: string. Pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     */
    @JsonProperty(value = "timeout")
    private String timeout;

    /*
     * Represents the headers that will be sent to the request. For example, to
     * set the language and type on a request: "headers" : { "Accept-Language":
     * "en-us", "Content-Type": "application/json" }. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "headers")
    private Object headers;

    /*
     * Represents the payload that will be sent to the endpoint. Required for
     * POST/PUT method, not allowed for GET method Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "body")
    private Object body;

    /*
     * Authentication method used for calling the endpoint.
     */
    @JsonProperty(value = "authentication")
    private WebActivityAuthentication authentication;

    /*
     * When set to true, statusCode, output and error in callback request body
     * will be consumed by activity. The activity can be marked as failed by
     * setting statusCode >= 400 in callback request. Default is false. Type:
     * boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "reportStatusOnCallBack")
    private Object reportStatusOnCallBack;

    /**
     * Get the method property: Rest API method for target endpoint.
     *
     * @return the method value.
     */
    public WebhookActivityMethod method() {
        return this.method;
    }

    /**
     * Set the method property: Rest API method for target endpoint.
     *
     * @param method the method value to set.
     * @return the WebhookActivityTypeProperties object itself.
     */
    public WebhookActivityTypeProperties withMethod(WebhookActivityMethod method) {
        this.method = method;
        return this;
    }

    /**
     * Get the url property: WebHook activity target endpoint and path. Type: string (or Expression with resultType
     * string).
     *
     * @return the url value.
     */
    public Object url() {
        return this.url;
    }

    /**
     * Set the url property: WebHook activity target endpoint and path. Type: string (or Expression with resultType
     * string).
     *
     * @param url the url value to set.
     * @return the WebhookActivityTypeProperties object itself.
     */
    public WebhookActivityTypeProperties withUrl(Object url) {
        this.url = url;
        return this;
    }

    /**
     * Get the timeout property: The timeout within which the webhook should be called back. If there is no value
     * specified, it defaults to 10 minutes. Type: string. Pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @return the timeout value.
     */
    public String timeout() {
        return this.timeout;
    }

    /**
     * Set the timeout property: The timeout within which the webhook should be called back. If there is no value
     * specified, it defaults to 10 minutes. Type: string. Pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @param timeout the timeout value to set.
     * @return the WebhookActivityTypeProperties object itself.
     */
    public WebhookActivityTypeProperties withTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Get the headers property: Represents the headers that will be sent to the request. For example, to set the
     * language and type on a request: "headers" : { "Accept-Language": "en-us", "Content-Type": "application/json" }.
     * Type: string (or Expression with resultType string).
     *
     * @return the headers value.
     */
    public Object headers() {
        return this.headers;
    }

    /**
     * Set the headers property: Represents the headers that will be sent to the request. For example, to set the
     * language and type on a request: "headers" : { "Accept-Language": "en-us", "Content-Type": "application/json" }.
     * Type: string (or Expression with resultType string).
     *
     * @param headers the headers value to set.
     * @return the WebhookActivityTypeProperties object itself.
     */
    public WebhookActivityTypeProperties withHeaders(Object headers) {
        this.headers = headers;
        return this;
    }

    /**
     * Get the body property: Represents the payload that will be sent to the endpoint. Required for POST/PUT method,
     * not allowed for GET method Type: string (or Expression with resultType string).
     *
     * @return the body value.
     */
    public Object body() {
        return this.body;
    }

    /**
     * Set the body property: Represents the payload that will be sent to the endpoint. Required for POST/PUT method,
     * not allowed for GET method Type: string (or Expression with resultType string).
     *
     * @param body the body value to set.
     * @return the WebhookActivityTypeProperties object itself.
     */
    public WebhookActivityTypeProperties withBody(Object body) {
        this.body = body;
        return this;
    }

    /**
     * Get the authentication property: Authentication method used for calling the endpoint.
     *
     * @return the authentication value.
     */
    public WebActivityAuthentication authentication() {
        return this.authentication;
    }

    /**
     * Set the authentication property: Authentication method used for calling the endpoint.
     *
     * @param authentication the authentication value to set.
     * @return the WebhookActivityTypeProperties object itself.
     */
    public WebhookActivityTypeProperties withAuthentication(WebActivityAuthentication authentication) {
        this.authentication = authentication;
        return this;
    }

    /**
     * Get the reportStatusOnCallBack property: When set to true, statusCode, output and error in callback request body
     * will be consumed by activity. The activity can be marked as failed by setting statusCode &gt;= 400 in callback
     * request. Default is false. Type: boolean (or Expression with resultType boolean).
     *
     * @return the reportStatusOnCallBack value.
     */
    public Object reportStatusOnCallBack() {
        return this.reportStatusOnCallBack;
    }

    /**
     * Set the reportStatusOnCallBack property: When set to true, statusCode, output and error in callback request body
     * will be consumed by activity. The activity can be marked as failed by setting statusCode &gt;= 400 in callback
     * request. Default is false. Type: boolean (or Expression with resultType boolean).
     *
     * @param reportStatusOnCallBack the reportStatusOnCallBack value to set.
     * @return the WebhookActivityTypeProperties object itself.
     */
    public WebhookActivityTypeProperties withReportStatusOnCallBack(Object reportStatusOnCallBack) {
        this.reportStatusOnCallBack = reportStatusOnCallBack;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (method() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property method in model WebhookActivityTypeProperties"));
        }
        if (url() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property url in model WebhookActivityTypeProperties"));
        }
        if (authentication() != null) {
            authentication().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(WebhookActivityTypeProperties.class);
}
