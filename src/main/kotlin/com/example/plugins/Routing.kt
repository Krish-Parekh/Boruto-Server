package com.example.plugins

import com.example.repository.HeroRepository
import com.example.route.getAllHeroes
import com.example.route.root
import com.example.route.searchHeroes
import io.ktor.application.*
import io.ktor.http.content.*
import io.ktor.routing.*
import org.koin.ktor.ext.inject


fun Application.configureRouting() {

    routing {
        root()
        getAllHeroes()
        searchHeroes()


        static("/images") {
            resources("images")
        }
    }
}
