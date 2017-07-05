package com.todoapp.facade

import com.todoapp.entity.ToDo
import com.todoapp.repository.ToDoRepository
import com.todoapp.repository.UserRepository
import com.todoapp.responseformat.todo.ToDoResponseFormat
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ToDoFacade @Autowired constructor(private val userRepository: UserRepository,
										private val todoRepository: ToDoRepository) {

	fun getToDo(userId: Int): ToDoResponseFormat {
		var todoList: MutableList<ToDo> = todoRepository.findByUserId(userId)
		return ToDoResponseFormat(todoList)
	}

	fun addToDo(userId: Int, text: String): ToDo {
		var t: ToDo = ToDo()
		t.userId = userId
		t.text = text
		return todoRepository.save(t)
	}

	fun updateToDoText(id: Int, text: String): Int {
		return todoRepository.updateTextById(id, text)
	}

	fun updateToDoCompleteFlag(id: Int): Int {
		return todoRepository.updateCompleteFlagById(id)
	}

	fun deleteToDo(id: Int) {
		var t: ToDo = ToDo()
		t.id = id
		todoRepository.delete(t)
	}
}