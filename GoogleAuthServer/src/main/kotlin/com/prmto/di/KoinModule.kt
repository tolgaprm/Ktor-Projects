package com.prmto.di

import com.prmto.data.repository.UserDataSourceImpl
import com.prmto.domain.model.repository.UserDataSource
import com.prmto.util.Constants.DATABASE_NAME
import org.koin.dsl.module
import org.litote.kmongo.coroutine.coroutine
import org.litote.kmongo.reactivestreams.KMongo


val koinModule = module {
    single {
        KMongo.createClient(
            System.getenv("MONGODB_URI")
        )
            .coroutine
            .getDatabase(name = DATABASE_NAME)
    }

    single<UserDataSource> {
        UserDataSourceImpl(get())
    }
}