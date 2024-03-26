package com.eric.graphql

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GraphQlApplication

fun main(args: Array<String>) {
    runApplication<GraphQlApplication>(*args)
}
