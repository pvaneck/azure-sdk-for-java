// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.mobilenetwork.MobileNetworkManager;
import com.azure.resourcemanager.mobilenetwork.models.ObsoleteVersion;
import com.azure.resourcemanager.mobilenetwork.models.PacketCoreControlPlaneVersion;
import com.azure.resourcemanager.mobilenetwork.models.PlatformType;
import com.azure.resourcemanager.mobilenetwork.models.RecommendedVersion;
import com.azure.resourcemanager.mobilenetwork.models.VersionState;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class PacketCoreControlPlaneVersionsListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"provisioningState\":\"Canceled\",\"platforms\":[{\"platformType\":\"3P-AZURE-STACK-HCI\",\"versionState\":\"Unknown\",\"minimumPlatformSoftwareVersion\":\"eewxeiqbpsmg\",\"maximumPlatformSoftwareVersion\":\"guamlj\",\"recommendedVersion\":\"NotRecommended\",\"obsoleteVersion\":\"NotObsolete\"},{\"platformType\":\"3P-AZURE-STACK-HCI\",\"versionState\":\"Preview\",\"minimumPlatformSoftwareVersion\":\"auf\",\"maximumPlatformSoftwareVersion\":\"hhvnewgnxkymp\",\"recommendedVersion\":\"NotRecommended\",\"obsoleteVersion\":\"Obsolete\"}]},\"id\":\"kixtwbtaoy\",\"name\":\"nyghshxcylhkgmn\",\"type\":\"ghpxycphdr\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        MobileNetworkManager manager =
            MobileNetworkManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<PacketCoreControlPlaneVersion> response =
            manager.packetCoreControlPlaneVersions().list(com.azure.core.util.Context.NONE);

        Assertions
            .assertEquals(
                PlatformType.THREE_P_AZURE_STACK_HCI, response.iterator().next().platforms().get(0).platformType());
        Assertions.assertEquals(VersionState.UNKNOWN, response.iterator().next().platforms().get(0).versionState());
        Assertions
            .assertEquals(
                "eewxeiqbpsmg", response.iterator().next().platforms().get(0).minimumPlatformSoftwareVersion());
        Assertions
            .assertEquals("guamlj", response.iterator().next().platforms().get(0).maximumPlatformSoftwareVersion());
        Assertions
            .assertEquals(
                RecommendedVersion.NOT_RECOMMENDED, response.iterator().next().platforms().get(0).recommendedVersion());
        Assertions
            .assertEquals(
                ObsoleteVersion.NOT_OBSOLETE, response.iterator().next().platforms().get(0).obsoleteVersion());
    }
}
