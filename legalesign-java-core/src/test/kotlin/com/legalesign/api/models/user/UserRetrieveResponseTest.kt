// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.user

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.legalesign.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserRetrieveResponseTest {

    @Test
    fun create() {
        val userRetrieveResponse =
            UserRetrieveResponse.builder()
                .dateJoined(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .email("joe.biggins@widgets.com")
                .firstName("Joe")
                .addGroup("/api/v1/group/my-group1/, api/v1/group/my-group2/")
                .lastLogin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastName("Biggins")
                .resourceUri("/api/v1/user/34034334ab34334333rh33434334f9/")
                .timezone(TimezoneEnum.EUROPE_CHISINAU)
                .username("34034334ab34334333rh33434334f9")
                .build()

        assertThat(userRetrieveResponse.dateJoined())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(userRetrieveResponse.email()).contains("joe.biggins@widgets.com")
        assertThat(userRetrieveResponse.firstName()).contains("Joe")
        assertThat(userRetrieveResponse.groups().getOrNull())
            .containsExactly("/api/v1/group/my-group1/, api/v1/group/my-group2/")
        assertThat(userRetrieveResponse.lastLogin())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(userRetrieveResponse.lastName()).contains("Biggins")
        assertThat(userRetrieveResponse.resourceUri())
            .contains("/api/v1/user/34034334ab34334333rh33434334f9/")
        assertThat(userRetrieveResponse.timezone()).contains(TimezoneEnum.EUROPE_CHISINAU)
        assertThat(userRetrieveResponse.username()).contains("34034334ab34334333rh33434334f9")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userRetrieveResponse =
            UserRetrieveResponse.builder()
                .dateJoined(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .email("joe.biggins@widgets.com")
                .firstName("Joe")
                .addGroup("/api/v1/group/my-group1/, api/v1/group/my-group2/")
                .lastLogin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastName("Biggins")
                .resourceUri("/api/v1/user/34034334ab34334333rh33434334f9/")
                .timezone(TimezoneEnum.EUROPE_CHISINAU)
                .username("34034334ab34334333rh33434334f9")
                .build()

        val roundtrippedUserRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userRetrieveResponse),
                jacksonTypeRef<UserRetrieveResponse>(),
            )

        assertThat(roundtrippedUserRetrieveResponse).isEqualTo(userRetrieveResponse)
    }
}
