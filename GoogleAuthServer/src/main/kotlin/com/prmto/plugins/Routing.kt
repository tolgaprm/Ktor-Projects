package com.prmto.plugins

import com.prmto.routes.authorizedRoute
import com.prmto.routes.rootRoute
import com.prmto.routes.tokenVerificationRoute
import com.prmto.routes.unauthorizedRoute
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        rootRoute()
        unauthorizedRoute()
        authorizedRoute()
        tokenVerificationRoute(application)
    }
}
