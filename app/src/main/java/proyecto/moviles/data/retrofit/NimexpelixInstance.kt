package proyecto.moviles.data.retrofit

import retrofit2.http.GET

interface NimexpelixInstance {
    @GET("")
    fun getAllAnimes()
}