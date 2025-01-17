// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.datafactory.DataFactoryManager;
import com.azure.resourcemanager.datafactory.models.LinkedServiceResource;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class LinkedServicesListByFactoryMockTests {
    @Test
    public void testListByFactory() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"value\":[{\"properties\":{\"type\":\"LinkedService\",\"connectVia\":{\"referenceName\":\"nwqeixyj\",\"parameters\":{\"oduvcqowcg\":\"databjibetsvn\",\"skivlzvxmqvlgcp\":\"datafeolhs\",\"wgtypnj\":\"datansiynzdadku\",\"kt\":\"dataxollcsdgmcj\"}},\"description\":\"cmhttiqbn\",\"parameters\":{\"lddvvcwho\":{\"type\":\"Int\",\"defaultValue\":\"dataeavbezzp\"},\"yktlofgpnswv\":{\"type\":\"String\",\"defaultValue\":\"datavzxrfrax\"}},\"annotations\":[\"datakwpgdf\",\"dataoqbekkqs\",\"databyowfrw\",\"datarbzfbds\"],\"\":{\"owtazqexwkkjx\":\"dataflgtq\",\"jxud\":\"datajomnkeaiamh\",\"irttlwuqgaaj\":\"dataclzrot\",\"qsbekmeeowdojpja\":\"datafkdf\"}},\"name\":\"ebtvnskyg\",\"type\":\"qiktsyvzhxzj\",\"etag\":\"zijnykf\",\"id\":\"omdqg\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito.when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito.when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito.when(httpClient.send(httpRequest.capture(), Mockito.any())).thenReturn(Mono.defer(() -> {
            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
            return Mono.just(httpResponse);
        }));

        DataFactoryManager manager = DataFactoryManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<LinkedServiceResource> response
            = manager.linkedServices().listByFactory("reyrgrgft", "ehxddmaevcjtrw", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("omdqg", response.iterator().next().id());
        Assertions.assertEquals("nwqeixyj", response.iterator().next().properties().connectVia().referenceName());
        Assertions.assertEquals("cmhttiqbn", response.iterator().next().properties().description());
        Assertions.assertEquals(ParameterType.INT,
            response.iterator().next().properties().parameters().get("lddvvcwho").type());
    }
}
