// File generated from our OpenAPI spec by Stainless.

package com.legalesign_sdk.api.models.status

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.legalesign_sdk.api.core.jsonMapper
import com.legalesign_sdk.api.models.signer.SignerStatusEnum
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StatusRetrieveResponseTest {

    @Test
    fun create() {
        val statusRetrieveResponse =
            StatusRetrieveResponse.builder()
                .archived(false)
                .downloadFinal(false)
                .resourceUri("/api/v1/status/f0f0f0f0-f0f0-f0f0-f0f0-f0f0f0f0f0f0/")
                .status(SignerStatusEnum._10)
                .tag("contract2020")
                .tag1("userRef")
                .tag2("otherRef")
                .build()

        assertThat(statusRetrieveResponse.archived()).contains(false)
        assertThat(statusRetrieveResponse.downloadFinal()).contains(false)
        assertThat(statusRetrieveResponse.resourceUri())
            .contains("/api/v1/status/f0f0f0f0-f0f0-f0f0-f0f0-f0f0f0f0f0f0/")
        assertThat(statusRetrieveResponse.status()).contains(SignerStatusEnum._10)
        assertThat(statusRetrieveResponse.tag()).contains("contract2020")
        assertThat(statusRetrieveResponse.tag1()).contains("userRef")
        assertThat(statusRetrieveResponse.tag2()).contains("otherRef")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val statusRetrieveResponse =
            StatusRetrieveResponse.builder()
                .archived(false)
                .downloadFinal(false)
                .resourceUri("/api/v1/status/f0f0f0f0-f0f0-f0f0-f0f0-f0f0f0f0f0f0/")
                .status(SignerStatusEnum._10)
                .tag("contract2020")
                .tag1("userRef")
                .tag2("otherRef")
                .build()

        val roundtrippedStatusRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(statusRetrieveResponse),
                jacksonTypeRef<StatusRetrieveResponse>(),
            )

        assertThat(roundtrippedStatusRetrieveResponse).isEqualTo(statusRetrieveResponse)
    }
}
