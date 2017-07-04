package com.todoapp.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import java.util.Date
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "todo")
data class ToDo (

	@Id
	@GeneratedValue
	var id: Int? = 0,

	@Column(name = "user_id", nullable = false)
	var userId: Int = 0,

	@Column(nullable = false)
	var text: String = "",

	@Column(name = "complete_flag", nullable = false)
	var completeFlag: Boolean = false,

	@Column(name = "complete_datetime", nullable = true)
	var completeDatetime: Date? = Date(),

	@JsonIgnore
	@Column(name = "insert_datetime", nullable = false)
	var insertDatetime: Date = Date(),

	@JsonIgnore
	@Column(name = "update_datetime", nullable = false)
	var updateDatetime: Date = Date(),

	@JsonIgnore
	@Column(name = "delete_flag", nullable = false)
	var deleteFlag: Boolean = false
)