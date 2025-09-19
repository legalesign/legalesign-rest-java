// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.signer

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.legalesign.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SignerRetrieveFieldsResponseTest {

    @Test
    fun create() {
        val signerRetrieveFieldsResponse =
            SignerRetrieveFieldsResponse.builder()
                .fieldorder(0L)
                .label("label")
                .labelExtra("label_extra")
                .state(true)
                .value("value")
                .build()

        assertThat(signerRetrieveFieldsResponse.fieldorder()).contains(0L)
        assertThat(signerRetrieveFieldsResponse.label()).contains("label")
        assertThat(signerRetrieveFieldsResponse.labelExtra()).contains("label_extra")
        assertThat(signerRetrieveFieldsResponse.state()).contains(true)
        assertThat(signerRetrieveFieldsResponse.value()).contains("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val signerRetrieveFieldsResponse =
            SignerRetrieveFieldsResponse.builder()
                .fieldorder(0L)
                .label("label")
                .labelExtra("label_extra")
                .state(true)
                .value("value")
                .build()

        val roundtrippedSignerRetrieveFieldsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(signerRetrieveFieldsResponse),
                jacksonTypeRef<SignerRetrieveFieldsResponse>(),
            )

        assertThat(roundtrippedSignerRetrieveFieldsResponse).isEqualTo(signerRetrieveFieldsResponse)
    }
}
