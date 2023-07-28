package proyecto.moviles.model

data class Animes(
    val name: String,
    val tipo: String,
    val temporadas: String,
    val isFavorite: Boolean = false,
    val fechaestreno: String
)
