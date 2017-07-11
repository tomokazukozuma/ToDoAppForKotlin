package com.todoapp.requestformat.todo

import com.todoapp.requestformat.BaseRequestFormat

data class GetToDoRequestFormat (
    var userId: Int = 0
) : BaseRequestFormat()