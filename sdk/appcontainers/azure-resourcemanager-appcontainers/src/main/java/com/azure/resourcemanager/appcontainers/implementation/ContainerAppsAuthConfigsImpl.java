// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appcontainers.fluent.ContainerAppsAuthConfigsClient;
import com.azure.resourcemanager.appcontainers.fluent.models.AuthConfigInner;
import com.azure.resourcemanager.appcontainers.models.AuthConfig;
import com.azure.resourcemanager.appcontainers.models.ContainerAppsAuthConfigs;

public final class ContainerAppsAuthConfigsImpl implements ContainerAppsAuthConfigs {
    private static final ClientLogger LOGGER = new ClientLogger(ContainerAppsAuthConfigsImpl.class);

    private final ContainerAppsAuthConfigsClient innerClient;

    private final com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager;

    public ContainerAppsAuthConfigsImpl(
        ContainerAppsAuthConfigsClient innerClient,
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<AuthConfig> listByContainerApp(String resourceGroupName, String containerAppName) {
        PagedIterable<AuthConfigInner> inner =
            this.serviceClient().listByContainerApp(resourceGroupName, containerAppName);
        return Utils.mapPage(inner, inner1 -> new AuthConfigImpl(inner1, this.manager()));
    }

    public PagedIterable<AuthConfig> listByContainerApp(
        String resourceGroupName, String containerAppName, Context context) {
        PagedIterable<AuthConfigInner> inner =
            this.serviceClient().listByContainerApp(resourceGroupName, containerAppName, context);
        return Utils.mapPage(inner, inner1 -> new AuthConfigImpl(inner1, this.manager()));
    }

    public AuthConfig get(String resourceGroupName, String containerAppName, String name) {
        AuthConfigInner inner = this.serviceClient().get(resourceGroupName, containerAppName, name);
        if (inner != null) {
            return new AuthConfigImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AuthConfig> getWithResponse(
        String resourceGroupName, String containerAppName, String name, Context context) {
        Response<AuthConfigInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, containerAppName, name, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AuthConfigImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String containerAppName, String name) {
        this.serviceClient().delete(resourceGroupName, containerAppName, name);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String containerAppName, String name, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, containerAppName, name, context);
    }

    public AuthConfig getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String containerAppName = Utils.getValueFromIdByName(id, "containerApps");
        if (containerAppName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'containerApps'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "authConfigs");
        if (name == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'authConfigs'.", id)));
        }
        return this.getWithResponse(resourceGroupName, containerAppName, name, Context.NONE).getValue();
    }

    public Response<AuthConfig> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String containerAppName = Utils.getValueFromIdByName(id, "containerApps");
        if (containerAppName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'containerApps'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "authConfigs");
        if (name == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'authConfigs'.", id)));
        }
        return this.getWithResponse(resourceGroupName, containerAppName, name, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String containerAppName = Utils.getValueFromIdByName(id, "containerApps");
        if (containerAppName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'containerApps'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "authConfigs");
        if (name == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'authConfigs'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, containerAppName, name, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String containerAppName = Utils.getValueFromIdByName(id, "containerApps");
        if (containerAppName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'containerApps'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "authConfigs");
        if (name == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'authConfigs'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, containerAppName, name, context);
    }

    private ContainerAppsAuthConfigsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager() {
        return this.serviceManager;
    }

    public AuthConfigImpl define(String name) {
        return new AuthConfigImpl(name, this.manager());
    }
}
