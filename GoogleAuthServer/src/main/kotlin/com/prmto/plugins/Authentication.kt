package com.prmto.plugins

import com.prmto.domain.model.Endpoint
import com.prmto.domain.model.UserSession
import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.response.*

fun Application.configureAuth(){
    install(Authentication){
        session<UserSession>("auth-session"){
            validate { session->
                session
            }
            challenge {
                call.respondRedirect(Endpoint.Unauthorized.path)
            }
        }
    }
}