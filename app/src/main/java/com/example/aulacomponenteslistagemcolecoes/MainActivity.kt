package com.example.aulacomponenteslistagemcolecoes

import android.content.res.Resources
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.aulacomponenteslistagemcolecoes.teste.Recursos

class MainActivity : AppCompatActivity() {
    private lateinit var btnExecutar: Button
    private lateinit var textResultado: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnExecutar = findViewById(R.id.btn_executar)
        textResultado = findViewById(R.id.text_resultado)

        btnExecutar.setOnClickListener {
            textResultado.text = "Mudando o texto"

        }

    }

    fun cliqueBotao(view: View) {

        view.display
        textResultado.text = "Mudando o texto"

        // é setado direto no botao no xml no metodo onclick
    }
}
