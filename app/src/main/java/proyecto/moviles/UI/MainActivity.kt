package proyecto.moviles.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import proyecto.moviles.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnIngresar.setOnClickListener {
            val InitialVentana = Intent(this, LoginActivity::class.java)
            startActivity(InitialVentana)
            Toast.makeText(this, "Logeate Usuario", Toast.LENGTH_SHORT).show()
        }
    }
}