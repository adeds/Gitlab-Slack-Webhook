package id.ade.ktorwebhooksample

import id.ade.ktorwebhooksample.routes.gitlabWebhook
import io.kotless.dsl.ktor.Kotless
import io.ktor.application.Application
import io.ktor.application.install
import io.ktor.features.ContentNegotiation
import io.ktor.gson.gson
import io.ktor.routing.routing
import kotlin.time.ExperimentalTime

@Suppress("unused")
class Server : Kotless() {

    @OptIn(ExperimentalTime::class)
    override fun prepare(app: Application) {

        app.install(ContentNegotiation) {
            gson()
        }

        app.routing {
            gitlabWebhook()
        }
    }
}
