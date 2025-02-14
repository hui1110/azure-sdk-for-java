// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dnsresolver.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.dnsresolver.fluent.OutboundEndpointsClient;
import com.azure.resourcemanager.dnsresolver.fluent.models.OutboundEndpointInner;
import com.azure.resourcemanager.dnsresolver.models.OutboundEndpoint;
import com.azure.resourcemanager.dnsresolver.models.OutboundEndpoints;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class OutboundEndpointsImpl implements OutboundEndpoints {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OutboundEndpointsImpl.class);

    private final OutboundEndpointsClient innerClient;

    private final com.azure.resourcemanager.dnsresolver.DnsResolverManager serviceManager;

    public OutboundEndpointsImpl(
        OutboundEndpointsClient innerClient, com.azure.resourcemanager.dnsresolver.DnsResolverManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String dnsResolverName, String outboundEndpointName, String ifMatch) {
        this.serviceClient().delete(resourceGroupName, dnsResolverName, outboundEndpointName, ifMatch);
    }

    public void delete(String resourceGroupName, String dnsResolverName, String outboundEndpointName) {
        this.serviceClient().delete(resourceGroupName, dnsResolverName, outboundEndpointName);
    }

    public void delete(
        String resourceGroupName,
        String dnsResolverName,
        String outboundEndpointName,
        String ifMatch,
        Context context) {
        this.serviceClient().delete(resourceGroupName, dnsResolverName, outboundEndpointName, ifMatch, context);
    }

    public OutboundEndpoint get(String resourceGroupName, String dnsResolverName, String outboundEndpointName) {
        OutboundEndpointInner inner =
            this.serviceClient().get(resourceGroupName, dnsResolverName, outboundEndpointName);
        if (inner != null) {
            return new OutboundEndpointImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<OutboundEndpoint> getWithResponse(
        String resourceGroupName, String dnsResolverName, String outboundEndpointName, Context context) {
        Response<OutboundEndpointInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, dnsResolverName, outboundEndpointName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new OutboundEndpointImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<OutboundEndpoint> list(String resourceGroupName, String dnsResolverName) {
        PagedIterable<OutboundEndpointInner> inner = this.serviceClient().list(resourceGroupName, dnsResolverName);
        return Utils.mapPage(inner, inner1 -> new OutboundEndpointImpl(inner1, this.manager()));
    }

    public PagedIterable<OutboundEndpoint> list(
        String resourceGroupName, String dnsResolverName, Integer top, Context context) {
        PagedIterable<OutboundEndpointInner> inner =
            this.serviceClient().list(resourceGroupName, dnsResolverName, top, context);
        return Utils.mapPage(inner, inner1 -> new OutboundEndpointImpl(inner1, this.manager()));
    }

    public OutboundEndpoint getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String dnsResolverName = Utils.getValueFromIdByName(id, "dnsResolvers");
        if (dnsResolverName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'dnsResolvers'.", id)));
        }
        String outboundEndpointName = Utils.getValueFromIdByName(id, "outboundEndpoints");
        if (outboundEndpointName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'outboundEndpoints'.", id)));
        }
        return this.getWithResponse(resourceGroupName, dnsResolverName, outboundEndpointName, Context.NONE).getValue();
    }

    public Response<OutboundEndpoint> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String dnsResolverName = Utils.getValueFromIdByName(id, "dnsResolvers");
        if (dnsResolverName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'dnsResolvers'.", id)));
        }
        String outboundEndpointName = Utils.getValueFromIdByName(id, "outboundEndpoints");
        if (outboundEndpointName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'outboundEndpoints'.", id)));
        }
        return this.getWithResponse(resourceGroupName, dnsResolverName, outboundEndpointName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String dnsResolverName = Utils.getValueFromIdByName(id, "dnsResolvers");
        if (dnsResolverName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'dnsResolvers'.", id)));
        }
        String outboundEndpointName = Utils.getValueFromIdByName(id, "outboundEndpoints");
        if (outboundEndpointName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'outboundEndpoints'.", id)));
        }
        String localIfMatch = null;
        this.delete(resourceGroupName, dnsResolverName, outboundEndpointName, localIfMatch, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, String ifMatch, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String dnsResolverName = Utils.getValueFromIdByName(id, "dnsResolvers");
        if (dnsResolverName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'dnsResolvers'.", id)));
        }
        String outboundEndpointName = Utils.getValueFromIdByName(id, "outboundEndpoints");
        if (outboundEndpointName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'outboundEndpoints'.", id)));
        }
        this.delete(resourceGroupName, dnsResolverName, outboundEndpointName, ifMatch, context);
    }

    private OutboundEndpointsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.dnsresolver.DnsResolverManager manager() {
        return this.serviceManager;
    }

    public OutboundEndpointImpl define(String name) {
        return new OutboundEndpointImpl(name, this.manager());
    }
}
