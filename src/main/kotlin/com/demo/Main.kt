package com.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
@RequestMapping("api/v1/customers")
open class Main(val customerRepository: CustomerRepository) {
    @GetMapping
    fun getCustomers(): List<Customer> {
        return customerRepository.findAll()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            runApplication<Main>(*args)
        }
    }
}
