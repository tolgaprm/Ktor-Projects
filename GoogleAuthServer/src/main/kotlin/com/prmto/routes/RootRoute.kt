package com.prmto.routes

import com.prmto.domain.model.Endpoint
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Routing.rootRoute() {
    get(Endpoint.Root.path) {
        call.respondText("Welcome to Ktor Server!")
    }

}