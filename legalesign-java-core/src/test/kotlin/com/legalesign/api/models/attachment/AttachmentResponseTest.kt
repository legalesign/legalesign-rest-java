// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.attachment

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.legalesign.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AttachmentResponseTest {

    @Test
    fun create() {
        val attachmentResponse =
            AttachmentResponse.builder()
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("Attachment for supplier contract")
                .filename("attach1.pdf")
                .group("group")
                .resourceUri("/api/v1/attachment/f0f0f0f0-f0f0-f0f0-f0f0-f0f0f0f0f0f0/")
                .user("user")
                .uuid("f0f0f0f0-f0f0-f0f0-f0f0-f0f0f0f0f0f0")
                .build()

        assertThat(attachmentResponse.created())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(attachmentResponse.description()).contains("Attachment for supplier contract")
        assertThat(attachmentResponse.filename()).contains("attach1.pdf")
        assertThat(attachmentResponse.group()).contains("group")
        assertThat(attachmentResponse.resourceUri())
            .contains("/api/v1/attachment/f0f0f0f0-f0f0-f0f0-f0f0-f0f0f0f0f0f0/")
        assertThat(attachmentResponse.user()).contains("user")
        assertThat(attachmentResponse.uuid()).contains("f0f0f0f0-f0f0-f0f0-f0f0-f0f0f0f0f0f0")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val attachmentResponse =
            AttachmentResponse.builder()
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("Attachment for supplier contract")
                .filename("attach1.pdf")
                .group("group")
                .resourceUri("/api/v1/attachment/f0f0f0f0-f0f0-f0f0-f0f0-f0f0f0f0f0f0/")
                .user("user")
                .uuid("f0f0f0f0-f0f0-f0f0-f0f0-f0f0f0f0f0f0")
                .build()

        val roundtrippedAttachmentResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(attachmentResponse),
                jacksonTypeRef<AttachmentResponse>(),
            )

        assertThat(roundtrippedAttachmentResponse).isEqualTo(attachmentResponse)
    }
}
