// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.invited

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.legalesign.api.core.jsonMapper
import com.legalesign.api.models.attachment.ListMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvitedListResponseTest {

    @Test
    fun create() {
        val invitedListResponse =
            InvitedListResponse.builder()
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
                    InvitedListResponse.Object.builder()
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .email("job.biggins@widgets.comma")
                        .group("/api/v1/group/my-group/")
                        .resourceUri("/api/v1/invites/i0i0i0i0-i0i0-i0i0-i0i0-i0i0i0i0i0i0/")
                        .build()
                )
                .build()

        assertThat(invitedListResponse.meta())
            .contains(
                ListMeta.builder()
                    .limit(0)
                    .next("next")
                    .offset(0)
                    .previous("previous")
                    .totalCount(0)
                    .build()
            )
        assertThat(invitedListResponse.objects().getOrNull())
            .containsExactly(
                InvitedListResponse.Object.builder()
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .email("job.biggins@widgets.comma")
                    .group("/api/v1/group/my-group/")
                    .resourceUri("/api/v1/invites/i0i0i0i0-i0i0-i0i0-i0i0-i0i0i0i0i0i0/")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val invitedListResponse =
            InvitedListResponse.builder()
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
                    InvitedListResponse.Object.builder()
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .email("job.biggins@widgets.comma")
                        .group("/api/v1/group/my-group/")
                        .resourceUri("/api/v1/invites/i0i0i0i0-i0i0-i0i0-i0i0-i0i0i0i0i0i0/")
                        .build()
                )
                .build()

        val roundtrippedInvitedListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(invitedListResponse),
                jacksonTypeRef<InvitedListResponse>(),
            )

        assertThat(roundtrippedInvitedListResponse).isEqualTo(invitedListResponse)
    }
}
