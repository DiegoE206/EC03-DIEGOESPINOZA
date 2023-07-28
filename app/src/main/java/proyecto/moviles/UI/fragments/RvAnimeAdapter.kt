package proyecto.moviles.UI.fragments

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import proyecto.moviles.R
import proyecto.moviles.databinding.ItemAnimesBinding
import proyecto.moviles.model.Animes

class RvAnimeAdapter(var anime: List<Animes>): RecyclerView.Adapter<AnimeVH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeVH {
        val binding = ItemAnimesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AnimeVH(binding)
    }

    override fun getItemCount() = anime.size

    override fun onBindViewHolder(holder: AnimeVH, position: Int) {
        holder.bind(anime[position])
    }
}

class AnimeVH(private val binding: ItemAnimesBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(animex: Animes) {
        binding.txtTitulo.text = animex.titulo
        binding.txtGenero.text = animex.genero
        binding.txtFecha.text= animex.fechainicio
    }

}