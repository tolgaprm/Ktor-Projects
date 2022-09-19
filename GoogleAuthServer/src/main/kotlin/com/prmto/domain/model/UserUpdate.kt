package com.prmto.domain.model

@kotlinx.serialization.Serializable
data class UserUpdate(
    val firstName:String,
    val lastName:String
)
