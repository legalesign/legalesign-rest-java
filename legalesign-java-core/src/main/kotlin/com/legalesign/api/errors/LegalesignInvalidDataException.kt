package com.legalesign.api.errors

class LegalesignInvalidDataException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) :
    LegalesignException(message, cause)
