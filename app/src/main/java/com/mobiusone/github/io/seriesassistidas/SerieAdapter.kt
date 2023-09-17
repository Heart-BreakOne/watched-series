package com.mobiusone.github.io.seriesassistidas

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.graphics.Paint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SerieAdapter(val context:Context, val dados: MutableList<Serie>):
    RecyclerView.Adapter<SerieAdapter.ItemViewHolder>() {

    var onItemClick: ((Serie) -> Unit)? = null

    inner class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view)
    {
        val txtSerie = view.findViewById<TextView>(R.id.txtNome)
        val txtServico = view.findViewById<TextView>(R.id.txtServico)

        init {
            itemView.setOnClickListener {
                onItemClick?.invoke(dados[adapterPosition])
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.linharecyclerview, parent, false)
        return ItemViewHolder(layout)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        val serie = dados[position]
        holder.txtSerie.text = serie.nomeSerie
        holder.txtServico.text = "Seviço: ${serie.nomeServico}"
        if(serie.assistido) {
            holder.txtSerie.setTextColor(Color.parseColor("#4D000000"));
            holder.txtServico.setTextColor(Color.parseColor("#4D000000"));
        }
        else {
            holder.txtSerie.setTextColor(Color.parseColor("#000000"));
            holder.txtServico.setTextColor(Color.parseColor("#000000"));
        }
    }

    override fun getItemCount(): Int {
        return dados.size
    }
}