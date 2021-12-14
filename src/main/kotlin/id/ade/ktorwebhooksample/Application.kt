package id.ade.ktorwebhooksample

import id.ade.ktorwebhooksample.routes.gitlabWebhook
import io.ktor.application.Application
import io.ktor.application.install
import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.features.json.serializer.KotlinxSerializer
import io.ktor.client.features.logging.DEFAULT
import io.ktor.client.features.logging.LogLevel
import io.ktor.client.features.logging.Logger
import io.ktor.client.features.logging.Logging
import io.ktor.features.ContentNegotiation
import io.ktor.gson.gson
import io.ktor.locations.KtorExperimentalLocationsAPI
import io.ktor.locations.Locations
import io.ktor.routing.routing
import io.ktor.server.netty.EngineMain
import io.ktor.util.KtorExperimentalAPI

fun main(args: Array<String>): Unit = EngineMain.main(args)

@KtorExperimentalAPI
@KtorExperimentalLocationsAPI
@Suppress("unused") // Referenced in application.conf
fun Application.module() {
    install(Locations) {
    }
    install(ContentNegotiation) {
        gson {
        }
    }
    routing {
        gitlabWebhook()
    }
}
