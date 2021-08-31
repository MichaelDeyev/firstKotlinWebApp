package com.example.firstkotlinwebapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FirstKotlinWebAppApplication

fun main(args: Array<String>) {
    runApplication<FirstKotlinWebAppApplication>(*args)
}
