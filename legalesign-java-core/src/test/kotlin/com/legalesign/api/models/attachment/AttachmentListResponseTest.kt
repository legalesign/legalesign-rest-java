// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.attachment

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.legalesign.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AttachmentListResponseTest {

    @Test
    fun create() {
        val attachmentListResponse =
            AttachmentListResponse.builder()
                .meta(
                    ListMeta.builder()
                        .limit(20)
                        .next("/api/v1/attachment/?offset=20&limit=20")
                        .offset(0)
                        .previous("None")
                        .totalCount(26)
                        .build()
                )
                .addObject(
                    AttachmentResponse.builder()
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("Attachment for supplier contract")
                        .filename("attach1.pdf")
                        .group("group")
                        .resourceUri("/api/v1/attachment/f0f0f0f0-f0f0-f0f0-f0f0-f0f0f0f0f0f0/")
                        .user("user")
                        .uuid("f0f0f0f0-f0f0-f0f0-f0f0-f0f0f0f0f0f0")
                        .build()
                )
                .build()

        assertThat(attachmentListResponse.meta())
            .contains(
                ListMeta.builder()
                    .limit(20)
                    .next("/api/v1/attachment/?offset=20&limit=20")
                    .offset(0)
                    .previous("None")
                    .totalCount(26)
                    .build()
            )
        assertThat(attachmentListResponse.objects().getOrNull())
            .containsExactly(
                AttachmentResponse.builder()
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("Attachment for supplier contract")
                    .filename("attach1.pdf")
                    .group("group")
                    .resourceUri("/api/v1/attachment/f0f0f0f0-f0f0-f0f0-f0f0-f0f0f0f0f0f0/")
                    .user("user")
                    .uuid("f0f0f0f0-f0f0-f0f0-f0f0-f0f0f0f0f0f0")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val attachmentListResponse =
            AttachmentListResponse.builder()
                .meta(
                    ListMeta.builder()
                        .limit(20)
                        .next("/api/v1/attachment/?offset=20&limit=20")
                        .offset(0)
                        .previous("None")
                        .totalCount(26)
                        .build()
                )
                .addObject(
                    AttachmentResponse.builder()
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("Attachment for supplier contract")
                        .filename("attach1.pdf")
                        .group("group")
                        .resourceUri("/api/v1/attachment/f0f0f0f0-f0f0-f0f0-f0f0-f0f0f0f0f0f0/")
                        .user("user")
                        .uuid("f0f0f0f0-f0f0-f0f0-f0f0-f0f0f0f0f0f0")
                        .build()
                )
                .build()

        val roundtrippedAttachmentListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(attachmentListResponse),
                jacksonTypeRef<AttachmentListResponse>(),
            )

        assertThat(roundtrippedAttachmentListResponse).isEqualTo(attachmentListResponse)
    }
}
