package com.example.plugins

import io.ktor.application.*
import io.ktor.features.*
import io.ktor.serialization.*


fun Application.configureSerialization() {
    install(ContentNegotiation) {
        json()
    }
}
