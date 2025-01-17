// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.contentsafety;

import com.azure.ai.contentsafety.implementation.ContentSafetyClientImpl;
import com.azure.ai.contentsafety.models.AnalyzeImageOptions;
import com.azure.ai.contentsafety.models.AnalyzeImageResult;
import com.azure.ai.contentsafety.models.AnalyzeTextOptions;
import com.azure.ai.contentsafety.models.AnalyzeTextResult;
import com.azure.ai.contentsafety.models.ContentSafetyImageData;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/**
 * Initializes a new instance of the asynchronous ContentSafetyClient type.
 */
@ServiceClient(builder = ContentSafetyClientBuilder.class, isAsync = true)
public final class ContentSafetyAsyncClient {

    @Generated
    private final ContentSafetyClientImpl serviceClient;

    /**
     * Initializes an instance of ContentSafetyAsyncClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    ContentSafetyAsyncClient(ContentSafetyClientImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Analyze Text
     *
     * A synchronous API for the analysis of potentially harmful text content. Currently, it supports four categories:
     * Hate, SelfHarm, Sexual, and Violence.
     * <p>
     * <strong>Request Body Schema</strong>
     * </p>
     * <pre>{@code
     * {
     *     text: String (Required)
     *     categories (Optional): [
     *         String(Hate/SelfHarm/Sexual/Violence) (Optional)
     *     ]
     *     blocklistNames (Optional): [
     *         String (Optional)
     *     ]
     *     haltOnBlocklistHit: Boolean (Optional)
     *     outputType: String(FourSeverityLevels/EightSeverityLevels) (Optional)
     * }
     * }</pre>
     * <p>
     * <strong>Response Body Schema</strong>
     * </p>
     * <pre>{@code
     * {
     *     blocklistsMatch (Optional): [
     *          (Optional){
     *             blocklistName: String (Required)
     *             blocklistItemId: String (Required)
     *             blocklistItemText: String (Required)
     *         }
     *     ]
     *     categoriesAnalysis (Required): [
     *          (Required){
     *             category: String(Hate/SelfHarm/Sexual/Violence) (Required)
     *             severity: Integer (Optional)
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param options The text analysis request.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the text analysis response along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> analyzeTextWithResponse(BinaryData options, RequestOptions requestOptions) {
        return this.serviceClient.analyzeTextWithResponseAsync(options, requestOptions);
    }

    /**
     * Analyze Image
     *
     * A synchronous API for the analysis of potentially harmful image content. Currently, it supports four categories:
     * Hate, SelfHarm, Sexual, and Violence.
     * <p>
     * <strong>Request Body Schema</strong>
     * </p>
     * <pre>{@code
     * {
     *     image (Required): {
     *         content: byte[] (Optional)
     *         blobUrl: String (Optional)
     *     }
     *     categories (Optional): [
     *         String(Hate/SelfHarm/Sexual/Violence) (Optional)
     *     ]
     *     outputType: String(FourSeverityLevels) (Optional)
     * }
     * }</pre>
     * <p>
     * <strong>Response Body Schema</strong>
     * </p>
     * <pre>{@code
     * {
     *     categoriesAnalysis (Required): [
     *          (Required){
     *             category: String(Hate/SelfHarm/Sexual/Violence) (Required)
     *             severity: Integer (Optional)
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param options The image analysis request.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the image analysis response along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> analyzeImageWithResponse(BinaryData options, RequestOptions requestOptions) {
        return this.serviceClient.analyzeImageWithResponseAsync(options, requestOptions);
    }

    /**
     * Analyze Text
     *
     * A synchronous API for the analysis of potentially harmful text content. Currently, it supports four categories:
     * Hate, SelfHarm, Sexual, and Violence.
     *
     * @param text The text analysis request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the text analysis response on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AnalyzeTextResult> analyzeText(String text) {
        // Customized convenience method for analyzeText
        AnalyzeTextOptions options = new AnalyzeTextOptions(text);
        return analyzeText(options);
    }

    /**
     * Analyze Text
     *
     * A synchronous API for the analysis of potentially harmful text content. Currently, it supports four categories:
     * Hate, SelfHarm, Sexual, and Violence.
     *
     * @param options The text analysis request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the text analysis response on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AnalyzeTextResult> analyzeText(AnalyzeTextOptions options) {
        // Generated convenience method for analyzeTextWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return analyzeTextWithResponse(BinaryData.fromObject(options), requestOptions).flatMap(FluxUtil::toMono)
            .map(protocolMethodData -> protocolMethodData.toObject(AnalyzeTextResult.class));
    }

    /**
     * Analyze Image
     *
     * A synchronous API for the analysis of potentially harmful image content. Currently, it supports four categories:
     * Hate, SelfHarm, Sexual, and Violence.
     *
     * @param options The image analysis request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the image analysis response on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AnalyzeImageResult> analyzeImage(AnalyzeImageOptions options) {
        // Generated convenience method for analyzeImageWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return analyzeImageWithResponse(BinaryData.fromObject(options), requestOptions).flatMap(FluxUtil::toMono)
            .map(protocolMethodData -> protocolMethodData.toObject(AnalyzeImageResult.class));
    }

    /**
     * Analyze Image
     *
     * A synchronous API for the analysis of potentially harmful image content. Currently, it supports four categories:
     * Hate, SelfHarm, Sexual, and Violence.
     *
     * @param blobUrl The image analysis request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the image analysis response on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AnalyzeImageResult> analyzeImage(String blobUrl) {
        /// Customized convenience method for analyzeImage
        AnalyzeImageOptions options = new AnalyzeImageOptions(new ContentSafetyImageData().setBlobUrl(blobUrl));
        return analyzeImage(options);
    }

    /**
     * Analyze Image
     *
     * A synchronous API for the analysis of potentially harmful image content. Currently, it supports four categories:
     * Hate, SelfHarm, Sexual, and Violence.
     *
     * @param content The image analysis request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the image analysis response on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AnalyzeImageResult> analyzeImage(BinaryData content) {
        /// Customized convenience method for analyzeImage
        AnalyzeImageOptions options = new AnalyzeImageOptions(new ContentSafetyImageData().setContent(content));
        return analyzeImage(options);
    }
}
