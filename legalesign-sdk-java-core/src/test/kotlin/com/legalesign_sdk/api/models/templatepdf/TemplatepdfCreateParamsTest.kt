// File generated from our OpenAPI spec by Stainless.

package com.legalesign_sdk.api.models.templatepdf

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplatepdfCreateParamsTest {

    @Test
    fun create() {
        TemplatepdfCreateParams.builder()
            .group("/api/v1/group/IK-GV--w1tvt/")
            .pdfFile("U3RhaW5sZXNzIHJvY2tz")
            .archiveUponSend(true)
            .processTags(true)
            .title("title")
            .user("user")
            .build()
    }

    @Test
    fun body() {
        val params =
            TemplatepdfCreateParams.builder()
                .group("/api/v1/group/IK-GV--w1tvt/")
                .pdfFile("U3RhaW5sZXNzIHJvY2tz")
                .archiveUponSend(true)
                .processTags(true)
                .title("title")
                .user("user")
                .build()

        val body = params._body()

        assertThat(body.group()).isEqualTo("/api/v1/group/IK-GV--w1tvt/")
        assertThat(body.pdfFile()).isEqualTo("U3RhaW5sZXNzIHJvY2tz")
        assertThat(body.archiveUponSend()).contains(true)
        assertThat(body.processTags()).contains(true)
        assertThat(body.title()).contains("title")
        assertThat(body.user()).contains("user")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TemplatepdfCreateParams.builder()
                .group("/api/v1/group/IK-GV--w1tvt/")
                .pdfFile("U3RhaW5sZXNzIHJvY2tz")
                .build()

        val body = params._body()

        assertThat(body.group()).isEqualTo("/api/v1/group/IK-GV--w1tvt/")
        assertThat(body.pdfFile()).isEqualTo("U3RhaW5sZXNzIHJvY2tz")
    }
}
