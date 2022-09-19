package com.prmto.plugins

import com.prmto.domain.model.repository.UserDataSource
import com.prmto.routes.*
import io.ktor.server.application.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Application.configureRouting() {
    routing {
        val userDataSource: UserDataSource by inject()
        rootRoute()
        tokenVerificationRoute(application, userDataSource)
        getUserInfoRoute(application, userDataSource)
        unauthorizedRoute()
        authorizedRoute()

    }
}
