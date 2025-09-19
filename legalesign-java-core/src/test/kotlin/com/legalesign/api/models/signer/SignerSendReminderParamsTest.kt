// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.signer

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SignerSendReminderParamsTest {

    @Test
    fun create() {
        SignerSendReminderParams.builder().signerId("signerId").text("text").build()
    }

    @Test
    fun pathParams() {
        val params = SignerSendReminderParams.builder().signerId("signerId").build()

        assertThat(params._pathParam(0)).isEqualTo("signerId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params = SignerSendReminderParams.builder().signerId("signerId").text("text").build()

        val body = params._body()

        assertThat(body.text()).contains("text")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SignerSendReminderParams.builder().signerId("signerId").build()

        val body = params._body()
    }
}
