package proyecto.moviles.UI.fragments

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import proyecto.moviles.model.Animes

class ListaViewModel: ViewModel() {
    val animes: MutableLiveData<List<Animes>> = MutableLiveData<List<Animes>>()

    fun getAnimes() {}
}