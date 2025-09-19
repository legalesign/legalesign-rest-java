// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.attachment

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.legalesign.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListMetaTest {

    @Test
    fun create() {
        val listMeta =
            ListMeta.builder()
                .limit(0)
                .next("next")
                .offset(0)
                .previous("previous")
                .totalCount(0)
                .build()

        assertThat(listMeta.limit()).contains(0)
        assertThat(listMeta.next()).contains("next")
        assertThat(listMeta.offset()).contains(0)
        assertThat(listMeta.previous()).contains("previous")
        assertThat(listMeta.totalCount()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val listMeta =
            ListMeta.builder()
                .limit(0)
                .next("next")
                .offset(0)
                .previous("previous")
                .totalCount(0)
                .build()

        val roundtrippedListMeta =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(listMeta),
                jacksonTypeRef<ListMeta>(),
            )

        assertThat(roundtrippedListMeta).isEqualTo(listMeta)
    }
}
