package com.prmto.plugins

import com.prmto.routes.rootRoute
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        rootRoute()
    }
}
