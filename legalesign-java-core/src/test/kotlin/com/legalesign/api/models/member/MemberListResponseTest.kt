// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.member

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.legalesign.api.core.jsonMapper
import com.legalesign.api.models.attachment.ListMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MemberListResponseTest {

    @Test
    fun create() {
        val memberListResponse =
            MemberListResponse.builder()
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
                    MemberResponse.builder()
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .group("https://example.com")
                        .modified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .permission(PermissionsEnum._1)
                        .resourceUri("/api/v1/member/m0m0m0m0-m0m0-m0m0-m0m0-m0m0m0m0m0m0/")
                        .user("/api/v1/user/u0u0u0u0-u0u0-u0u0-u0u0-u0u0u0u0u0u0/")
                        .build()
                )
                .build()

        assertThat(memberListResponse.meta())
            .contains(
                ListMeta.builder()
                    .limit(0)
                    .next("next")
                    .offset(0)
                    .previous("previous")
                    .totalCount(0)
                    .build()
            )
        assertThat(memberListResponse.objects().getOrNull())
            .containsExactly(
                MemberResponse.builder()
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .group("https://example.com")
                    .modified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .permission(PermissionsEnum._1)
                    .resourceUri("/api/v1/member/m0m0m0m0-m0m0-m0m0-m0m0-m0m0m0m0m0m0/")
                    .user("/api/v1/user/u0u0u0u0-u0u0-u0u0-u0u0-u0u0u0u0u0u0/")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val memberListResponse =
            MemberListResponse.builder()
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
                    MemberResponse.builder()
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .group("https://example.com")
                        .modified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .permission(PermissionsEnum._1)
                        .resourceUri("/api/v1/member/m0m0m0m0-m0m0-m0m0-m0m0-m0m0m0m0m0m0/")
                        .user("/api/v1/user/u0u0u0u0-u0u0-u0u0-u0u0-u0u0u0u0u0u0/")
                        .build()
                )
                .build()

        val roundtrippedMemberListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(memberListResponse),
                jacksonTypeRef<MemberListResponse>(),
            )

        assertThat(roundtrippedMemberListResponse).isEqualTo(memberListResponse)
    }
}
