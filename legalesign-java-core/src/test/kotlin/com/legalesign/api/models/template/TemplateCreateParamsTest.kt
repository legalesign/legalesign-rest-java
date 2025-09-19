// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.template

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplateCreateParamsTest {

    @Test
    fun create() {
        TemplateCreateParams.builder()
            .group("/api/v1/group/IK-GV--w1tvt/")
            .latestText("latest_text")
            .title("title")
            .user("/api/v1/user/IK-GV--w1tvt/")
            .build()
    }

    @Test
    fun body() {
        val params =
            TemplateCreateParams.builder()
                .group("/api/v1/group/IK-GV--w1tvt/")
                .latestText("latest_text")
                .title("title")
                .user("/api/v1/user/IK-GV--w1tvt/")
                .build()

        val body = params._body()

        assertThat(body.group()).isEqualTo("/api/v1/group/IK-GV--w1tvt/")
        assertThat(body.latestText()).isEqualTo("latest_text")
        assertThat(body.title()).isEqualTo("title")
        assertThat(body.user()).contains("/api/v1/user/IK-GV--w1tvt/")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TemplateCreateParams.builder()
                .group("/api/v1/group/IK-GV--w1tvt/")
                .latestText("latest_text")
                .title("title")
                .build()

        val body = params._body()

        assertThat(body.group()).isEqualTo("/api/v1/group/IK-GV--w1tvt/")
        assertThat(body.latestText()).isEqualTo("latest_text")
        assertThat(body.title()).isEqualTo("title")
    }
}
