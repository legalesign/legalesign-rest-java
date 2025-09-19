// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.user

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserCreateParamsTest {

    @Test
    fun create() {
        UserCreateParams.builder()
            .email("dev@stainless.com")
            .firstName("first_name")
            .lastName("last_name")
            .groups("/api/v1/group/IK-GV--w1tvt/")
            .password("password")
            .permission(UserCreateParams.Permission._1)
            .timezone(TimezoneEnum.AFRICA_ABIDJAN)
            .build()
    }

    @Test
    fun body() {
        val params =
            UserCreateParams.builder()
                .email("dev@stainless.com")
                .firstName("first_name")
                .lastName("last_name")
                .groups("/api/v1/group/IK-GV--w1tvt/")
                .password("password")
                .permission(UserCreateParams.Permission._1)
                .timezone(TimezoneEnum.AFRICA_ABIDJAN)
                .build()

        val body = params._body()

        assertThat(body.email()).isEqualTo("dev@stainless.com")
        assertThat(body.firstName()).isEqualTo("first_name")
        assertThat(body.lastName()).isEqualTo("last_name")
        assertThat(body.groups()).contains("/api/v1/group/IK-GV--w1tvt/")
        assertThat(body.password()).contains("password")
        assertThat(body.permission()).contains(UserCreateParams.Permission._1)
        assertThat(body.timezone()).contains(TimezoneEnum.AFRICA_ABIDJAN)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            UserCreateParams.builder()
                .email("dev@stainless.com")
                .firstName("first_name")
                .lastName("last_name")
                .build()

        val body = params._body()

        assertThat(body.email()).isEqualTo("dev@stainless.com")
        assertThat(body.firstName()).isEqualTo("first_name")
        assertThat(body.lastName()).isEqualTo("last_name")
    }
}
