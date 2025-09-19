// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.member

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MemberCreateParamsTest {

    @Test
    fun create() {
        MemberCreateParams.builder()
            .email("dev@stainless.com")
            .group("/api/v1/group/IK-GV--w1tvt/")
            .doEmail(true)
            .permission(PermissionsEnum._1)
            .build()
    }

    @Test
    fun body() {
        val params =
            MemberCreateParams.builder()
                .email("dev@stainless.com")
                .group("/api/v1/group/IK-GV--w1tvt/")
                .doEmail(true)
                .permission(PermissionsEnum._1)
                .build()

        val body = params._body()

        assertThat(body.email()).isEqualTo("dev@stainless.com")
        assertThat(body.group()).isEqualTo("/api/v1/group/IK-GV--w1tvt/")
        assertThat(body.doEmail()).contains(true)
        assertThat(body.permission()).contains(PermissionsEnum._1)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MemberCreateParams.builder()
                .email("dev@stainless.com")
                .group("/api/v1/group/IK-GV--w1tvt/")
                .build()

        val body = params._body()

        assertThat(body.email()).isEqualTo("dev@stainless.com")
        assertThat(body.group()).isEqualTo("/api/v1/group/IK-GV--w1tvt/")
    }
}
