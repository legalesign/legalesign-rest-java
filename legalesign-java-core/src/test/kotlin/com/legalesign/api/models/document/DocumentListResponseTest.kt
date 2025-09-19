// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.document

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.legalesign.api.core.jsonMapper
import com.legalesign.api.models.attachment.ListMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentListResponseTest {

    @Test
    fun create() {
        val documentListResponse =
            DocumentListResponse.builder()
                .meta(
                    ListMeta.builder()
                        .limit(0)
                        .next("next")
                        .offset(0)
                        .previous("previous")
                        .totalCount(0)
                        .build()
                )
                .addObject(
                    DocumentListResponse.Object.builder()
                        .archived(false)
                        .autoArchive(true)
                        .ccEmails("None")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .doEmail(false)
                        .downloadFinal(false)
                        .group("/api/v1/group/my-group/")
                        .modified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("test cs_agreement")
                        .pdftext("None")
                        .redirect("https://example.com/redirect-receive/")
                        .resourceUri("/api/v1/document/d0d0d0d0-d0fd0-d0d0-d0d0-d0d0d0d0d0d0/")
                        .returnSignerLinks(true)
                        .addSigner(
                            listOf(
                                "string",
                                "string",
                                "string",
                                "string",
                                "string",
                                "string",
                                "string",
                                "string",
                            )
                        )
                        .addSigner(
                            listOf(
                                "string",
                                "string",
                                "string",
                                "string",
                                "string",
                                "string",
                                "string",
                                "string",
                            )
                        )
                        .signersInOrder(DocumentListResponse.Object.SignersInOrder._0)
                        .status(DocumentStatusEnum._10)
                        .tag("contract2020myref")
                        .tag1("my_other_ref")
                        .tag2("andFinalRef")
                        .template("None")
                        .templatepdf("/api/v1/templatepdf/p0p0p0p0-p0p0-p0p0-p0p0-p0p0p0p0p0p0/")
                        .text("")
                        .user("/api/v1/user/u0u0u0u0-u0u0-u0u0-u0u0-u0u0u0u0u0u0/")
                        .uuid("d0d0d0d0-d0fd0-d0d0-d0d0-d0d0d0d0d0d0")
                        .build()
                )
                .build()

        assertThat(documentListResponse.meta())
            .contains(
                ListMeta.builder()
                    .limit(0)
                    .next("next")
                    .offset(0)
                    .previous("previous")
                    .totalCount(0)
                    .build()
            )
        assertThat(documentListResponse.objects().getOrNull())
            .containsExactly(
                DocumentListResponse.Object.builder()
                    .archived(false)
                    .autoArchive(true)
                    .ccEmails("None")
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .doEmail(false)
                    .downloadFinal(false)
                    .group("/api/v1/group/my-group/")
                    .modified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .name("test cs_agreement")
                    .pdftext("None")
                    .redirect("https://example.com/redirect-receive/")
                    .resourceUri("/api/v1/document/d0d0d0d0-d0fd0-d0d0-d0d0-d0d0d0d0d0d0/")
                    .returnSignerLinks(true)
                    .addSigner(
                        listOf(
                            "string",
                            "string",
                            "string",
                            "string",
                            "string",
                            "string",
                            "string",
                            "string",
                        )
                    )
                    .addSigner(
                        listOf(
                            "string",
                            "string",
                            "string",
                            "string",
                            "string",
                            "string",
                            "string",
                            "string",
                        )
                    )
                    .signersInOrder(DocumentListResponse.Object.SignersInOrder._0)
                    .status(DocumentStatusEnum._10)
                    .tag("contract2020myref")
                    .tag1("my_other_ref")
                    .tag2("andFinalRef")
                    .template("None")
                    .templatepdf("/api/v1/templatepdf/p0p0p0p0-p0p0-p0p0-p0p0-p0p0p0p0p0p0/")
                    .text("")
                    .user("/api/v1/user/u0u0u0u0-u0u0-u0u0-u0u0-u0u0u0u0u0u0/")
                    .uuid("d0d0d0d0-d0fd0-d0d0-d0d0-d0d0d0d0d0d0")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val documentListResponse =
            DocumentListResponse.builder()
                .meta(
                    ListMeta.builder()
                        .limit(0)
                        .next("next")
                        .offset(0)
                        .previous("previous")
                        .totalCount(0)
                        .build()
                )
                .addObject(
                    DocumentListResponse.Object.builder()
                        .archived(false)
                        .autoArchive(true)
                        .ccEmails("None")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .doEmail(false)
                        .downloadFinal(false)
                        .group("/api/v1/group/my-group/")
                        .modified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("test cs_agreement")
                        .pdftext("None")
                        .redirect("https://example.com/redirect-receive/")
                        .resourceUri("/api/v1/document/d0d0d0d0-d0fd0-d0d0-d0d0-d0d0d0d0d0d0/")
                        .returnSignerLinks(true)
                        .addSigner(
                            listOf(
                                "string",
                                "string",
                                "string",
                                "string",
                                "string",
                                "string",
                                "string",
                                "string",
                            )
                        )
                        .addSigner(
                            listOf(
                                "string",
                                "string",
                                "string",
                                "string",
                                "string",
                                "string",
                                "string",
                                "string",
                            )
                        )
                        .signersInOrder(DocumentListResponse.Object.SignersInOrder._0)
                        .status(DocumentStatusEnum._10)
                        .tag("contract2020myref")
                        .tag1("my_other_ref")
                        .tag2("andFinalRef")
                        .template("None")
                        .templatepdf("/api/v1/templatepdf/p0p0p0p0-p0p0-p0p0-p0p0-p0p0p0p0p0p0/")
                        .text("")
                        .user("/api/v1/user/u0u0u0u0-u0u0-u0u0-u0u0-u0u0u0u0u0u0/")
                        .uuid("d0d0d0d0-d0fd0-d0d0-d0d0-d0d0d0d0d0d0")
                        .build()
                )
                .build()

        val roundtrippedDocumentListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(documentListResponse),
                jacksonTypeRef<DocumentListResponse>(),
            )

        assertThat(roundtrippedDocumentListResponse).isEqualTo(documentListResponse)
    }
}
