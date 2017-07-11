package com.todoapp.responseformat

import java.io.Serializable
import java.util.Date

abstract class BaseResponseFormat(
    var responseDatetime: Date = Date()
) : Serializable