// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.status

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.legalesign.api.core.jsonMapper
import com.legalesign.api.models.attachment.ListMeta
import com.legalesign.api.models.signer.SignerStatusEnum
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StatusRetrieveAllResponseTest {

    @Test
    fun create() {
        val statusRetrieveAllResponse =
            StatusRetrieveAllResponse.builder()
                .meta(
                    ListMeta.builder()
                        .limit(0)
                        .next("next")
                        .offset(0)
                        .previous("previous")
                        .totalCount(0)
                        .build()
                )
                .addObject(
                    StatusResponse.builder()
                        .archived(false)
                        .downloadFinal(false)
                        .resourceUri("/api/v1/status/f0f0f0f0-f0f0-f0f0-f0f0-f0f0f0f0f0f0/")
                        .status(SignerStatusEnum._10)
                        .tag("contract2020")
                        .tag1("userRef")
                        .tag2("otherRef")
                        .build()
                )
                .build()

        assertThat(statusRetrieveAllResponse.meta())
            .contains(
                ListMeta.builder()
                    .limit(0)
                    .next("next")
                    .offset(0)
                    .previous("previous")
                    .totalCount(0)
                    .build()
            )
        assertThat(statusRetrieveAllResponse.objects().getOrNull())
            .containsExactly(
                StatusResponse.builder()
                    .archived(false)
                    .downloadFinal(false)
                    .resourceUri("/api/v1/status/f0f0f0f0-f0f0-f0f0-f0f0-f0f0f0f0f0f0/")
                    .status(SignerStatusEnum._10)
                    .tag("contract2020")
                    .tag1("userRef")
                    .tag2("otherRef")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val statusRetrieveAllResponse =
            StatusRetrieveAllResponse.builder()
                .meta(
                    ListMeta.builder()
                        .limit(0)
                        .next("next")
                        .offset(0)
                        .previous("previous")
                        .totalCount(0)
                        .build()
                )
                .addObject(
                    StatusResponse.builder()
                        .archived(false)
                        .downloadFinal(false)
                        .resourceUri("/api/v1/status/f0f0f0f0-f0f0-f0f0-f0f0-f0f0f0f0f0f0/")
                        .status(SignerStatusEnum._10)
                        .tag("contract2020")
                        .tag1("userRef")
                        .tag2("otherRef")
                        .build()
                )
                .build()

        val roundtrippedStatusRetrieveAllResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(statusRetrieveAllResponse),
                jacksonTypeRef<StatusRetrieveAllResponse>(),
            )

        assertThat(roundtrippedStatusRetrieveAllResponse).isEqualTo(statusRetrieveAllResponse)
    }
}
