// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.services.blocking

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.legalesign.api.TestServerExtension
import com.legalesign.api.client.okhttp.LegalesignOkHttpClient
import com.legalesign.api.models.pdf.PdfCreatePreviewParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.parallel.ResourceLock

@ExtendWith(TestServerExtension::class)
@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class PdfServiceTest {

    @Test
    fun retrieve(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            LegalesignOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
        val pdfService = client.pdf()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val pdf = pdfService.retrieve("docId")

        assertThat(pdf.body()).hasContent("abc")
    }

    @Test
    fun createPreview(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            LegalesignOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
        val pdfService = client.pdf()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            pdfService.createPreview(
                PdfCreatePreviewParams.builder()
                    .group("/api/v1/group/IK-GV--w1tvt/")
                    .isSignaturePerPage(0L)
                    .signatureType(0L)
                    .signeeCount(0)
                    .text("text")
                    .footer("footer")
                    .footerHeight(0L)
                    .header("header")
                    .headerHeight(0L)
                    .pdfheader(true)
                    .title("title")
                    .build()
            )

        assertThat(response.body()).hasContent("abc")
    }
}
