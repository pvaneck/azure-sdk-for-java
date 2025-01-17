// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityOnInactiveMarkAs;
import com.azure.resourcemanager.datafactory.models.ActivityPolicy;
import com.azure.resourcemanager.datafactory.models.ActivityState;
import com.azure.resourcemanager.datafactory.models.CopySource;
import com.azure.resourcemanager.datafactory.models.DatasetReference;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.LookupActivity;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class LookupActivityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LookupActivity model = BinaryData.fromString(
            "{\"type\":\"Lookup\",\"typeProperties\":{\"source\":{\"type\":\"CopySource\",\"sourceRetryCount\":\"datawpwdfjsjkond\",\"sourceRetryWait\":\"datancfoqdspslc\",\"maxConcurrentConnections\":\"dataqwrsfdpikxsgga\",\"disableMetricsCollection\":\"datarpp\",\"\":{\"ljtophcwzdwv\":\"dataig\"}},\"dataset\":{\"referenceName\":\"jzokvycinmywjcf\",\"parameters\":{\"xzxbiwnqewqtbzto\":\"dataoztwmvprnqjxs\",\"esgal\":\"dataihpylfdr\",\"kzeolvnosblczct\":\"dataparbjsvqybvge\",\"tcijuntm\":\"dataacbnhkpdcvjhyk\"}},\"firstRowOnly\":\"datahzccqhtlqrf\"},\"linkedServiceName\":{\"referenceName\":\"fxrgxxymtcwac\",\"parameters\":{\"dlqfxidastu\":\"dataadybh\",\"haoviwuttlmfcn\":\"datahnsaespzwgpjri\",\"pihqmmmbokdqkf\":\"datatgai\",\"uwrvg\":\"datapfzxniv\"}},\"policy\":{\"timeout\":\"datarlkgpipwtrt\",\"retry\":\"datafipbddhfk\",\"retryIntervalInSeconds\":1624947960,\"secureInput\":true,\"secureOutput\":true,\"\":{\"hvaovoqonqjl\":\"datawzkefzdu\",\"yqiytrhhmld\":\"datac\"}},\"name\":\"tyz\",\"description\":\"mstflkfgzovbb\",\"state\":\"Inactive\",\"onInactiveMarkAs\":\"Skipped\",\"dependsOn\":[{\"activity\":\"mcprg\",\"dependencyConditions\":[\"Skipped\",\"Completed\",\"Succeeded\"],\"\":{\"hwbqi\":\"dataqwvragv\",\"gi\":\"datafrrv\",\"kgekoux\":\"datalmmfb\"}},{\"activity\":\"r\",\"dependencyConditions\":[\"Completed\"],\"\":{\"gcuppwsgawq\":\"datamdffoibx\",\"ox\":\"datarenjzlqbteftctpz\",\"nouh\":\"dataga\",\"ypara\":\"datavtefevhedfzxs\"}}],\"userProperties\":[{\"name\":\"sfnjokrf\",\"value\":\"dataiqgqvprl\"},{\"name\":\"sglqiuqsqzu\",\"value\":\"dataxdxnmuosoziqcui\"},{\"name\":\"kuyaxpuk\",\"value\":\"datatgeejxwbredxmd\"},{\"name\":\"fxlkwy\",\"value\":\"dataoaejylqgenbe\"}],\"\":{\"satzvtinror\":\"dataiatyoxvb\",\"ng\":\"datajtylseudpyhv\",\"lokxihfe\":\"datajn\"}}")
            .toObject(LookupActivity.class);
        Assertions.assertEquals("tyz", model.name());
        Assertions.assertEquals("mstflkfgzovbb", model.description());
        Assertions.assertEquals(ActivityState.INACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SKIPPED, model.onInactiveMarkAs());
        Assertions.assertEquals("mcprg", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SKIPPED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("sfnjokrf", model.userProperties().get(0).name());
        Assertions.assertEquals("fxrgxxymtcwac", model.linkedServiceName().referenceName());
        Assertions.assertEquals(1624947960, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(true, model.policy().secureInput());
        Assertions.assertEquals(true, model.policy().secureOutput());
        Assertions.assertEquals("jzokvycinmywjcf", model.dataset().referenceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LookupActivity model = new LookupActivity().withName("tyz").withDescription("mstflkfgzovbb")
            .withState(ActivityState.INACTIVE).withOnInactiveMarkAs(ActivityOnInactiveMarkAs.SKIPPED)
            .withDependsOn(Arrays.asList(
                new ActivityDependency().withActivity("mcprg")
                    .withDependencyConditions(Arrays.asList(DependencyCondition.SKIPPED, DependencyCondition.COMPLETED,
                        DependencyCondition.SUCCEEDED))
                    .withAdditionalProperties(mapOf()),
                new ActivityDependency().withActivity("r")
                    .withDependencyConditions(Arrays.asList(DependencyCondition.COMPLETED))
                    .withAdditionalProperties(mapOf())))
            .withUserProperties(Arrays.asList(new UserProperty().withName("sfnjokrf").withValue("dataiqgqvprl"),
                new UserProperty().withName("sglqiuqsqzu").withValue("dataxdxnmuosoziqcui"),
                new UserProperty().withName("kuyaxpuk").withValue("datatgeejxwbredxmd"),
                new UserProperty().withName("fxlkwy").withValue("dataoaejylqgenbe")))
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("fxrgxxymtcwac")
                .withParameters(mapOf("dlqfxidastu", "dataadybh", "haoviwuttlmfcn", "datahnsaespzwgpjri",
                    "pihqmmmbokdqkf", "datatgai", "uwrvg", "datapfzxniv")))
            .withPolicy(new ActivityPolicy().withTimeout("datarlkgpipwtrt").withRetry("datafipbddhfk")
                .withRetryIntervalInSeconds(1624947960).withSecureInput(true).withSecureOutput(true)
                .withAdditionalProperties(mapOf()))
            .withSource(new CopySource().withSourceRetryCount("datawpwdfjsjkond").withSourceRetryWait("datancfoqdspslc")
                .withMaxConcurrentConnections("dataqwrsfdpikxsgga").withDisableMetricsCollection("datarpp")
                .withAdditionalProperties(mapOf("type", "CopySource")))
            .withDataset(new DatasetReference().withReferenceName("jzokvycinmywjcf")
                .withParameters(mapOf("xzxbiwnqewqtbzto", "dataoztwmvprnqjxs", "esgal", "dataihpylfdr",
                    "kzeolvnosblczct", "dataparbjsvqybvge", "tcijuntm", "dataacbnhkpdcvjhyk")))
            .withFirstRowOnly("datahzccqhtlqrf");
        model = BinaryData.fromObject(model).toObject(LookupActivity.class);
        Assertions.assertEquals("tyz", model.name());
        Assertions.assertEquals("mstflkfgzovbb", model.description());
        Assertions.assertEquals(ActivityState.INACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SKIPPED, model.onInactiveMarkAs());
        Assertions.assertEquals("mcprg", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SKIPPED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("sfnjokrf", model.userProperties().get(0).name());
        Assertions.assertEquals("fxrgxxymtcwac", model.linkedServiceName().referenceName());
        Assertions.assertEquals(1624947960, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(true, model.policy().secureInput());
        Assertions.assertEquals(true, model.policy().secureOutput());
        Assertions.assertEquals("jzokvycinmywjcf", model.dataset().referenceName());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
