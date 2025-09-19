// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.services.blocking

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.legalesign.api.TestServerExtension
import com.legalesign.api.client.okhttp.LegalesignOkHttpClient
import com.legalesign.api.core.JsonValue
import com.legalesign.api.models.document.DocumentCreateParams
import com.legalesign.api.models.document.DocumentListParams
import com.legalesign.api.models.document.DocumentPreviewParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.parallel.ResourceLock

@ExtendWith(TestServerExtension::class)
@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class DocumentServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LegalesignOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val documentService = client.document()

        val document =
            documentService.create(
                DocumentCreateParams.builder()
                    .group("https://example.com")
                    .name("x")
                    .addSigner(
                        DocumentCreateParams.Signer.builder()
                            .email("dev@stainless.com")
                            .firstname("firstname")
                            .lastname("lastname")
                            .addAttachment("/api/v1/attachment/IK-GV--w1tvt/")
                            .behalfof("behalfof")
                            .decideLater(true)
                            .expires(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .message("message")
                            .order(0)
                            .addReviewer(
                                DocumentCreateParams.Signer.Reviewer.builder()
                                    .email("dev@stainless.com")
                                    .firstname("firstname")
                                    .includeLink(true)
                                    .lastname("lastname")
                                    .build()
                            )
                            .role(DocumentCreateParams.Signer.Role.WITNESS)
                            .sms("sms")
                            .subject("subject")
                            .timezone("timezone")
                            .build()
                    )
                    .appendPdf(true)
                    .autoArchive(true)
                    .ccEmails("cc_emails")
                    .convertSenderToSigner(true)
                    .doEmail(true)
                    .footer("footer")
                    .footerHeight(0L)
                    .header("header")
                    .headerHeight(0L)
                    .pdfPassword("pdf_password")
                    .pdfPasswordType(DocumentCreateParams.PdfPasswordType._1)
                    .pdftext(
                        DocumentCreateParams.Pdftext.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .redirect("https://")
                    .reminders("")
                    .returnSignerLinks(true)
                    .signatureType(0L)
                    .signersInOrder(true)
                    .signertext(
                        DocumentCreateParams.Signertext.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .strictFields(true)
                    .tag("tag")
                    .tag1("tag1")
                    .tag2("tag2")
                    .template("https://example.com")
                    .templatepdf("https://example.com")
                    .text("text")
                    .user("https://example.com")
                    .build()
            )

        document.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LegalesignOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val documentService = client.document()

        val document = documentService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        document.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LegalesignOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val documentService = client.document()

        val documents =
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
                    .build()
            )

        documents.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun archive() {
        val client =
            LegalesignOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val documentService = client.document()

        documentService.archive("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deletePermanently() {
        val client =
            LegalesignOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val documentService = client.document()

        documentService.deletePermanently("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun downloadAuditLog(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            LegalesignOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
        val documentService = client.document()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response = documentService.downloadAuditLog("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getFields() {
        val client =
            LegalesignOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val documentService = client.document()

        val response = documentService.getFields("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        response.forEach { it.validate() }
    }

    @Disabled("Prism doesn't properly handle redirects")
    @Test
    fun preview() {
        val client =
            LegalesignOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val documentService = client.document()

        documentService.preview(
            DocumentPreviewParams.builder()
                .group("/api/v1/group/IK-GV--w1tvt/")
                .signeeCount(0)
                .text("text")
                .title("title")
                .build()
        )
    }
}
