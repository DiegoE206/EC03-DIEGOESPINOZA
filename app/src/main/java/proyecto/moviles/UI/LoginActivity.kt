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

        binding.btnLogear.setOnClickListener {
            val email = binding.email.editText?.text.toString()
            val password = binding.password.editText?.text.toString()

            if (validateEmailPass(email, password)) {
                val ventanamenu = Intent(this, NavegacionActivity::class.java)
                startActivity(ventanamenu)
                Toast.makeText(this, "Ingreso al Menú", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show()
            }
        }

        binding.email.editText?.addTextChangedListener { text ->
            validateInputs()
        }
        binding.password.editText?.addTextChangedListener { text ->
            validateInputs()
        }
    }

    private fun validateInputs() {
        val email = binding.email.editText?.text.toString()
        val password = binding.password.editText?.text.toString()
        val isEmailValid = Patterns.EMAIL_ADDRESS.matcher(email).matches()
        val isPasswordValid = password.length >= 6

        binding.btnLogear.isEnabled = isEmailValid && isPasswordValid
    }

    private fun validateEmailPass(email: String, password: String): Boolean {
        return email == "ejemplo@idat.edu.pe" && password == "123456"
    }
}