package com.todoapp.requestformat.todo

data class AddToDoRequestFormat(

	/** ユーザID */
	var userId: Int = 0,

	/** TODOテキスト */
	var text: String = ""
)