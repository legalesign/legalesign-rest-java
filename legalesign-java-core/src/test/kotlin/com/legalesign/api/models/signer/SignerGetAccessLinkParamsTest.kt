// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.signer

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SignerGetAccessLinkParamsTest {

    @Test
    fun create() {
        SignerGetAccessLinkParams.builder().signerId("signerId").build()
    }

    @Test
    fun pathParams() {
        val params = SignerGetAccessLinkParams.builder().signerId("signerId").build()

        assertThat(params._pathParam(0)).isEqualTo("signerId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
