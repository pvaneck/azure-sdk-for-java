// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for ExpressRoutePortAuthorizations List. */
public final class ExpressRoutePortAuthorizationsListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-08-01/examples/ExpressRoutePortAuthorizationList.json
     */
    /**
     * Sample code: List ExpressRoutePort Authorization.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listExpressRoutePortAuthorization(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getExpressRoutePortAuthorizations()
            .list("rg1", "expressRoutePortName", Context.NONE);
    }
}