package com.store.exceptions

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(HttpStatus.BAD_REQUEST)
class UnrecognizedTypeException(type: String) : RuntimeException("Unrecognized type: " + type)
