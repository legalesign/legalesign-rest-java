// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.status

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.legalesign.api.core.jsonMapper
import com.legalesign.api.models.signer.SignerStatusEnum
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StatusResponseTest {

    @Test
    fun create() {
        val statusResponse =
            StatusResponse.builder()
                .archived(false)
                .downloadFinal(false)
                .resourceUri("/api/v1/status/f0f0f0f0-f0f0-f0f0-f0f0-f0f0f0f0f0f0/")
                .status(SignerStatusEnum._10)
                .tag("contract2020")
                .tag1("userRef")
                .tag2("otherRef")
                .build()

        assertThat(statusResponse.archived()).contains(false)
        assertThat(statusResponse.downloadFinal()).contains(false)
        assertThat(statusResponse.resourceUri())
            .contains("/api/v1/status/f0f0f0f0-f0f0-f0f0-f0f0-f0f0f0f0f0f0/")
        assertThat(statusResponse.status()).contains(SignerStatusEnum._10)
        assertThat(statusResponse.tag()).contains("contract2020")
        assertThat(statusResponse.tag1()).contains("userRef")
        assertThat(statusResponse.tag2()).contains("otherRef")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val statusResponse =
            StatusResponse.builder()
                .archived(false)
                .downloadFinal(false)
                .resourceUri("/api/v1/status/f0f0f0f0-f0f0-f0f0-f0f0-f0f0f0f0f0f0/")
                .status(SignerStatusEnum._10)
                .tag("contract2020")
                .tag1("userRef")
                .tag2("otherRef")
                .build()

        val roundtrippedStatusResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(statusResponse),
                jacksonTypeRef<StatusResponse>(),
            )

        assertThat(roundtrippedStatusResponse).isEqualTo(statusResponse)
    }
}
