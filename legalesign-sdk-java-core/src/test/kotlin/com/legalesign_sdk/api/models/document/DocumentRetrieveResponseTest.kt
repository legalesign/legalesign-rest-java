// File generated from our OpenAPI spec by Stainless.

package com.legalesign_sdk.api.models.document

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.legalesign_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentRetrieveResponseTest {

    @Test
    fun create() {
        val documentRetrieveResponse =
            DocumentRetrieveResponse.builder()
                .archived(true)
                .autoArchive(true)
                .ccEmails("cc_emails")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .doEmail(true)
                .downloadFinal(true)
                .footer("footer")
                .footerHeight(0L)
                .group("group")
                .hasFields(true)
                .hashValue("hash_value")
                .header("header")
                .headerHeight(0L)
                .modified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .pdfPassword("pdf_password")
                .pdfPasswordType("pdf_password_type")
                .pdftext("pdftext")
                .redirect("redirect")
                .resourceUri("resource_uri")
                .returnSignerLinks(true)
                .signMouse(true)
                .signTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .signType(true)
                .signUpload(true)
                .signaturePlacement(0L)
                .signatureType(0L)
                .addSigner(listOf("string"))
                .signersInOrder(true)
                .status(DocumentStatusEnum._10)
                .tag("tag")
                .tag1("tag1")
                .tag2("tag2")
                .template("template")
                .templatepdf("templatepdf")
                .text("text")
                .user("user")
                .uuid("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(documentRetrieveResponse.archived()).contains(true)
        assertThat(documentRetrieveResponse.autoArchive()).contains(true)
        assertThat(documentRetrieveResponse.ccEmails()).contains("cc_emails")
        assertThat(documentRetrieveResponse.created())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(documentRetrieveResponse.doEmail()).contains(true)
        assertThat(documentRetrieveResponse.downloadFinal()).contains(true)
        assertThat(documentRetrieveResponse.footer()).contains("footer")
        assertThat(documentRetrieveResponse.footerHeight()).contains(0L)
        assertThat(documentRetrieveResponse.group()).contains("group")
        assertThat(documentRetrieveResponse.hasFields()).contains(true)
        assertThat(documentRetrieveResponse.hashValue()).contains("hash_value")
        assertThat(documentRetrieveResponse.header()).contains("header")
        assertThat(documentRetrieveResponse.headerHeight()).contains(0L)
        assertThat(documentRetrieveResponse.modified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(documentRetrieveResponse.name()).contains("name")
        assertThat(documentRetrieveResponse.pdfPassword()).contains("pdf_password")
        assertThat(documentRetrieveResponse.pdfPasswordType()).contains("pdf_password_type")
        assertThat(documentRetrieveResponse.pdftext()).contains("pdftext")
        assertThat(documentRetrieveResponse.redirect()).contains("redirect")
        assertThat(documentRetrieveResponse.resourceUri()).contains("resource_uri")
        assertThat(documentRetrieveResponse.returnSignerLinks()).contains(true)
        assertThat(documentRetrieveResponse.signMouse()).contains(true)
        assertThat(documentRetrieveResponse.signTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(documentRetrieveResponse.signType()).contains(true)
        assertThat(documentRetrieveResponse.signUpload()).contains(true)
        assertThat(documentRetrieveResponse.signaturePlacement()).contains(0L)
        assertThat(documentRetrieveResponse.signatureType()).contains(0L)
        assertThat(documentRetrieveResponse.signers().getOrNull()).containsExactly(listOf("string"))
        assertThat(documentRetrieveResponse.signersInOrder()).contains(true)
        assertThat(documentRetrieveResponse.status()).contains(DocumentStatusEnum._10)
        assertThat(documentRetrieveResponse.tag()).contains("tag")
        assertThat(documentRetrieveResponse.tag1()).contains("tag1")
        assertThat(documentRetrieveResponse.tag2()).contains("tag2")
        assertThat(documentRetrieveResponse.template()).contains("template")
        assertThat(documentRetrieveResponse.templatepdf()).contains("templatepdf")
        assertThat(documentRetrieveResponse.text()).contains("text")
        assertThat(documentRetrieveResponse.user()).contains("user")
        assertThat(documentRetrieveResponse.uuid()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val documentRetrieveResponse =
            DocumentRetrieveResponse.builder()
                .archived(true)
                .autoArchive(true)
                .ccEmails("cc_emails")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .doEmail(true)
                .downloadFinal(true)
                .footer("footer")
                .footerHeight(0L)
                .group("group")
                .hasFields(true)
                .hashValue("hash_value")
                .header("header")
                .headerHeight(0L)
                .modified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .pdfPassword("pdf_password")
                .pdfPasswordType("pdf_password_type")
                .pdftext("pdftext")
                .redirect("redirect")
                .resourceUri("resource_uri")
                .returnSignerLinks(true)
                .signMouse(true)
                .signTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .signType(true)
                .signUpload(true)
                .signaturePlacement(0L)
                .signatureType(0L)
                .addSigner(listOf("string"))
                .signersInOrder(true)
                .status(DocumentStatusEnum._10)
                .tag("tag")
                .tag1("tag1")
                .tag2("tag2")
                .template("template")
                .templatepdf("templatepdf")
                .text("text")
                .user("user")
                .uuid("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedDocumentRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(documentRetrieveResponse),
                jacksonTypeRef<DocumentRetrieveResponse>(),
            )

        assertThat(roundtrippedDocumentRetrieveResponse).isEqualTo(documentRetrieveResponse)
    }
}
