// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.signer

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.legalesign.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SignerRetrieveResponseTest {

    @Test
    fun create() {
        val signerRetrieveResponse =
            SignerRetrieveResponse.builder()
                .document("/api/v1/document/d0d0d0d0-d0fd0-d0d0-d0d0-d0d0d0d0d0d0/")
                .email("joe.biggins@widgets.com")
                .firstName("Joe")
                .hasFields(true)
                .lastName("Biggins")
                .order(0)
                .resourceUri("/api/v1/signers/s0s0s0s0-s0s0-s0s0-s0s0-s0s0s0s0s0s0/")
                .status(SignerStatusEnum._20)
                .build()

        assertThat(signerRetrieveResponse.document())
            .contains("/api/v1/document/d0d0d0d0-d0fd0-d0d0-d0d0-d0d0d0d0d0d0/")
        assertThat(signerRetrieveResponse.email()).contains("joe.biggins@widgets.com")
        assertThat(signerRetrieveResponse.firstName()).contains("Joe")
        assertThat(signerRetrieveResponse.hasFields()).contains(true)
        assertThat(signerRetrieveResponse.lastName()).contains("Biggins")
        assertThat(signerRetrieveResponse.order()).contains(0)
        assertThat(signerRetrieveResponse.resourceUri())
            .contains("/api/v1/signers/s0s0s0s0-s0s0-s0s0-s0s0-s0s0s0s0s0s0/")
        assertThat(signerRetrieveResponse.status()).contains(SignerStatusEnum._20)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val signerRetrieveResponse =
            SignerRetrieveResponse.builder()
                .document("/api/v1/document/d0d0d0d0-d0fd0-d0d0-d0d0-d0d0d0d0d0d0/")
                .email("joe.biggins@widgets.com")
                .firstName("Joe")
                .hasFields(true)
                .lastName("Biggins")
                .order(0)
                .resourceUri("/api/v1/signers/s0s0s0s0-s0s0-s0s0-s0s0-s0s0s0s0s0s0/")
                .status(SignerStatusEnum._20)
                .build()

        val roundtrippedSignerRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(signerRetrieveResponse),
                jacksonTypeRef<SignerRetrieveResponse>(),
            )

        assertThat(roundtrippedSignerRetrieveResponse).isEqualTo(signerRetrieveResponse)
    }
}
