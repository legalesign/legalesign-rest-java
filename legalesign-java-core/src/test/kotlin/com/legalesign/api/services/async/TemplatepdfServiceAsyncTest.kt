// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.services.async

import com.legalesign.api.TestServerExtension
import com.legalesign.api.client.okhttp.LegalesignOkHttpClientAsync
import com.legalesign.api.models.templatepdf.TemplatepdfCreateParams
import com.legalesign.api.models.templatepdf.TemplatepdfListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TemplatepdfServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LegalesignOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val templatepdfServiceAsync = client.templatepdf()

        val future =
            templatepdfServiceAsync.create(
                TemplatepdfCreateParams.builder()
                    .group("/api/v1/group/IK-GV--w1tvt/")
                    .pdfFile("U3RhaW5sZXNzIHJvY2tz")
                    .archiveUponSend(true)
                    .processTags(true)
                    .title("title")
                    .user("user")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LegalesignOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val templatepdfServiceAsync = client.templatepdf()

        val templatePdfFuture =
            templatepdfServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val templatePdf = templatePdfFuture.get()
        templatePdf.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LegalesignOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val templatepdfServiceAsync = client.templatepdf()

        val templatepdfsFuture =
            templatepdfServiceAsync.list(
                TemplatepdfListParams.builder()
                    .archive("archive")
                    .group("group")
                    .limit(0L)
                    .offset(0L)
                    .build()
            )

        val templatepdfs = templatepdfsFuture.get()
        templatepdfs.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun archive() {
        val client =
            LegalesignOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val templatepdfServiceAsync = client.templatepdf()

        val future = templatepdfServiceAsync.archive("pdfId")

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun convertTags() {
        val client =
            LegalesignOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val templatepdfServiceAsync = client.templatepdf()

        val future = templatepdfServiceAsync.convertTags("pdfId")

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getEditLink() {
        val client =
            LegalesignOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val templatepdfServiceAsync = client.templatepdf()

        val responseFuture =
            templatepdfServiceAsync.getEditLink("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = responseFuture.get()
    }
}
