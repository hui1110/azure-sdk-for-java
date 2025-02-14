// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appcontainers.fluent.models.ContainerAppInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of ContainerApp. */
public interface ContainerApp {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the identity property: managed identities for the Container App to interact with other Azure services
     * without maintaining any secrets or credentials in code.
     *
     * @return the identity value.
     */
    ManagedServiceIdentity identity();

    /**
     * Gets the provisioningState property: Provisioning state of the Container App.
     *
     * @return the provisioningState value.
     */
    ContainerAppProvisioningState provisioningState();

    /**
     * Gets the managedEnvironmentId property: Resource ID of the Container App's environment.
     *
     * @return the managedEnvironmentId value.
     */
    String managedEnvironmentId();

    /**
     * Gets the latestRevisionName property: Name of the latest revision of the Container App.
     *
     * @return the latestRevisionName value.
     */
    String latestRevisionName();

    /**
     * Gets the latestRevisionFqdn property: Fully Qualified Domain Name of the latest revision of the Container App.
     *
     * @return the latestRevisionFqdn value.
     */
    String latestRevisionFqdn();

    /**
     * Gets the customDomainVerificationId property: Id used to verify domain name ownership.
     *
     * @return the customDomainVerificationId value.
     */
    String customDomainVerificationId();

    /**
     * Gets the configuration property: Non versioned Container App configuration properties.
     *
     * @return the configuration value.
     */
    Configuration configuration();

    /**
     * Gets the template property: Container App versioned application definition.
     *
     * @return the template value.
     */
    Template template();

    /**
     * Gets the outboundIpAddresses property: Outbound IP Addresses for container app.
     *
     * @return the outboundIpAddresses value.
     */
    List<String> outboundIpAddresses();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.appcontainers.fluent.models.ContainerAppInner object.
     *
     * @return the inner object.
     */
    ContainerAppInner innerModel();

    /** The entirety of the ContainerApp definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The ContainerApp definition stages. */
    interface DefinitionStages {
        /** The first stage of the ContainerApp definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the ContainerApp definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the ContainerApp definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the ContainerApp definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithIdentity,
                DefinitionStages.WithManagedEnvironmentId,
                DefinitionStages.WithConfiguration,
                DefinitionStages.WithTemplate {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ContainerApp create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ContainerApp create(Context context);
        }
        /** The stage of the ContainerApp definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the ContainerApp definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: managed identities for the Container App to interact with other Azure
             * services without maintaining any secrets or credentials in code..
             *
             * @param identity managed identities for the Container App to interact with other Azure services without
             *     maintaining any secrets or credentials in code.
             * @return the next definition stage.
             */
            WithCreate withIdentity(ManagedServiceIdentity identity);
        }
        /** The stage of the ContainerApp definition allowing to specify managedEnvironmentId. */
        interface WithManagedEnvironmentId {
            /**
             * Specifies the managedEnvironmentId property: Resource ID of the Container App's environment..
             *
             * @param managedEnvironmentId Resource ID of the Container App's environment.
             * @return the next definition stage.
             */
            WithCreate withManagedEnvironmentId(String managedEnvironmentId);
        }
        /** The stage of the ContainerApp definition allowing to specify configuration. */
        interface WithConfiguration {
            /**
             * Specifies the configuration property: Non versioned Container App configuration properties..
             *
             * @param configuration Non versioned Container App configuration properties.
             * @return the next definition stage.
             */
            WithCreate withConfiguration(Configuration configuration);
        }
        /** The stage of the ContainerApp definition allowing to specify template. */
        interface WithTemplate {
            /**
             * Specifies the template property: Container App versioned application definition..
             *
             * @param template Container App versioned application definition.
             * @return the next definition stage.
             */
            WithCreate withTemplate(Template template);
        }
    }
    /**
     * Begins update for the ContainerApp resource.
     *
     * @return the stage of resource update.
     */
    ContainerApp.Update update();

    /** The template for ContainerApp update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ContainerApp apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ContainerApp apply(Context context);
    }
    /** The ContainerApp update stages. */
    interface UpdateStages {
        /** The stage of the ContainerApp update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Application-specific metadata in the form of key-value pairs..
             *
             * @param tags Application-specific metadata in the form of key-value pairs.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ContainerApp refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ContainerApp refresh(Context context);

    /**
     * List secrets for a container app.
     *
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container App Secrets Collection ARM resource.
     */
    SecretsCollection listSecrets();

    /**
     * List secrets for a container app.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container App Secrets Collection ARM resource along with {@link Response}.
     */
    Response<SecretsCollection> listSecretsWithResponse(Context context);
}
