// File generated from our OpenAPI spec by Stainless.

package com.legalesign_sdk.api.services

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.legalesign_sdk.api.client.LegalesignSdkClient
import com.legalesign_sdk.api.client.okhttp.LegalesignSdkOkHttpClient
import com.legalesign_sdk.api.models.document.DocumentListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ServiceParamsTest {

    private lateinit var client: LegalesignSdkClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            LegalesignSdkOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val documentService = client.document()
        stubFor(get(anyUrl()).willReturn(ok("{}")))

        documentService.list(
            DocumentListParams.builder()
                .group("group")
                .archived("archived")
                .createdGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .email("email")
                .limit(0L)
                .modifiedGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .nosigners("nosigners")
                .offset(0L)
                .status(0L)
                .putAdditionalHeader("Secret-Header", "42")
                .putAdditionalQueryParam("secret_query_param", "42")
                .build()
        )

        verify(
            getRequestedFor(anyUrl())
                .withHeader("Secret-Header", equalTo("42"))
                .withQueryParam("secret_query_param", equalTo("42"))
        )
    }
}
