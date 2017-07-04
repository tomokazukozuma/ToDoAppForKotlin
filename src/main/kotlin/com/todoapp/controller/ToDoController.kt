package com.todoapp.controller

import com.todoapp.entity.ToDo
import com.todoapp.facade.ToDoFacade
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/todo")
class ToDoController @Autowired constructor(private val todoFacade: ToDoFacade) {

	@GetMapping
	fun getToDoList(@RequestParam("userId") userId: Int): MutableList<ToDo> {
		return todoFacade.findAllToDo(userId)
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	fun addToDo(@RequestBody todo: ToDo): ToDo {
		return todoFacade.addToDo(todo)
	}

	@RequestMapping(value = "{id:^[0-9]+$}", method = arrayOf(RequestMethod.PATCH))
	fun updateToDoText(@PathVariable id: Int, @RequestParam("text") text: String): String {
		todoFacade.updateToDoText(id, text)
		return "OK"
	}

	@RequestMapping(value = "{id:^[0-9]+$}/complete", method = arrayOf(RequestMethod.PATCH))
	fun updateToDoCompleteFlag(@PathVariable id: Int): String {
		todoFacade.updateToDoCompleteFlag(id)
		return "OK"
	}

	@RequestMapping(value = "{id:^[0-9]+$}", method = arrayOf(RequestMethod.DELETE))
	fun deleteToDo(@PathVariable id: Int): String {
		todoFacade.deleteToDo(id)
		return "OK"
	}
}