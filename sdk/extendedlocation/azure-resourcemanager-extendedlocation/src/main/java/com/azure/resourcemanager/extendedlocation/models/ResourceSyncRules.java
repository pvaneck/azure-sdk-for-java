// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.extendedlocation.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ResourceSyncRules. */
public interface ResourceSyncRules {
    /**
     * Gets a list of Resource Sync Rules in the specified subscription. The operation returns properties of each
     * Resource Sync Rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName Custom Locations name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Resource Sync Rules in the specified subscription as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<ResourceSyncRule> listByCustomLocationId(String resourceGroupName, String resourceName);

    /**
     * Gets a list of Resource Sync Rules in the specified subscription. The operation returns properties of each
     * Resource Sync Rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName Custom Locations name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Resource Sync Rules in the specified subscription as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<ResourceSyncRule> listByCustomLocationId(
        String resourceGroupName, String resourceName, Context context);

    /**
     * Gets the details of the resourceSyncRule with a specified resource group, subscription id Custom Location
     * resource name and Resource Sync Rule name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName Custom Locations name.
     * @param childResourceName Resource Sync Rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the resourceSyncRule with a specified resource group, subscription id Custom Location
     *     resource name and Resource Sync Rule name.
     */
    ResourceSyncRule get(String resourceGroupName, String resourceName, String childResourceName);

    /**
     * Gets the details of the resourceSyncRule with a specified resource group, subscription id Custom Location
     * resource name and Resource Sync Rule name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName Custom Locations name.
     * @param childResourceName Resource Sync Rule name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the resourceSyncRule with a specified resource group, subscription id Custom Location
     *     resource name and Resource Sync Rule name along with {@link Response}.
     */
    Response<ResourceSyncRule> getWithResponse(
        String resourceGroupName, String resourceName, String childResourceName, Context context);

    /**
     * Deletes the Resource Sync Rule with the specified Resource Sync Rule Name, Custom Location Resource Name,
     * Resource Group, and Subscription Id.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName Custom Locations name.
     * @param childResourceName Resource Sync Rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String resourceName, String childResourceName);

    /**
     * Deletes the Resource Sync Rule with the specified Resource Sync Rule Name, Custom Location Resource Name,
     * Resource Group, and Subscription Id.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName Custom Locations name.
     * @param childResourceName Resource Sync Rule name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName, String resourceName, String childResourceName, Context context);

    /**
     * Gets the details of the resourceSyncRule with a specified resource group, subscription id Custom Location
     * resource name and Resource Sync Rule name.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the resourceSyncRule with a specified resource group, subscription id Custom Location
     *     resource name and Resource Sync Rule name along with {@link Response}.
     */
    ResourceSyncRule getById(String id);

    /**
     * Gets the details of the resourceSyncRule with a specified resource group, subscription id Custom Location
     * resource name and Resource Sync Rule name.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the resourceSyncRule with a specified resource group, subscription id Custom Location
     *     resource name and Resource Sync Rule name along with {@link Response}.
     */
    Response<ResourceSyncRule> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the Resource Sync Rule with the specified Resource Sync Rule Name, Custom Location Resource Name,
     * Resource Group, and Subscription Id.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the Resource Sync Rule with the specified Resource Sync Rule Name, Custom Location Resource Name,
     * Resource Group, and Subscription Id.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new ResourceSyncRule resource.
     *
     * @param name resource name.
     * @return the first stage of the new ResourceSyncRule definition.
     */
    ResourceSyncRule.DefinitionStages.Blank define(String name);
}