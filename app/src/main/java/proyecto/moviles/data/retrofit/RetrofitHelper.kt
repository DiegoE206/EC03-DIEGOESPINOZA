package proyecto.moviles.data.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    private val retrofitInstance: Retrofit = Retrofit.Builder()
        .baseUrl("https://myanimelist.net/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val animesInstance = retrofitInstance.create(NimexpelixInstance::class.java)
}