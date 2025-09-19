// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.member

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.legalesign.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MemberResponseTest {

    @Test
    fun create() {
        val memberResponse =
            MemberResponse.builder()
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .group("https://example.com")
                .modified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .permission(PermissionsEnum._1)
                .resourceUri("/api/v1/member/m0m0m0m0-m0m0-m0m0-m0m0-m0m0m0m0m0m0/")
                .user("/api/v1/user/u0u0u0u0-u0u0-u0u0-u0u0-u0u0u0u0u0u0/")
                .build()

        assertThat(memberResponse.created())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(memberResponse.group()).contains("https://example.com")
        assertThat(memberResponse.modified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(memberResponse.permission()).contains(PermissionsEnum._1)
        assertThat(memberResponse.resourceUri())
            .contains("/api/v1/member/m0m0m0m0-m0m0-m0m0-m0m0-m0m0m0m0m0m0/")
        assertThat(memberResponse.user())
            .contains("/api/v1/user/u0u0u0u0-u0u0-u0u0-u0u0-u0u0u0u0u0u0/")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val memberResponse =
            MemberResponse.builder()
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .group("https://example.com")
                .modified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .permission(PermissionsEnum._1)
                .resourceUri("/api/v1/member/m0m0m0m0-m0m0-m0m0-m0m0-m0m0m0m0m0m0/")
                .user("/api/v1/user/u0u0u0u0-u0u0-u0u0-u0u0-u0u0u0u0u0u0/")
                .build()

        val roundtrippedMemberResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(memberResponse),
                jacksonTypeRef<MemberResponse>(),
            )

        assertThat(roundtrippedMemberResponse).isEqualTo(memberResponse)
    }
}
