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
data class ToDo(@Id @GeneratedValue var id: Int? = 0,
				@Column(nullable = false) var user_id: Int = 0,
				@Column(nullable = false) var text: String = "",
				@Column(nullable = false) var complete_flag: Boolean,
				@Column(nullable = false) var completer_datetime: Date,
				@JsonIgnore
				@Column(name = "insert_datetime", nullable = false) var insertDatetime: Date = Date(),
				@JsonIgnore
				@Column(name = "update_datetime", nullable = false) var updateDatetime: Date = Date(),
				@JsonIgnore
				@Column(name = "delete_flag", nullable = false) var deleteFlag: Boolean = false) {
}