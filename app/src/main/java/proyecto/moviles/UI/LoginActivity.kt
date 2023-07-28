package proyecto.moviles.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import proyecto.moviles.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.email.editText?.addTextChangedListener { text ->
            binding.btnLogear.isEnabled = validateEmailPass(text.toString(), binding.password.editText?.text.toString())
        }

        binding.password.editText?.addTextChangedListener { text ->
            binding.btnLogear.isEnabled = validateEmailPass(binding.email.editText?.text.toString(), text.toString())
        }

        binding.btnLogear.setOnClickListener {
            val InitialVentana = Intent(this, NavegacionActivity::class.java)
            startActivity(InitialVentana)
            Toast.makeText(this, "Usuario Ingresado", Toast.LENGTH_SHORT).show()
        }

    }

    private fun validateEmailPass(email: String, pass: String): Boolean {
        val validateEmail = email.isNotEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches() && email == "ejemplo@idat.edu.pe"
        val validatePass = pass.isNotEmpty() && pass == "123456"
        return validateEmail && validatePass
    }
}