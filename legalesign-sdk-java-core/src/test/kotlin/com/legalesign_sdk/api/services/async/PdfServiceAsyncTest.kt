// File generated from our OpenAPI spec by Stainless.

package com.legalesign_sdk.api.services.async

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.legalesign_sdk.api.TestServerExtension
import com.legalesign_sdk.api.client.okhttp.LegalesignSdkOkHttpClientAsync
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.parallel.ResourceLock

@ExtendWith(TestServerExtension::class)
@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class PdfServiceAsyncTest {

    @Test
    fun retrieve(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            LegalesignSdkOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
        val pdfServiceAsync = client.pdf()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val pdfFuture = pdfServiceAsync.retrieve("docId")

        val pdf = pdfFuture.get()
        assertThat(pdf.body()).hasContent("abc")
    }
}
