// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.templatepdf

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.legalesign.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplatePdfTest {

    @Test
    fun create() {
        val templatePdf =
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

        assertThat(templatePdf.created()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(templatePdf.group()).contains("/api/v1/group/my-group/")
        assertThat(templatePdf.modified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(templatePdf.pageCount()).contains(10L)
        assertThat(templatePdf.parties()).contains("[\"Signer\", \"Witness\", \"Approvers\"]")
        assertThat(templatePdf.resourceUri())
            .contains("api/v1/templatepdf/p0p0p0p0-p0p0-p0p0-p0p0-p0p0p0p0p0p0/")
        assertThat(templatePdf.signerCount()).contains(0L)
        assertThat(templatePdf.title()).contains("Template Supplier Agreement")
        assertThat(templatePdf.user()).contains("/api/v1/user/34034334ab34334333rh33434334f9/")
        assertThat(templatePdf.uuid()).contains("p0p0p0p0-p0p0-p0p0-p0p0-p0p0p0p0p0p0")
        assertThat(templatePdf.valid()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val templatePdf =
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

        val roundtrippedTemplatePdf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(templatePdf),
                jacksonTypeRef<TemplatePdf>(),
            )

        assertThat(roundtrippedTemplatePdf).isEqualTo(templatePdf)
    }
}
