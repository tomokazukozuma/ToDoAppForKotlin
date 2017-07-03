package com.todoapp.facade

import com.todoapp.entity.User
import com.todoapp.repository.ToDoRepository
import com.todoapp.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ToDoFacade @Autowired constructor(private val userRepository: UserRepository) {
	fun findAllUser(): MutableList<User> = userRepository.findAll()
}