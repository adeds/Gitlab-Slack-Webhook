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
        @SerialName("fields")
        val fields: List<Field?>? = null,
        @SerialName("text")
        val text: Text? = null,
        @SerialName("type")
        val type: String? = null
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
            val emoji: Boolean,
            @SerialName("type")
            val type: String
        )
    }
}

sealed class BlockType {
    object Header : BlockType() {
        override fun toString() = "header"
    }

    object Section : BlockType() {
        override fun toString() = "section"
    }
}