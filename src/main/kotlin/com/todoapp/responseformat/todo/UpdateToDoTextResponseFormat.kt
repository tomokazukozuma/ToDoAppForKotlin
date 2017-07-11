package com.todoapp.responseformat.todo

import com.todoapp.entity.ToDo
import com.todoapp.responseformat.BaseResponseFormat

data class UpdateToDoTextResponseFormat (
    var todo: ToDo
) : BaseResponseFormat()