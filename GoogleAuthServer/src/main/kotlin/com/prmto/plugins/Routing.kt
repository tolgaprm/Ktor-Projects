package com.prmto.plugins

import com.prmto.domain.model.repository.UserDataSource
import com.prmto.routes.authorizedRoute
import com.prmto.routes.rootRoute
import com.prmto.routes.tokenVerificationRoute
import com.prmto.routes.unauthorizedRoute
import io.ktor.server.application.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Application.configureRouting() {
    routing {
        val userDataSource: UserDataSource by inject()
        rootRoute()
        unauthorizedRoute()
        authorizedRoute()
        tokenVerificationRoute(application, userDataSource = userDataSource)
    }
}
