package com.oceanbrasil.ocean_android_intro_fevereiro_2024

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        // Acessar a Intent que criou a ResultadoActivity
        // Dentro dessa Intent, vamos pegar o dado exta que foi passado
        // Com esse dado em mãos, vamos atualizar no TextView dessa tela
        // Para isso, vamos acessar o TextView pelo ID e colocar numa variável

        val nomeDigitado = intent.getStringExtra("NOME_DIGITADO")

        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        tvResultado.text = nomeDigitado

        // Botão Voltar

        val btVoltar = findViewById<Button>(R.id.btVoltar)
        btVoltar.setOnClickListener {
            finish()
        }
    }
}
