package com.todoapp.requestformat.todo

import com.todoapp.requestformat.BaseRequestFormat

data class AddToDoRequestFormat(

    /** ユーザID */
    var userId: Int = 0,

    /** TODOテキスト */
    var text: String = ""
) : BaseRequestFormat()