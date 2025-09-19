package com.legalesign.api.errors

open class LegalesignException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
