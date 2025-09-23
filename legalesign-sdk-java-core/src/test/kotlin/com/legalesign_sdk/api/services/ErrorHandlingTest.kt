// File generated from our OpenAPI spec by Stainless.

package com.legalesign_sdk.api.services

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.legalesign_sdk.api.client.LegalesignSdkClient
import com.legalesign_sdk.api.client.okhttp.LegalesignSdkOkHttpClient
import com.legalesign_sdk.api.core.JsonValue
import com.legalesign_sdk.api.core.http.Headers
import com.legalesign_sdk.api.core.jsonMapper
import com.legalesign_sdk.api.errors.BadRequestException
import com.legalesign_sdk.api.errors.InternalServerException
import com.legalesign_sdk.api.errors.LegalesignSdkException
import com.legalesign_sdk.api.errors.NotFoundException
import com.legalesign_sdk.api.errors.PermissionDeniedException
import com.legalesign_sdk.api.errors.RateLimitException
import com.legalesign_sdk.api.errors.UnauthorizedException
import com.legalesign_sdk.api.errors.UnexpectedStatusCodeException
import com.legalesign_sdk.api.errors.UnprocessableEntityException
import com.legalesign_sdk.api.models.document.DocumentListParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.entry
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ErrorHandlingTest {

    companion object {

        private val ERROR_JSON: JsonValue = JsonValue.from(mapOf("errorProperty" to "42"))

        private val ERROR_JSON_BYTES: ByteArray = jsonMapper().writeValueAsBytes(ERROR_JSON)

        private const val HEADER_NAME: String = "Error-Header"

        private const val HEADER_VALUE: String = "42"

        private const val NOT_JSON: String = "Not JSON"
    }

    private lateinit var client: LegalesignSdkClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            LegalesignSdkOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
    }

    @Test
    fun documentList400() {
        val documentService = client.document()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                documentService.list(
                    DocumentListParams.builder()
                        .group("group")
                        .archived("archived")
                        .createdGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .email("email")
                        .limit(0L)
                        .modifiedGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .nosigners("nosigners")
                        .offset(0L)
                        .status(0L)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun documentList400WithRawResponse() {
        val documentService = client.document().withRawResponse()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                documentService.list(
                    DocumentListParams.builder()
                        .group("group")
                        .archived("archived")
                        .createdGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .email("email")
                        .limit(0L)
                        .modifiedGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .nosigners("nosigners")
                        .offset(0L)
                        .status(0L)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun documentList401() {
        val documentService = client.document()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                documentService.list(
                    DocumentListParams.builder()
                        .group("group")
                        .archived("archived")
                        .createdGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .email("email")
                        .limit(0L)
                        .modifiedGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .nosigners("nosigners")
                        .offset(0L)
                        .status(0L)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun documentList401WithRawResponse() {
        val documentService = client.document().withRawResponse()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                documentService.list(
                    DocumentListParams.builder()
                        .group("group")
                        .archived("archived")
                        .createdGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .email("email")
                        .limit(0L)
                        .modifiedGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .nosigners("nosigners")
                        .offset(0L)
                        .status(0L)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun documentList403() {
        val documentService = client.document()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                documentService.list(
                    DocumentListParams.builder()
                        .group("group")
                        .archived("archived")
                        .createdGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .email("email")
                        .limit(0L)
                        .modifiedGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .nosigners("nosigners")
                        .offset(0L)
                        .status(0L)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun documentList403WithRawResponse() {
        val documentService = client.document().withRawResponse()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                documentService.list(
                    DocumentListParams.builder()
                        .group("group")
                        .archived("archived")
                        .createdGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .email("email")
                        .limit(0L)
                        .modifiedGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .nosigners("nosigners")
                        .offset(0L)
                        .status(0L)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun documentList404() {
        val documentService = client.document()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                documentService.list(
                    DocumentListParams.builder()
                        .group("group")
                        .archived("archived")
                        .createdGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .email("email")
                        .limit(0L)
                        .modifiedGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .nosigners("nosigners")
                        .offset(0L)
                        .status(0L)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun documentList404WithRawResponse() {
        val documentService = client.document().withRawResponse()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                documentService.list(
                    DocumentListParams.builder()
                        .group("group")
                        .archived("archived")
                        .createdGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .email("email")
                        .limit(0L)
                        .modifiedGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .nosigners("nosigners")
                        .offset(0L)
                        .status(0L)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun documentList422() {
        val documentService = client.document()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                documentService.list(
                    DocumentListParams.builder()
                        .group("group")
                        .archived("archived")
                        .createdGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .email("email")
                        .limit(0L)
                        .modifiedGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .nosigners("nosigners")
                        .offset(0L)
                        .status(0L)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun documentList422WithRawResponse() {
        val documentService = client.document().withRawResponse()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                documentService.list(
                    DocumentListParams.builder()
                        .group("group")
                        .archived("archived")
                        .createdGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .email("email")
                        .limit(0L)
                        .modifiedGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .nosigners("nosigners")
                        .offset(0L)
                        .status(0L)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun documentList429() {
        val documentService = client.document()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                documentService.list(
                    DocumentListParams.builder()
                        .group("group")
                        .archived("archived")
                        .createdGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .email("email")
                        .limit(0L)
                        .modifiedGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .nosigners("nosigners")
                        .offset(0L)
                        .status(0L)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun documentList429WithRawResponse() {
        val documentService = client.document().withRawResponse()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                documentService.list(
                    DocumentListParams.builder()
                        .group("group")
                        .archived("archived")
                        .createdGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .email("email")
                        .limit(0L)
                        .modifiedGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .nosigners("nosigners")
                        .offset(0L)
                        .status(0L)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun documentList500() {
        val documentService = client.document()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                documentService.list(
                    DocumentListParams.builder()
                        .group("group")
                        .archived("archived")
                        .createdGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .email("email")
                        .limit(0L)
                        .modifiedGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .nosigners("nosigners")
                        .offset(0L)
                        .status(0L)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun documentList500WithRawResponse() {
        val documentService = client.document().withRawResponse()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                documentService.list(
                    DocumentListParams.builder()
                        .group("group")
                        .archived("archived")
                        .createdGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .email("email")
                        .limit(0L)
                        .modifiedGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .nosigners("nosigners")
                        .offset(0L)
                        .status(0L)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun documentList999() {
        val documentService = client.document()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                documentService.list(
                    DocumentListParams.builder()
                        .group("group")
                        .archived("archived")
                        .createdGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .email("email")
                        .limit(0L)
                        .modifiedGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .nosigners("nosigners")
                        .offset(0L)
                        .status(0L)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun documentList999WithRawResponse() {
        val documentService = client.document().withRawResponse()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                documentService.list(
                    DocumentListParams.builder()
                        .group("group")
                        .archived("archived")
                        .createdGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .email("email")
                        .limit(0L)
                        .modifiedGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .nosigners("nosigners")
                        .offset(0L)
                        .status(0L)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun documentListInvalidJsonBody() {
        val documentService = client.document()
        stubFor(
            get(anyUrl())
                .willReturn(status(200).withHeader(HEADER_NAME, HEADER_VALUE).withBody(NOT_JSON))
        )

        val e =
            assertThrows<LegalesignSdkException> {
                documentService.list(
                    DocumentListParams.builder()
                        .group("group")
                        .archived("archived")
                        .createdGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .email("email")
                        .limit(0L)
                        .modifiedGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .nosigners("nosigners")
                        .offset(0L)
                        .status(0L)
                        .build()
                )
            }

        assertThat(e).hasMessage("Error reading response")
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
