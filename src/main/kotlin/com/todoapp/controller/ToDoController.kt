package com.todoapp.controller

import com.todoapp.entity.ToDo
import com.todoapp.facade.ToDoFacade
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/todo")
class ToDoController @Autowired constructor(private val todoFacade: ToDoFacade) {

	@GetMapping
	fun getToDoList(): MutableList<ToDo> {
		return todoFacade.findAllToDo()
	}

	@PostMapping
	fun addToDo(): ToDo {
		return todoFacade.addToDo()
	}

	@RequestMapping(method = arrayOf(RequestMethod.PATCH))
	fun updateToDo(): ToDo {
		return todoFacade.updateToDo()
	}

	@RequestMapping(method = arrayOf(RequestMethod.DELETE))
	fun deleteToDo(): ToDo {
		return todoFacade.addToDo()
	}
}