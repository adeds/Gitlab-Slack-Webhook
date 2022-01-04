package id.ade.ktorwebhooksample.models.request

import com.google.gson.annotations.SerializedName


data class SlackBodyRequest(
    val blocks: List<Block?>? = null
) {
    data class Block(
        val type: String? = null,

        // for field type
        val fields: List<Field?>? = null,

        //for text type
        val text: Text? = null,

        //for accessory type
        val accessory: Accessory? = null
    ) {
        data class Field(
            val text: String,
            val type: String
        )

        data class Text(
            val text: String,
            val emoji: Boolean? = null,
            val type: String
        )

        data class Accessory(
            val type: String,
            @SerializedName("image_url")
            val imageUrl: String? = null,
            @SerializedName("alt_text")
            val altText: String? = null
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