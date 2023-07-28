package proyecto.moviles.model

data class AnimeFav(
    val studio: String,
    val genero: String,
    val titulo: String,
    val fechainicio: String,
    val infoimg: String
)

data class Origin(
    val name: String
)

data class Location(
    val name: String
)

fun getDataFavorite(): List<AnimeFav> = listOf(
    AnimeFav(
        studio = "Bones",
        genero = "Mystery",
        titulo = "Bungou Stray Dogs",
        fechainicio = "Apr 7, 2016",
        infoimg = "http://myanimelist.net/anime/31478/Bungou_Stray_Dogs"
    )
)