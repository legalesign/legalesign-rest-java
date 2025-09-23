// File generated from our OpenAPI spec by Stainless.

package com.legalesign_sdk.api.errors

import com.legalesign_sdk.api.core.JsonValue
import com.legalesign_sdk.api.core.http.Headers

abstract class LegalesignSdkServiceException
protected constructor(message: String, cause: Throwable? = null) :
    LegalesignSdkException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
