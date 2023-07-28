package proyecto.moviles.UI.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import proyecto.moviles.databinding.FragmentListaBinding

class ListaFragment : Fragment() {
    private lateinit var binding: FragmentListaBinding
    private lateinit var viewModel: ListaViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(requireActivity())[ListaViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentListaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = RvAnimeAdapter(listOf())
        binding.rvListanime.adapter = adapter
        binding.rvListanime.layoutManager = GridLayoutManager(requireContext(), 2, RecyclerView.VERTICAL, false)
        viewModel.animes.observe(requireActivity()) {anim ->
            adapter.anime = anim
            adapter.notifyDataSetChanged()
        }

        viewModel.getAnimes()
    }

}