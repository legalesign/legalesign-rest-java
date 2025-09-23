// File generated from our OpenAPI spec by Stainless.

package com.legalesign_sdk.api.models.group

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.legalesign_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroupRetrieveResponseTest {

    @Test
    fun create() {
        val groupRetrieveResponse =
            GroupRetrieveResponse.builder()
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .defaultEmail("None")
                .defaultExtraemail("None")
                .footer("None")
                .footerHeight(0L)
                .header("None")
                .isActive(true)
                .addMember(
                    "/api/v1/user/u0u0u0u0-u0u0-u0u0-u0u0-u0u0u0u0u0u0/,  /api/v1/user/u1u1u1u1-u1u1-u1u1-u1u1-u1u1u1u1u1u1/"
                )
                .modified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("my group")
                .pagesize(1)
                .publicName("global exports")
                .resourceUri("/api/v1/group/my-group/")
                .slug("my-group")
                .user("/api/v1/user/u0u0u0u0-u0u0-u0u0-u0u0-u0u0u0u0u0u0/")
                .xframeAllow(false)
                .xframeAllowPdfEdit(false)
                .build()

        assertThat(groupRetrieveResponse.created())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(groupRetrieveResponse.defaultEmail()).contains("None")
        assertThat(groupRetrieveResponse.defaultExtraemail()).contains("None")
        assertThat(groupRetrieveResponse.footer()).contains("None")
        assertThat(groupRetrieveResponse.footerHeight()).contains(0L)
        assertThat(groupRetrieveResponse.header()).contains("None")
        assertThat(groupRetrieveResponse.isActive()).contains(true)
        assertThat(groupRetrieveResponse.members().getOrNull())
            .containsExactly(
                "/api/v1/user/u0u0u0u0-u0u0-u0u0-u0u0-u0u0u0u0u0u0/,  /api/v1/user/u1u1u1u1-u1u1-u1u1-u1u1-u1u1u1u1u1u1/"
            )
        assertThat(groupRetrieveResponse.modified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(groupRetrieveResponse.name()).contains("my group")
        assertThat(groupRetrieveResponse.pagesize()).contains(1)
        assertThat(groupRetrieveResponse.publicName()).contains("global exports")
        assertThat(groupRetrieveResponse.resourceUri()).contains("/api/v1/group/my-group/")
        assertThat(groupRetrieveResponse.slug()).contains("my-group")
        assertThat(groupRetrieveResponse.user())
            .contains("/api/v1/user/u0u0u0u0-u0u0-u0u0-u0u0-u0u0u0u0u0u0/")
        assertThat(groupRetrieveResponse.xframeAllow()).contains(false)
        assertThat(groupRetrieveResponse.xframeAllowPdfEdit()).contains(false)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val groupRetrieveResponse =
            GroupRetrieveResponse.builder()
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .defaultEmail("None")
                .defaultExtraemail("None")
                .footer("None")
                .footerHeight(0L)
                .header("None")
                .isActive(true)
                .addMember(
                    "/api/v1/user/u0u0u0u0-u0u0-u0u0-u0u0-u0u0u0u0u0u0/,  /api/v1/user/u1u1u1u1-u1u1-u1u1-u1u1-u1u1u1u1u1u1/"
                )
                .modified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("my group")
                .pagesize(1)
                .publicName("global exports")
                .resourceUri("/api/v1/group/my-group/")
                .slug("my-group")
                .user("/api/v1/user/u0u0u0u0-u0u0-u0u0-u0u0-u0u0u0u0u0u0/")
                .xframeAllow(false)
                .xframeAllowPdfEdit(false)
                .build()

        val roundtrippedGroupRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(groupRetrieveResponse),
                jacksonTypeRef<GroupRetrieveResponse>(),
            )

        assertThat(roundtrippedGroupRetrieveResponse).isEqualTo(groupRetrieveResponse)
    }
}
