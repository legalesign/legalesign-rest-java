// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.group

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroupUpdateParamsTest {

    @Test
    fun create() {
        GroupUpdateParams.builder().groupId("groupId").publicName("public_name").build()
    }

    @Test
    fun pathParams() {
        val params = GroupUpdateParams.builder().groupId("groupId").build()

        assertThat(params._pathParam(0)).isEqualTo("groupId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            GroupUpdateParams.builder().groupId("groupId").publicName("public_name").build()

        val body = params._body()

        assertThat(body.publicName()).contains("public_name")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = GroupUpdateParams.builder().groupId("groupId").build()

        val body = params._body()
    }
}
