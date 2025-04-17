package com.example.back250417

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching

@SpringBootApplication
@EnableCaching
class Back250417Application

fun main(args: Array<String>) {
    runApplication<Back250417Application>(*args)
}
