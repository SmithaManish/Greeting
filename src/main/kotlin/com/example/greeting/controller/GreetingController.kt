package com.example.greeting.controller

import com.example.greeting.model.Greeting
import org.springframework.http.RequestEntity.post
import org.springframework.web.bind.annotation.*
import java.util.concurrent.atomic.AtomicLong

@RestController
class GreetingController {
    val counter = AtomicLong()

    @RequestMapping("/{greet}/{name1}")
    fun greet(@RequestParam(value="name")name:String, @RequestParam(value="age")age:String, @PathVariable greet: String,
              @PathVariable name1: String
    ): String {
        return "Hello $name, your age is $age"

    }



}