// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.user

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserUpdateParamsTest {

    @Test
    fun create() {
        UserUpdateParams.builder()
            .userId("userId")
            .firstName("first_name")
            .lastName("last_name")
            .build()
    }

    @Test
    fun pathParams() {
        val params = UserUpdateParams.builder().userId("userId").build()

        assertThat(params._pathParam(0)).isEqualTo("userId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            UserUpdateParams.builder()
                .userId("userId")
                .firstName("first_name")
                .lastName("last_name")
                .build()

        val body = params._body()

        assertThat(body.firstName()).contains("first_name")
        assertThat(body.lastName()).contains("last_name")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = UserUpdateParams.builder().userId("userId").build()

        val body = params._body()
    }
}
