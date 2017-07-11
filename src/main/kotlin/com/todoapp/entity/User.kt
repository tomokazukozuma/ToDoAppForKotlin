package com.todoapp.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import java.sql.Timestamp
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

    @Entity
    @Table(name = "user")
    data class User(

    @Id
    @GeneratedValue var id: Int? = 0,

    @Column(nullable = false)
    var name: String = "",

    @Column(nullable = false)
    var email: String = "",

    @JsonIgnore
    @Column(nullable = false)
    var password: String = "",

    @JsonIgnore
    @Column(name = "insert_datetime", nullable = false)
    var insertDatetime: Timestamp = Timestamp(0),

    @JsonIgnore
    @Column(name = "update_datetime", nullable = false)
    var updateDatetime: Timestamp = Timestamp(0),

    @JsonIgnore
    @Column(name = "delete_flag", nullable = false)
    var deleteFlag: Boolean = false
)