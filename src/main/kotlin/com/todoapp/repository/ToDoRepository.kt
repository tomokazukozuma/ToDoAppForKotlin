package com.todoapp.repository

import com.todoapp.entity.ToDo
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Repository
interface ToDoRepository : JpaRepository<ToDo, Long> {

	fun findByUserId(userId: Int): MutableList<ToDo>

	@Transactional
	@Modifying
	@Query("UPDATE ToDo AS t SET t.completeFlag = true, completeDatetime = NOW() WHERE t.id = :id")
	fun updateCompleteFlagById(@Param("id") id: Int) : Int
}