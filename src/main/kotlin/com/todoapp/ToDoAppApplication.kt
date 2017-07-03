package com.todoapp

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class ToDoAppApplication

fun main(args: Array<String>) {
    SpringApplication.run(ToDoAppApplication::class.java, *args)
}
