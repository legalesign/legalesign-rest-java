// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.group

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroupRetrieveParamsTest {

    @Test
    fun create() {
        GroupRetrieveParams.builder().groupId("groupId").build()
    }

    @Test
    fun pathParams() {
        val params = GroupRetrieveParams.builder().groupId("groupId").build()

        assertThat(params._pathParam(0)).isEqualTo("groupId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
