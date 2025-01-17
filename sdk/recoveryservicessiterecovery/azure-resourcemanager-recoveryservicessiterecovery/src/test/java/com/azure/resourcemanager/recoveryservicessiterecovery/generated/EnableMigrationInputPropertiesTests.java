// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.EnableMigrationInputProperties;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.EnableMigrationProviderSpecificInput;
import org.junit.jupiter.api.Assertions;

public final class EnableMigrationInputPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EnableMigrationInputProperties model =
            BinaryData
                .fromString(
                    "{\"policyId\":\"waloayqcgwr\",\"providerSpecificDetails\":{\"instanceType\":\"EnableMigrationProviderSpecificInput\"}}")
                .toObject(EnableMigrationInputProperties.class);
        Assertions.assertEquals("waloayqcgwr", model.policyId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EnableMigrationInputProperties model =
            new EnableMigrationInputProperties()
                .withPolicyId("waloayqcgwr")
                .withProviderSpecificDetails(new EnableMigrationProviderSpecificInput());
        model = BinaryData.fromObject(model).toObject(EnableMigrationInputProperties.class);
        Assertions.assertEquals("waloayqcgwr", model.policyId());
    }
}
