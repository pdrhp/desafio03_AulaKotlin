package com.pedroh.desafio03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetalheCasaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe_casa)

        val tvNomeCidadeAC2:TextView = findViewById(R.id.textViewNomeCidade)
        val ivCasaAC2:ImageView = findViewById(R.id.imageViewCasa)
        val tvPrecoCasaAC2:TextView = findViewById(R.id.textViewPrecoCasa)

        var stringNomeCidade = intent.getStringExtra("nomeCidade");
        var intImagemCasa = intent.getIntExtra("imagemCasa", 0);
        var stringValorCasa = intent.getStringExtra("precoCasa");

        tvNomeCidadeAC2.text = stringNomeCidade;
        ivCasaAC2.setImageResource(intImagemCasa)
        tvPrecoCasaAC2.text = stringValorCasa;

    }
}