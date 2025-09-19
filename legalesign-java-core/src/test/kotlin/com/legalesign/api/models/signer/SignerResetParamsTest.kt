// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.signer

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SignerResetParamsTest {

    @Test
    fun create() {
        SignerResetParams.builder().signerId("signerId").email("email").notify(true).build()
    }

    @Test
    fun pathParams() {
        val params = SignerResetParams.builder().signerId("signerId").email("email").build()

        assertThat(params._pathParam(0)).isEqualTo("signerId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SignerResetParams.builder().signerId("signerId").email("email").notify(true).build()

        val body = params._body()

        assertThat(body.email()).isEqualTo("email")
        assertThat(body.notify()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SignerResetParams.builder().signerId("signerId").email("email").build()

        val body = params._body()

        assertThat(body.email()).isEqualTo("email")
    }
}
