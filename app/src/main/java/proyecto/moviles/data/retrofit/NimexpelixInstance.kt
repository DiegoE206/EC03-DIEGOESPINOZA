package proyecto.moviles.data.retrofit

import proyecto.moviles.data.response.AnimesListResponse
import retrofit2.http.GET

interface NimexpelixInstance {
    @GET("api/character")
    suspend fun getAllAnime(): AnimesListResponse
}