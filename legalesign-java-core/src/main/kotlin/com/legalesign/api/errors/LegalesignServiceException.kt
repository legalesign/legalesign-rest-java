// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.errors

import com.legalesign.api.core.JsonValue
import com.legalesign.api.core.http.Headers

abstract class LegalesignServiceException
protected constructor(message: String, cause: Throwable? = null) :
    LegalesignException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
