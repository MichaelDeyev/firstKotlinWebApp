package com.example.firstkotlinwebapp.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class MainController {
    val movies = mutableListOf("1st movie", "2nd movie")

    @GetMapping
    fun greeting(): ResponseEntity<MutableList<String>> {
        return ResponseEntity.ok(movies)
    }
}
