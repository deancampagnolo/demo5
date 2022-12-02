package com.example.demo5

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class Demo5Application

fun main(args: Array<String>) {
    runApplication<Demo5Application>(*args)
}

@RestController
class MessageResource {
    @GetMapping
    fun index(): List<Message> = listOf(
            Message("1", "hello!"),
            Message("2", "hola!")
    )
}

data class Message(val id: String?, val text: String)