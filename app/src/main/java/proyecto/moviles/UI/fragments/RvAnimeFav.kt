package proyecto.moviles.UI.fragments

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import proyecto.moviles.R
import proyecto.moviles.databinding.ItemAnimesBinding
import proyecto.moviles.model.AnimeFav

data class RvAnimeFav(private val animefav: List<AnimeFav>): RecyclerView.Adapter<PersonFavoriteVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonFavoriteVH {
        val binding = ItemAnimesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PersonFavoriteVH(binding)
    }

    override fun getItemCount(): Int = animefav.size

    override fun onBindViewHolder(holder: PersonFavoriteVH, position: Int) {
        holder.bind(animefav[position])
    }
}

class PersonFavoriteVH(private val binding: ItemAnimesBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(favoritoanime: AnimeFav) {
        binding.txtTitulo.text= favoritoanime.titulo
        binding.txtGenero.text= favoritoanime.genero
        binding.txtFecha.text= favoritoanime.fechainicio
    }
}