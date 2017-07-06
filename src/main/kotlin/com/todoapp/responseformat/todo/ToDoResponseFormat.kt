package com.todoapp.responseformat.todo


import com.todoapp.entity.ToDo
import com.todoapp.responseformat.BaseResponseFormat

data class ToDoResponseFormat (
	val toDoList: MutableList<ToDo>
) : BaseResponseFormat()