package com.todoapp.repository

import com.todoapp.entity.ToDo
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ToDoRepository : JpaRepository<ToDo, Long> {
}