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
	fun findAllToDo(): MutableList<ToDo> = todoRepository.findAll()

	fun addToDo(): ToDo {
		var t: ToDo = ToDo()
		t.userId = 1
		t.text = "Do Homework"
		return todoRepository.save(t)
	}

	fun updateToDo(): ToDo {
		var t: ToDo = ToDo()
		t.id = 1
		t.text = "Done Homework"
		t.completeFlag = true
		t.completeDatetime = Date()
		return todoRepository.save(t)
	}

	fun deleteToDo() {
		var t: ToDo = ToDo()
		t.id = 1
		t.text = "Done Homework"
		t.completeFlag = true
		t.completeDatetime = Date()
		todoRepository.delete(t)
	}
}