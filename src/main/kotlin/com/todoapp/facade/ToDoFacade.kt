package com.todoapp.facade

import com.todoapp.entity.ToDo
import com.todoapp.repository.ToDoRepository
import com.todoapp.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.Date

@Service
class ToDoFacade @Autowired constructor(private val userRepository: UserRepository,
										private val todoRepository: ToDoRepository) {

	fun findAllToDo(userId: Int): MutableList<ToDo> = todoRepository.findByUserId(userId)

	fun addToDo(t: ToDo): ToDo {
		return todoRepository.save(t)
	}

	fun updateToDo(id: Int): ToDo {
		var t: ToDo = ToDo()
		t.id = id
		t.text = "Done Homework"
		t.completeFlag = true
		t.completeDatetime = Date()
		return todoRepository.save(t)
	}

	fun deleteToDo(id: Int) {
		var t: ToDo = ToDo()
		t.id = id
		t.text = "Done Homework"
		t.completeFlag = true
		t.completeDatetime = Date()
		todoRepository.delete(t)
	}
}