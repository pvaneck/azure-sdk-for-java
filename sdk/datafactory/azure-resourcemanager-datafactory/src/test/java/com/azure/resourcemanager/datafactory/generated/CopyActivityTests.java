// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityOnInactiveMarkAs;
import com.azure.resourcemanager.datafactory.models.ActivityPolicy;
import com.azure.resourcemanager.datafactory.models.ActivityState;
import com.azure.resourcemanager.datafactory.models.CopyActivity;
import com.azure.resourcemanager.datafactory.models.CopyActivityLogSettings;
import com.azure.resourcemanager.datafactory.models.CopySink;
import com.azure.resourcemanager.datafactory.models.CopySource;
import com.azure.resourcemanager.datafactory.models.DatasetReference;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.LogLocationSettings;
import com.azure.resourcemanager.datafactory.models.LogSettings;
import com.azure.resourcemanager.datafactory.models.LogStorageSettings;
import com.azure.resourcemanager.datafactory.models.RedirectIncompatibleRowSettings;
import com.azure.resourcemanager.datafactory.models.SkipErrorFile;
import com.azure.resourcemanager.datafactory.models.StagingSettings;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class CopyActivityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CopyActivity model = BinaryData.fromString(
            "{\"type\":\"Copy\",\"typeProperties\":{\"source\":{\"type\":\"CopySource\",\"sourceRetryCount\":\"datamy\",\"sourceRetryWait\":\"datasgb\",\"maxConcurrentConnections\":\"dataqhei\",\"disableMetricsCollection\":\"datazebmmjaigaxwqip\",\"\":{\"heggtdv\":\"datat\",\"awhoosrso\":\"dataokxx\",\"iq\":\"datahhvmfoejb\",\"xorsdvu\":\"datajpelnudifier\"}},\"sink\":{\"type\":\"CopySink\",\"writeBatchSize\":\"dataqfksjll\",\"writeBatchTimeout\":\"datamd\",\"sinkRetryCount\":\"dataihlvrsqci\",\"sinkRetryWait\":\"datairybwgaccvwky\",\"maxConcurrentConnections\":\"datamazgtbyn\",\"disableMetricsCollection\":\"datahcawexgeqojzvu\",\"\":{\"bobuovsvwnpc\":\"datakojjp\",\"lpz\":\"datadkmtvparyubnyh\"}},\"translator\":\"datavotuc\",\"enableStaging\":\"databp\",\"stagingSettings\":{\"linkedServiceName\":{\"referenceName\":\"umqzftzoe\",\"parameters\":{\"nuqsgertxicemgs\":\"datanvnooklgr\",\"edbsl\":\"datacbbdokph\",\"k\":\"datanunpxswmcc\"}},\"path\":\"dataiaaepxlxbofdc\",\"enableCompression\":\"dataoacfskzw\",\"\":{\"j\":\"datatutqjs\",\"v\":\"dataoixtrnakytzcma\",\"kaarqhpx\":\"datal\"}},\"parallelCopies\":\"datahzsx\",\"dataIntegrationUnits\":\"datagvygmtywivbuit\",\"enableSkipIncompatibleRow\":\"datadjnklvbrsxykwbhz\",\"redirectIncompatibleRowSettings\":{\"linkedServiceName\":\"dataudjitlqxpsn\",\"path\":\"dataxhgdns\",\"\":{\"khdnpnmrxjdfkql\":\"datalndbgaicjkqjzf\"}},\"logStorageSettings\":{\"linkedServiceName\":{\"referenceName\":\"ip\",\"parameters\":{\"ywkbiek\":\"dataquas\",\"gnapkpaiedo\":\"datavakqaho\",\"rvlgh\":\"datavoaoavezwclmzm\",\"fzfjtockgqaawy\":\"datarcdiqhvhcbukaw\"}},\"path\":\"datazwoeqljlwfq\",\"logLevel\":\"datayww\",\"enableReliableLogging\":\"dataipkhqhvktcztm\",\"\":{\"gxemvlyaprjz\":\"datahohsp\"}},\"logSettings\":{\"enableCopyActivityLog\":\"dataxqfrntz\",\"copyActivityLogSettings\":{\"logLevel\":\"dataxl\",\"enableReliableLogging\":\"datafauvgt\"},\"logLocationSettings\":{\"linkedServiceName\":{\"referenceName\":\"inozsmyvvfa\",\"parameters\":{\"oo\":\"datamrwhknef\",\"pdd\":\"datatmd\",\"laxuybxjwny\":\"datagupiosibg\"}},\"path\":\"datakyrttnriks\"}},\"preserveRules\":[\"dataiksjpkign\",\"datatoqtui\",\"dataipbfs\"],\"preserve\":[\"datalpevz\"],\"validateDataConsistency\":\"dataydnokkkgiec\",\"skipErrorFile\":{\"fileMissing\":\"datatsneftzetjclaqxx\",\"dataInconsistency\":\"dataq\"}},\"inputs\":[{\"referenceName\":\"pdsuyywnaq\",\"parameters\":{\"zwlhufsgc\":\"dataxuhhvgddfzcny\"}},{\"referenceName\":\"wr\",\"parameters\":{\"tbiuikpotjjfe\":\"datadegfhofo\"}}],\"outputs\":[{\"referenceName\":\"kqjpovjvvxpsnr\",\"parameters\":{\"qwqcxyiqppacj\":\"databmhjmqf\"}},{\"referenceName\":\"qrllacylbtkxeijz\",\"parameters\":{\"jezr\":\"dataaaxttexaugojv\",\"awlntenhnqtvx\":\"databo\"}},{\"referenceName\":\"hbehhehotqorrvwl\",\"parameters\":{\"gjir\":\"datajlyugzl\",\"rtkevimrupg\":\"datakkrsyfds\"}}],\"linkedServiceName\":{\"referenceName\":\"jmandrvv\",\"parameters\":{\"fjlpkocrexfmqfu\":\"datalbfvtzdtw\",\"zgzscgs\":\"datalupuvwlfzjrjglac\",\"keytpmlrjnnbmods\":\"datawu\"}},\"policy\":{\"timeout\":\"datatvatuj\",\"retry\":\"dataqvfxvvog\",\"retryIntervalInSeconds\":2139387993,\"secureInput\":true,\"secureOutput\":true,\"\":{\"tsmeac\":\"dataqkkmpfnwdrmzw\",\"mgnvcusvidkzbd\":\"dataypkhnr\"}},\"name\":\"vlsn\",\"description\":\"ymrfomlh\",\"state\":\"Active\",\"onInactiveMarkAs\":\"Failed\",\"dependsOn\":[{\"activity\":\"smocqwe\",\"dependencyConditions\":[\"Failed\",\"Completed\",\"Completed\"],\"\":{\"iwfsqjxxbsafqiw\":\"datatmfcx\",\"g\":\"dataduotsyjzda\"}},{\"activity\":\"fzprhqomuzohnpk\",\"dependencyConditions\":[\"Skipped\",\"Skipped\",\"Skipped\",\"Completed\"],\"\":{\"wzienijunmgdpxei\":\"datanzmffyvowlammvaz\"}},{\"activity\":\"r\",\"dependencyConditions\":[\"Succeeded\",\"Skipped\",\"Skipped\"],\"\":{\"cuzvbreh\":\"dataztf\",\"seiidfpwbybmxf\":\"datatqggzahngn\"}},{\"activity\":\"z\",\"dependencyConditions\":[\"Skipped\",\"Succeeded\",\"Succeeded\"],\"\":{\"yeml\":\"datasibqilbpyjz\",\"vwr\":\"datasavzcz\"}}],\"userProperties\":[{\"name\":\"alywgqr\",\"value\":\"datavb\"},{\"name\":\"bheyxewcsk\",\"value\":\"datavkwbpr\"}],\"\":{\"ztvnmrgv\":\"datavxiikrja\"}}")
            .toObject(CopyActivity.class);
        Assertions.assertEquals("vlsn", model.name());
        Assertions.assertEquals("ymrfomlh", model.description());
        Assertions.assertEquals(ActivityState.ACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.FAILED, model.onInactiveMarkAs());
        Assertions.assertEquals("smocqwe", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.FAILED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("alywgqr", model.userProperties().get(0).name());
        Assertions.assertEquals("jmandrvv", model.linkedServiceName().referenceName());
        Assertions.assertEquals(2139387993, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(true, model.policy().secureInput());
        Assertions.assertEquals(true, model.policy().secureOutput());
        Assertions.assertEquals("pdsuyywnaq", model.inputs().get(0).referenceName());
        Assertions.assertEquals("kqjpovjvvxpsnr", model.outputs().get(0).referenceName());
        Assertions.assertEquals("umqzftzoe", model.stagingSettings().linkedServiceName().referenceName());
        Assertions.assertEquals("ip", model.logStorageSettings().linkedServiceName().referenceName());
        Assertions.assertEquals("inozsmyvvfa",
            model.logSettings().logLocationSettings().linkedServiceName().referenceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CopyActivity model = new CopyActivity().withName("vlsn").withDescription("ymrfomlh")
            .withState(ActivityState.ACTIVE).withOnInactiveMarkAs(ActivityOnInactiveMarkAs.FAILED)
            .withDependsOn(Arrays.asList(
                new ActivityDependency().withActivity("smocqwe")
                    .withDependencyConditions(Arrays.asList(DependencyCondition.FAILED, DependencyCondition.COMPLETED,
                        DependencyCondition.COMPLETED))
                    .withAdditionalProperties(mapOf()),
                new ActivityDependency().withActivity("fzprhqomuzohnpk")
                    .withDependencyConditions(Arrays.asList(DependencyCondition.SKIPPED, DependencyCondition.SKIPPED,
                        DependencyCondition.SKIPPED, DependencyCondition.COMPLETED))
                    .withAdditionalProperties(mapOf()),
                new ActivityDependency().withActivity("r")
                    .withDependencyConditions(Arrays.asList(DependencyCondition.SUCCEEDED, DependencyCondition.SKIPPED,
                        DependencyCondition.SKIPPED))
                    .withAdditionalProperties(mapOf()),
                new ActivityDependency().withActivity("z")
                    .withDependencyConditions(Arrays.asList(DependencyCondition.SKIPPED, DependencyCondition.SUCCEEDED,
                        DependencyCondition.SUCCEEDED))
                    .withAdditionalProperties(mapOf())))
            .withUserProperties(Arrays.asList(new UserProperty().withName("alywgqr").withValue("datavb"),
                new UserProperty().withName("bheyxewcsk").withValue("datavkwbpr")))
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("jmandrvv")
                .withParameters(mapOf("fjlpkocrexfmqfu", "datalbfvtzdtw", "zgzscgs", "datalupuvwlfzjrjglac",
                    "keytpmlrjnnbmods", "datawu")))
            .withPolicy(new ActivityPolicy().withTimeout("datatvatuj").withRetry("dataqvfxvvog")
                .withRetryIntervalInSeconds(2139387993).withSecureInput(true).withSecureOutput(true)
                .withAdditionalProperties(mapOf()))
            .withInputs(Arrays.asList(
                new DatasetReference().withReferenceName("pdsuyywnaq")
                    .withParameters(mapOf("zwlhufsgc", "dataxuhhvgddfzcny")),
                new DatasetReference().withReferenceName("wr").withParameters(mapOf("tbiuikpotjjfe", "datadegfhofo"))))
            .withOutputs(Arrays.asList(
                new DatasetReference().withReferenceName("kqjpovjvvxpsnr")
                    .withParameters(mapOf("qwqcxyiqppacj", "databmhjmqf")),
                new DatasetReference().withReferenceName("qrllacylbtkxeijz")
                    .withParameters(mapOf("jezr", "dataaaxttexaugojv", "awlntenhnqtvx", "databo")),
                new DatasetReference().withReferenceName("hbehhehotqorrvwl")
                    .withParameters(mapOf("gjir", "datajlyugzl", "rtkevimrupg", "datakkrsyfds"))))
            .withSource(new CopySource().withSourceRetryCount("datamy").withSourceRetryWait("datasgb")
                .withMaxConcurrentConnections("dataqhei").withDisableMetricsCollection("datazebmmjaigaxwqip")
                .withAdditionalProperties(mapOf("type", "CopySource")))
            .withSink(new CopySink().withWriteBatchSize("dataqfksjll").withWriteBatchTimeout("datamd")
                .withSinkRetryCount("dataihlvrsqci").withSinkRetryWait("datairybwgaccvwky")
                .withMaxConcurrentConnections("datamazgtbyn").withDisableMetricsCollection("datahcawexgeqojzvu")
                .withAdditionalProperties(mapOf("type", "CopySink")))
            .withTranslator("datavotuc").withEnableStaging(
                "databp")
            .withStagingSettings(new StagingSettings()
                .withLinkedServiceName(new LinkedServiceReference().withReferenceName("umqzftzoe").withParameters(
                    mapOf("nuqsgertxicemgs", "datanvnooklgr", "edbsl", "datacbbdokph", "k", "datanunpxswmcc")))
                .withPath("dataiaaepxlxbofdc").withEnableCompression("dataoacfskzw").withAdditionalProperties(mapOf()))
            .withParallelCopies("datahzsx").withDataIntegrationUnits("datagvygmtywivbuit")
            .withEnableSkipIncompatibleRow("datadjnklvbrsxykwbhz")
            .withRedirectIncompatibleRowSettings(new RedirectIncompatibleRowSettings()
                .withLinkedServiceName("dataudjitlqxpsn").withPath("dataxhgdns").withAdditionalProperties(mapOf()))
            .withLogStorageSettings(
                new LogStorageSettings()
                    .withLinkedServiceName(new LinkedServiceReference().withReferenceName("ip")
                        .withParameters(mapOf("ywkbiek", "dataquas", "gnapkpaiedo", "datavakqaho", "rvlgh",
                            "datavoaoavezwclmzm", "fzfjtockgqaawy", "datarcdiqhvhcbukaw")))
                    .withPath("datazwoeqljlwfq").withLogLevel("datayww").withEnableReliableLogging(
                        "dataipkhqhvktcztm")
                    .withAdditionalProperties(mapOf()))
            .withLogSettings(new LogSettings().withEnableCopyActivityLog("dataxqfrntz")
                .withCopyActivityLogSettings(
                    new CopyActivityLogSettings().withLogLevel("dataxl").withEnableReliableLogging("datafauvgt"))
                .withLogLocationSettings(new LogLocationSettings()
                    .withLinkedServiceName(new LinkedServiceReference().withReferenceName("inozsmyvvfa")
                        .withParameters(mapOf("oo", "datamrwhknef", "pdd", "datatmd", "laxuybxjwny", "datagupiosibg")))
                    .withPath("datakyrttnriks")))
            .withPreserveRules(Arrays.asList("dataiksjpkign", "datatoqtui", "dataipbfs"))
            .withPreserve(Arrays.asList("datalpevz")).withValidateDataConsistency("dataydnokkkgiec").withSkipErrorFile(
                new SkipErrorFile().withFileMissing("datatsneftzetjclaqxx").withDataInconsistency("dataq"));
        model = BinaryData.fromObject(model).toObject(CopyActivity.class);
        Assertions.assertEquals("vlsn", model.name());
        Assertions.assertEquals("ymrfomlh", model.description());
        Assertions.assertEquals(ActivityState.ACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.FAILED, model.onInactiveMarkAs());
        Assertions.assertEquals("smocqwe", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.FAILED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("alywgqr", model.userProperties().get(0).name());
        Assertions.assertEquals("jmandrvv", model.linkedServiceName().referenceName());
        Assertions.assertEquals(2139387993, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(true, model.policy().secureInput());
        Assertions.assertEquals(true, model.policy().secureOutput());
        Assertions.assertEquals("pdsuyywnaq", model.inputs().get(0).referenceName());
        Assertions.assertEquals("kqjpovjvvxpsnr", model.outputs().get(0).referenceName());
        Assertions.assertEquals("umqzftzoe", model.stagingSettings().linkedServiceName().referenceName());
        Assertions.assertEquals("ip", model.logStorageSettings().linkedServiceName().referenceName());
        Assertions.assertEquals("inozsmyvvfa",
            model.logSettings().logLocationSettings().linkedServiceName().referenceName());
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
