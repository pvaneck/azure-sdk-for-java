// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Replication appliance properties. */
@Fluent
public final class ReplicationApplianceProperties {
    /*
     * Provider specific settings.
     */
    @JsonProperty(value = "providerSpecificDetails")
    private ApplianceSpecificDetails providerSpecificDetails;

    /** Creates an instance of ReplicationApplianceProperties class. */
    public ReplicationApplianceProperties() {
    }

    /**
     * Get the providerSpecificDetails property: Provider specific settings.
     *
     * @return the providerSpecificDetails value.
     */
    public ApplianceSpecificDetails providerSpecificDetails() {
        return this.providerSpecificDetails;
    }

    /**
     * Set the providerSpecificDetails property: Provider specific settings.
     *
     * @param providerSpecificDetails the providerSpecificDetails value to set.
     * @return the ReplicationApplianceProperties object itself.
     */
    public ReplicationApplianceProperties withProviderSpecificDetails(
        ApplianceSpecificDetails providerSpecificDetails) {
        this.providerSpecificDetails = providerSpecificDetails;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (providerSpecificDetails() != null) {
            providerSpecificDetails().validate();
        }
    }
}
