package com.pedroh.desafio03

data class Casa (
    val imagem:Int,
    val cidadeCasa:String,
    val valorCasa:String
        )

object CasaRepository{
    fun getCasas(): List<Casa>{
        return listOf(Casa(R.drawable.casa1, "Gama", "R$ 1.100.000"), Casa(R.drawable.casa2, "Samambaia", "R$ 295.000"))
    }
}
