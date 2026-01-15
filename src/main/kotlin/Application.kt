package com.example

import io.ktor.server.application.*
import io.ktor.server.config.tryGetString

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    print(environment.config.tryGetString("db.password"))
    configureRouting()
}
