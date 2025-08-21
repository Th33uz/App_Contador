package com.example.app_contador

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var contador: Int = 0
        var botaoDecrementador: Button = findViewById<Button>(R.id.Decrementador)
        var botaoIncrementador: Button = findViewById<Button>(R.id.Incrementador)
        var TextoContador: TextView = findViewById(R.id.TextoContador)

        botaoIncrementador.setOnClickListener {
            contador++
            TextoContador.text = contador.toString()

        }
        botaoDecrementador.setOnClickListener{
            if(contador > 0) {
                contador--
                TextoContador.text = contador.toString()}
            else {Snackbar.make(it, "Somente números positivos", Snackbar.LENGTH_SHORT).show()}

        }

    }
}