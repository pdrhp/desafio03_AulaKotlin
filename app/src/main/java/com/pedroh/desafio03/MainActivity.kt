package com.pedroh.desafio03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listaDeCasas = CasaRepository.getCasas()
        val lvCasas:ListView = findViewById(R.id.listViewCasas)
        lvCasas.adapter = AdapterCasa(this, CasaRepository.getCasas())

        lvCasas.setOnItemClickListener { parent, view, position, id ->

            val intent = Intent(this, DetalheCasaActivity::class.java)
            intent.putExtra("nomeCidade",listaDeCasas[position].cidadeCasa )
            intent.putExtra("imagemCasa", listaDeCasas[position].imagem)
            intent.putExtra("precoCasa", listaDeCasas[position].valorCasa)
            startActivity(intent)
        }
    }
}