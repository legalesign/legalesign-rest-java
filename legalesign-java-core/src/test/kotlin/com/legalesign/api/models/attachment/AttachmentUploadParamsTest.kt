// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.attachment

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AttachmentUploadParamsTest {

    @Test
    fun create() {
        AttachmentUploadParams.builder()
            .filename("IK-GV--w1tvt7pdf")
            .group("/api/v1/group/IK-GV--w1tvt/")
            .pdfFile("U3RhaW5sZXNzIHJvY2tz")
            .description("description")
            .user("/api/v1/user/IK-GV--w1tvt/")
            .build()
    }

    @Test
    fun body() {
        val params =
            AttachmentUploadParams.builder()
                .filename("IK-GV--w1tvt7pdf")
                .group("/api/v1/group/IK-GV--w1tvt/")
                .pdfFile("U3RhaW5sZXNzIHJvY2tz")
                .description("description")
                .user("/api/v1/user/IK-GV--w1tvt/")
                .build()

        val body = params._body()

        assertThat(body.filename()).isEqualTo("IK-GV--w1tvt7pdf")
        assertThat(body.group()).isEqualTo("/api/v1/group/IK-GV--w1tvt/")
        assertThat(body.pdfFile()).isEqualTo("U3RhaW5sZXNzIHJvY2tz")
        assertThat(body.description()).contains("description")
        assertThat(body.user()).contains("/api/v1/user/IK-GV--w1tvt/")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AttachmentUploadParams.builder()
                .filename("IK-GV--w1tvt7pdf")
                .group("/api/v1/group/IK-GV--w1tvt/")
                .pdfFile("U3RhaW5sZXNzIHJvY2tz")
                .build()

        val body = params._body()

        assertThat(body.filename()).isEqualTo("IK-GV--w1tvt7pdf")
        assertThat(body.group()).isEqualTo("/api/v1/group/IK-GV--w1tvt/")
        assertThat(body.pdfFile()).isEqualTo("U3RhaW5sZXNzIHJvY2tz")
    }
}
