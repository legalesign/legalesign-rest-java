// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.templatepdf

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.legalesign.api.core.jsonMapper
import com.legalesign.api.models.attachment.ListMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplatepdfListResponseTest {

    @Test
    fun create() {
        val templatepdfListResponse =
            TemplatepdfListResponse.builder()
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
                    TemplatePdf.builder()
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .group("/api/v1/group/my-group/")
                        .modified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .pageCount(10L)
                        .parties("[\"Signer\", \"Witness\", \"Approvers\"]")
                        .resourceUri("api/v1/templatepdf/p0p0p0p0-p0p0-p0p0-p0p0-p0p0p0p0p0p0/")
                        .signerCount(0L)
                        .title("Template Supplier Agreement")
                        .user("/api/v1/user/34034334ab34334333rh33434334f9/")
                        .uuid("p0p0p0p0-p0p0-p0p0-p0p0-p0p0p0p0p0p0")
                        .valid(true)
                        .build()
                )
                .build()

        assertThat(templatepdfListResponse.meta())
            .contains(
                ListMeta.builder()
                    .limit(0)
                    .next("next")
                    .offset(0)
                    .previous("previous")
                    .totalCount(0)
                    .build()
            )
        assertThat(templatepdfListResponse.objects().getOrNull())
            .containsExactly(
                TemplatePdf.builder()
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .group("/api/v1/group/my-group/")
                    .modified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .pageCount(10L)
                    .parties("[\"Signer\", \"Witness\", \"Approvers\"]")
                    .resourceUri("api/v1/templatepdf/p0p0p0p0-p0p0-p0p0-p0p0-p0p0p0p0p0p0/")
                    .signerCount(0L)
                    .title("Template Supplier Agreement")
                    .user("/api/v1/user/34034334ab34334333rh33434334f9/")
                    .uuid("p0p0p0p0-p0p0-p0p0-p0p0-p0p0p0p0p0p0")
                    .valid(true)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val templatepdfListResponse =
            TemplatepdfListResponse.builder()
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
                    TemplatePdf.builder()
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .group("/api/v1/group/my-group/")
                        .modified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .pageCount(10L)
                        .parties("[\"Signer\", \"Witness\", \"Approvers\"]")
                        .resourceUri("api/v1/templatepdf/p0p0p0p0-p0p0-p0p0-p0p0-p0p0p0p0p0p0/")
                        .signerCount(0L)
                        .title("Template Supplier Agreement")
                        .user("/api/v1/user/34034334ab34334333rh33434334f9/")
                        .uuid("p0p0p0p0-p0p0-p0p0-p0p0-p0p0p0p0p0p0")
                        .valid(true)
                        .build()
                )
                .build()

        val roundtrippedTemplatepdfListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(templatepdfListResponse),
                jacksonTypeRef<TemplatepdfListResponse>(),
            )

        assertThat(roundtrippedTemplatepdfListResponse).isEqualTo(templatepdfListResponse)
    }
}
