package ridaz.sl.composebootcamp.data.entity

import java.util.UUID

data class Explore(
    val id: UUID = UUID.randomUUID(),
    val title: String,
    val description: String,
    val image: Int,
    val url: String
)