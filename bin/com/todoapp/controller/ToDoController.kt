package com.todoapp.controller

import com.todoapp.entity.User
import com.todoapp.facade.ToDoFacade
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ToDoController @Autowired constructor(private val todoFacade: ToDoFacade) {
	@RequestMapping("/todo")
	fun index(): MutableList<User> {
		return todoFacade.findAllUser()
	}
}