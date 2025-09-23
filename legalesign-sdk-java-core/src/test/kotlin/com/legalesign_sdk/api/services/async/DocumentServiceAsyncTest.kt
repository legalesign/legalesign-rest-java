// File generated from our OpenAPI spec by Stainless.

package com.legalesign_sdk.api.services.async

import com.legalesign_sdk.api.TestServerExtension
import com.legalesign_sdk.api.client.okhttp.LegalesignSdkOkHttpClientAsync
import com.legalesign_sdk.api.core.JsonValue
import com.legalesign_sdk.api.models.document.DocumentCreateParams
import com.legalesign_sdk.api.models.document.DocumentListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DocumentServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LegalesignSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val documentServiceAsync = client.document()

        val documentFuture =
            documentServiceAsync.create(
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

        val document = documentFuture.get()
        document.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LegalesignSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val documentServiceAsync = client.document()

        val documentFuture = documentServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val document = documentFuture.get()
        document.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LegalesignSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val documentServiceAsync = client.document()

        val documentsFuture =
            documentServiceAsync.list(
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

        val documents = documentsFuture.get()
        documents.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun archive() {
        val client =
            LegalesignSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val documentServiceAsync = client.document()

        val future = documentServiceAsync.archive("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getFields() {
        val client =
            LegalesignSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val documentServiceAsync = client.document()

        val responseFuture = documentServiceAsync.getFields("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun permanentlyDelete() {
        val client =
            LegalesignSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val documentServiceAsync = client.document()

        val future = documentServiceAsync.permanentlyDelete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = future.get()
    }
}
