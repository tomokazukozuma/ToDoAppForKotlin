package com.todoapp.responseformat.todo

import com.todoapp.responseformat.BaseResponseFormat

data class UpdateToDoCompleteFlagResponseFormat (
    var result: String
) : BaseResponseFormat()