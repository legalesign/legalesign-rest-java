// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.signer

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.legalesign.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SignerGetRejectionReasonResponseTest {

    @Test
    fun create() {
        val signerGetRejectionReasonResponse =
            SignerGetRejectionReasonResponse.builder().reason("reason").status(0L).build()

        assertThat(signerGetRejectionReasonResponse.reason()).contains("reason")
        assertThat(signerGetRejectionReasonResponse.status()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val signerGetRejectionReasonResponse =
            SignerGetRejectionReasonResponse.builder().reason("reason").status(0L).build()

        val roundtrippedSignerGetRejectionReasonResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(signerGetRejectionReasonResponse),
                jacksonTypeRef<SignerGetRejectionReasonResponse>(),
            )

        assertThat(roundtrippedSignerGetRejectionReasonResponse)
            .isEqualTo(signerGetRejectionReasonResponse)
    }
}
