// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.datafactory.DataFactoryManager;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponse;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class IntegrationRuntimesListOutboundNetworkDependenciesEndpointsWithResponseMockTests {
    @Test
    public void testListOutboundNetworkDependenciesEndpointsWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"value\":[{\"category\":\"grsvyjrq\",\"endpoints\":[{\"domainName\":\"vmxibpcnmps\",\"endpointDetails\":[{},{},{}]},{\"domainName\":\"entiprriqwf\",\"endpointDetails\":[{},{}]}]},{\"category\":\"yingr\",\"endpoints\":[{\"domainName\":\"cqndgbxtzyt\",\"endpointDetails\":[{},{},{}]}]},{\"category\":\"hntchigub\",\"endpoints\":[{\"domainName\":\"gyazppefsdoo\",\"endpointDetails\":[{}]}]},{\"category\":\"fiey\",\"endpoints\":[{\"domainName\":\"qtwohfhs\",\"endpointDetails\":[{}]},{\"domainName\":\"umevgoaxtw\",\"endpointDetails\":[{},{},{},{}]},{\"domainName\":\"uirskoaxs\",\"endpointDetails\":[{},{},{},{}]},{\"domainName\":\"qliyxzeniiu\",\"endpointDetails\":[{},{},{}]}]}]}";

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

        IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponse response
            = manager.integrationRuntimes().listOutboundNetworkDependenciesEndpointsWithResponse("whjfuoips",
                "vcqhzejbro", "h", com.azure.core.util.Context.NONE).getValue();

        Assertions.assertEquals("grsvyjrq", response.value().get(0).category());
        Assertions.assertEquals("vmxibpcnmps", response.value().get(0).endpoints().get(0).domainName());
    }
}
