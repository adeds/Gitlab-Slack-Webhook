package id.ade.ktorwebhooksample.routes

import id.ade.ktorwebhooksample.models.Message
import id.ade.ktorwebhooksample.models.request.BlockType
import id.ade.ktorwebhooksample.models.request.SlackBodyRequest
import id.ade.ktorwebhooksample.utils.Constant
import id.ade.ktorwebhooksample.utils.toJson
import io.ktor.application.call
import io.ktor.client.HttpClient
import io.ktor.client.request.post
import io.ktor.http.ContentType
import io.ktor.http.HttpStatusCode
import io.ktor.http.contentType
import io.ktor.locations.KtorExperimentalLocationsAPI
import io.ktor.locations.Location
import io.ktor.locations.post
import io.ktor.response.respond
import io.ktor.routing.Route
import io.ktor.util.InternalAPI

private const val API_VERSION = "/v1"
const val GITLAB_WEBHOOK = "$API_VERSION/gitlab"

@KtorExperimentalLocationsAPI
@Location(GITLAB_WEBHOOK)
class GitlabWebhookRoute

@OptIn(InternalAPI::class)
@KtorExperimentalLocationsAPI
fun Route.gitlabWebhook(client: HttpClient) {
    post<GitlabWebhookRoute> {

        kotlin.runCatching {
            val response = client.post<String>(System.getenv(Constant.Slack.SLACK_WEBHOOK_URL)) {
                contentType(ContentType.Application.Json)
                val requestBody = SlackBodyRequest(
                    listOf(
                        SlackBodyRequest.Block(
                            type = BlockType.Header.toString(),
                            text = SlackBodyRequest.Block.Text(
                                text = "From Custom",
                                emoji = true,
                                type = "plain_text"
                            )
                        ),
                        SlackBodyRequest.Block(
                            type = BlockType.Section.toString(), fields = listOf(
                                SlackBodyRequest.Block.Field(
                                    text = "*Type:*\nThis is from webhook",
                                    type = "mrkdwn"
                                ),
                                SlackBodyRequest.Block.Field(
                                    text = "*Created by:*\n<https://github.com/adeds|Ade Dyas>",
                                    type = "mrkdwn"
                                ),
                            )
                        )
                    )
                )
                body = requestBody
            }

            if (response.contains("ok")) {
                call.respond(HttpStatusCode.Accepted, Message(response).toJson())
            } else {
                call.respond(HttpStatusCode.BadRequest, Message(response).toJson())
            }
        }.getOrElse {
            call.respond(HttpStatusCode.BadRequest, Message(it.message.orEmpty()).toJson())
        }

        client.close()
    }
}