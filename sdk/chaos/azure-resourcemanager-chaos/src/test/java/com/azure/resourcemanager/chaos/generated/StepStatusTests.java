// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.chaos.models.StepStatus;

public final class StepStatusTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StepStatus model =
            BinaryData
                .fromString(
                    "{\"stepName\":\"efuzmuvpbttd\",\"stepId\":\"orppxebmnzbtb\",\"status\":\"pglkf\",\"branches\":[{\"branchName\":\"neuelfphsdyhtoz\",\"branchId\":\"kd\",\"status\":\"wq\",\"actions\":[{\"actionName\":\"zx\",\"actionId\":\"vithh\",\"status\":\"o\",\"startTime\":\"2021-11-01T18:47:46Z\",\"endTime\":\"2021-03-28T21:26:02Z\",\"targets\":[{},{},{}]}]},{\"branchName\":\"ohfwds\",\"branchId\":\"ka\",\"status\":\"utiiswacf\",\"actions\":[{\"actionName\":\"zzewkfvhqcrai\",\"actionId\":\"pnppfuf\",\"status\":\"wdmhdlxyjrxs\",\"startTime\":\"2021-10-27T14:22:38Z\",\"endTime\":\"2020-12-27T20:37:24Z\",\"targets\":[{}]},{\"actionName\":\"wqapnedgfbcvk\",\"actionId\":\"q\",\"status\":\"keqdcvdrhvoods\",\"startTime\":\"2021-11-02T01:53:07Z\",\"endTime\":\"2021-03-29T00:37:52Z\",\"targets\":[{},{},{}]},{\"actionName\":\"pcjwv\",\"actionId\":\"dldwmgxc\",\"status\":\"slpmutwuo\",\"startTime\":\"2021-07-03T15:36:28Z\",\"endTime\":\"2021-08-11T07:57:19Z\",\"targets\":[{}]},{\"actionName\":\"niyqslui\",\"actionId\":\"dggkzzlvmbmpa\",\"status\":\"odfvuefywsbp\",\"startTime\":\"2021-09-23T19:46:07Z\",\"endTime\":\"2021-11-18T13:44:32Z\",\"targets\":[{},{},{},{}]}]},{\"branchName\":\"ouyftaakc\",\"branchId\":\"iyzvqtmnub\",\"status\":\"kpzksmondjmq\",\"actions\":[{\"actionName\":\"pomgkopkwhojvp\",\"actionId\":\"qgxy\",\"status\":\"ocmbqfqvmkcxoza\",\"startTime\":\"2021-08-25T20:55:15Z\",\"endTime\":\"2021-06-19T06:02:18Z\",\"targets\":[{},{}]},{\"actionName\":\"glyatddckcbcuej\",\"actionId\":\"xgc\",\"status\":\"ibrhosxsdqr\",\"startTime\":\"2021-07-06T01:32:33Z\",\"endTime\":\"2021-06-02T05:04:16Z\",\"targets\":[{},{},{}]},{\"actionName\":\"rq\",\"actionId\":\"bahwfl\",\"status\":\"zdtmhrkwofy\",\"startTime\":\"2021-02-28T16:21:21Z\",\"endTime\":\"2021-09-15T04:25:08Z\",\"targets\":[{},{},{}]},{\"actionName\":\"expbtg\",\"actionId\":\"bwoenwashrt\",\"status\":\"kcnqxwbpo\",\"startTime\":\"2021-09-01T09:08:06Z\",\"endTime\":\"2021-07-21T21:11:01Z\",\"targets\":[{}]}]}]}")
                .toObject(StepStatus.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StepStatus model = new StepStatus();
        model = BinaryData.fromObject(model).toObject(StepStatus.class);
    }
}
