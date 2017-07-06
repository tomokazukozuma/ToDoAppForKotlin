package com.todoapp.requestformat.todo

import com.todoapp.requestformat.BaseRequestFormat

data class UpdateToDoTextRequestFormat (
	var text: String = ""
) : BaseRequestFormat()