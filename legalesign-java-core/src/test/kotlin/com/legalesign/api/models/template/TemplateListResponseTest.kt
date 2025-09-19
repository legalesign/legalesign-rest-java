// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.template

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.legalesign.api.core.jsonMapper
import com.legalesign.api.models.attachment.ListMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplateListResponseTest {

    @Test
    fun create() {
        val templateListResponse =
            TemplateListResponse.builder()
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
                    TemplateListResponse.Object.builder()
                        .archive(false)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .group("/api/v1/group/my-group/")
                        .hasFields(false)
                        .modified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .resourceUri("/api/v1/template/t0t0t0t0-t0t0-t0t0-t0t0-t0t0t0t0t0t0/")
                        .signeeCount(1)
                        .title("Test text template")
                        .user("/api/v1/user/34034334ab34334333rh33434334f9/")
                        .uuid("t0t0t0t0-t0t0-t0t0-t0t0-t0t0t0t0t0t0")
                        .build()
                )
                .build()

        assertThat(templateListResponse.meta())
            .contains(
                ListMeta.builder()
                    .limit(0)
                    .next("next")
                    .offset(0)
                    .previous("previous")
                    .totalCount(0)
                    .build()
            )
        assertThat(templateListResponse.objects().getOrNull())
            .containsExactly(
                TemplateListResponse.Object.builder()
                    .archive(false)
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .group("/api/v1/group/my-group/")
                    .hasFields(false)
                    .modified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .resourceUri("/api/v1/template/t0t0t0t0-t0t0-t0t0-t0t0-t0t0t0t0t0t0/")
                    .signeeCount(1)
                    .title("Test text template")
                    .user("/api/v1/user/34034334ab34334333rh33434334f9/")
                    .uuid("t0t0t0t0-t0t0-t0t0-t0t0-t0t0t0t0t0t0")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val templateListResponse =
            TemplateListResponse.builder()
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
                    TemplateListResponse.Object.builder()
                        .archive(false)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .group("/api/v1/group/my-group/")
                        .hasFields(false)
                        .modified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .resourceUri("/api/v1/template/t0t0t0t0-t0t0-t0t0-t0t0-t0t0t0t0t0t0/")
                        .signeeCount(1)
                        .title("Test text template")
                        .user("/api/v1/user/34034334ab34334333rh33434334f9/")
                        .uuid("t0t0t0t0-t0t0-t0t0-t0t0-t0t0t0t0t0t0")
                        .build()
                )
                .build()

        val roundtrippedTemplateListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(templateListResponse),
                jacksonTypeRef<TemplateListResponse>(),
            )

        assertThat(roundtrippedTemplateListResponse).isEqualTo(templateListResponse)
    }
}
