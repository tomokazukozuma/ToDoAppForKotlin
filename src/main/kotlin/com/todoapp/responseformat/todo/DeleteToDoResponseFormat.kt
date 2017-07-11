package com.todoapp.responseformat.todo

import com.todoapp.responseformat.BaseResponseFormat

data class DeleteToDoResponseFormat (
    var result: String
) : BaseResponseFormat()