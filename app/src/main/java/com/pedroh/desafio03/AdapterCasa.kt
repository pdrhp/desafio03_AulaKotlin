package com.pedroh.desafio03

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterCasa(private val context: Context, private val casaList:List<Casa>):BaseAdapter() {
    override fun getCount(): Int {
        return casaList.size
    }

    override fun getItem(position: Int): Any {
        return casaList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View
        val viewHolder : ViewHolder

        if (convertView == null){
            view = LayoutInflater.from(context).inflate(R.layout.list_item_casas,parent, false)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        }
        else{
            view = convertView
            viewHolder = view.tag as ViewHolder
        }

        val casa = getItem(position) as Casa
        viewHolder.imagem.setImageResource(casa.imagem)
        viewHolder.cidade.text = casa.cidadeCasa
        viewHolder.preco.text = casa.valorCasa

        return view
    }

    private class ViewHolder(view: View){
        val imagem:ImageView = view.findViewById(R.id.imgCasa)
        val cidade:TextView = view.findViewById(R.id.tvCidadedaCasa)
        val preco:TextView = view.findViewById(R.id.tvPrecoCasa)
    }
}