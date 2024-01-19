package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/hello")
class HelloWorldController {

    @GetMapping
    fun greet(name: String?): String {
        if (name.isNullOrBlank()) {
            return "Hello, World!"
        }
        return "Hello, $name!"
    }
}