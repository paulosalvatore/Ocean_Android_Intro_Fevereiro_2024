package com.oceanbrasil.ocean_android_intro_fevereiro_2024

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Criar um listener para o botão
        // Precisamos encontrar o botão pelo ID

        // findViewById -> método que encontra View no Layout usando o ID
        // Dentro dos <>, informamos o tipo do elemento que estamos buscando
        // Dentro dos (), informamos o ID do elemento, usando R.id para buscar
        // Depois, armazenamos isso numa variável, para utilizarmos depois
        // val -> variável que inicia com um valor e esse valor nunca muda
        // var -> variável que iniciar com um valor e esse valor pode mudar
        val btEnviar = findViewById<Button>(R.id.btEnviar)
        val etNome = findViewById<EditText>(R.id.etNome)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)

        // Criar um Listener para o botão btEnviar
        btEnviar.setOnClickListener {
            // Dentro das chaves {}, o código será executado
            // quando o clique (toque) ocorrer no botão

            // Checamos se o etNome está em branco
            if (etNome.text.isBlank()) {
                // Exibir mensagem de erro
                etNome.error = "Digite um nome válido!"
            } else {
                // Atualização de texto do TextView
                tvResultado.text = etNome.text
            }
        }

        // Abrir a Activity Resultado
        // Registra a intenção (Intent) de abrir a tela no Android

        val btAbrirNovaTela = findViewById<Button>(R.id.btAbrirNovaTela)

        btAbrirNovaTela.setOnClickListener {
            // Para abrir a Activity: Intent que sabe onde estamos e para onde vamos
            //   -> De onde estamos: this (MainActivity)
            //   -> Para onde vamos: ResultadoActivity::class.java
            val resultadoIntent = Intent(this, ResultadoActivity::class.java)

            // Inicia a tela a partir dessa Intent
            startActivity(resultadoIntent)
        }
    }
}
