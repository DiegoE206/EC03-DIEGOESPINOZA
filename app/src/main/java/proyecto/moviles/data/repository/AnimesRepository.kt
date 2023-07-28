package proyecto.moviles.data.repository

import proyecto.moviles.data.retrofit.RetrofitHelper
import proyecto.moviles.model.Animes

class AnimesRepository {
    suspend fun getAnimes(): List<Animes> {
        val response = RetrofitHelper.animesInstance.getAllPerson()
        return response.results
    }
}