package id.ade.ktorwebhooksample.models.request


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SlackBodyRequest(
    @SerialName("blocks")
    val blocks: List<Block?>? = null
) {
    @Serializable
    data class Block(
        @SerialName("type")
        val type: String? = null,

        // for field type
        @SerialName("fields")
        val fields: List<Field?>? = null,

        //for text type
        @SerialName("text")
        val text: Text? = null,

        //for accessory type
        @SerialName("accessory")
        val accessory: Accessory? = null,
    ) {
        @Serializable
        data class Field(
            @SerialName("text")
            val text: String,
            @SerialName("type")
            val type: String
        )

        @Serializable
        data class Text(
            @SerialName("text")
            val text: String,
            @SerialName("emoji")
            val emoji: Boolean? = null,
            @SerialName("type")
            val type: String,
        )

        @Serializable
        data class Accessory(
            @SerialName("type")
            val type: String,
            @SerialName("image_url")
            val imageUrl: String? = null,
            @SerialName("alt_text")
            val altText: String? = null,
        )
    }

    companion object {
        const val HEADER_TYPE = "header"
        const val SECTION_TYPE = "section"
        const val IMAGE_TYPE = "image"
        const val MARKDOWN_TYPE = "mrkdwn"
        const val PLAIN_TEXT_TYPE = "plain_text"
    }
}