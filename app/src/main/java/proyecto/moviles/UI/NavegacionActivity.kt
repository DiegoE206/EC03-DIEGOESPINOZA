package proyecto.moviles.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import proyecto.moviles.R
import proyecto.moviles.databinding.ActivityNavegacionBinding

class NavegacionActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNavegacionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityNavegacionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragmentView = supportFragmentManager.findFragmentById(R.id.fcv_navigation) as NavHostFragment
        val navController = fragmentView.navController
        binding.bnv.setupWithNavController(navController)
        /*binding.bnv.setOnItemSelectedListener {item ->
            when(item.itemId){
                R.id.home -> {
                    binding.txtTexto.text ="Home"
                    true
                }
                R.id.favorito -> {
                    binding.txtTexto.text ="Favorito"
                    true
                }
                R.id.info -> {
                    binding.txtTexto.text ="Info"
                    true
                }
                else -> {
                    false
                }
            }

        }*/
    }
}