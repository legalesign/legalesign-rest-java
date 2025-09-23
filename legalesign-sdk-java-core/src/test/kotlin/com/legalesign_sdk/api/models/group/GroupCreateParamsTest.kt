// File generated from our OpenAPI spec by Stainless.

package com.legalesign_sdk.api.models.group

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroupCreateParamsTest {

    @Test
    fun create() {
        GroupCreateParams.builder().name("xxxx").xframeAllow(true).build()
    }

    @Test
    fun body() {
        val params = GroupCreateParams.builder().name("xxxx").xframeAllow(true).build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("xxxx")
        assertThat(body.xframeAllow()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = GroupCreateParams.builder().name("xxxx").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("xxxx")
    }
}
