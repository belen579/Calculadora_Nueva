package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.calculadora.databinding.ActivityMainBinding

class ViewBindingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.calcular.setOnClickListener() {
            val operandouno: Int = binding.numero1.toString().toInt()
            val operandodos: Int = binding.cajanum2.toString().toInt()

            if (binding.suma.isChecked) {
                val suma: Int = operandouno + operandodos
                binding.resultado.text = "$suma"
               Toast.makeText(this, "Resultado:$suma", Toast.LENGTH_SHORT).show()
            } else {

                val rest: Int = operandouno - operandodos
                binding.resultado.text = "$rest"
                Toast.makeText(this, "Resultado:$rest", Toast.LENGTH_SHORT).show()
            }


        }
    }
}
