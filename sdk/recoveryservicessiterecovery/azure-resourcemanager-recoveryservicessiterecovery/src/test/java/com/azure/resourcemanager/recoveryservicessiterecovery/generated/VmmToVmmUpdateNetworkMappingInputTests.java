// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.VmmToVmmUpdateNetworkMappingInput;

public final class VmmToVmmUpdateNetworkMappingInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VmmToVmmUpdateNetworkMappingInput model =
            BinaryData.fromString("{\"instanceType\":\"VmmToVmm\"}").toObject(VmmToVmmUpdateNetworkMappingInput.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VmmToVmmUpdateNetworkMappingInput model = new VmmToVmmUpdateNetworkMappingInput();
        model = BinaryData.fromObject(model).toObject(VmmToVmmUpdateNetworkMappingInput.class);
    }
}
