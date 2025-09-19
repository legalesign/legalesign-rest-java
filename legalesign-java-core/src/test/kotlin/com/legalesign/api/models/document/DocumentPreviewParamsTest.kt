// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.document

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentPreviewParamsTest {

    @Test
    fun create() {
        DocumentPreviewParams.builder()
            .group("/api/v1/group/IK-GV--w1tvt/")
            .signeeCount(0)
            .text("text")
            .title("title")
            .build()
    }

    @Test
    fun body() {
        val params =
            DocumentPreviewParams.builder()
                .group("/api/v1/group/IK-GV--w1tvt/")
                .signeeCount(0)
                .text("text")
                .title("title")
                .build()

        val body = params._body()

        assertThat(body.group()).contains("/api/v1/group/IK-GV--w1tvt/")
        assertThat(body.signeeCount()).contains(0)
        assertThat(body.text()).contains("text")
        assertThat(body.title()).contains("title")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = DocumentPreviewParams.builder().build()

        val body = params._body()
    }
}
