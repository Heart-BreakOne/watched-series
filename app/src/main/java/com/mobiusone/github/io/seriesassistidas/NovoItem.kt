package com.mobiusone.github.io.seriesassistidas

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import android.widget.Toast.LENGTH_LONG
import android.widget.Toast.LENGTH_SHORT
import androidx.fragment.app.DialogFragment

class NovoItem : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //Alguns valores
        val view = layoutInflater.inflate(R.layout.fragment_novoitem, container, false)
        val nomeSerie = view.findViewById<EditText>(R.id.edtNomeSerie)
        val nomeServico = view.findViewById<EditText>(R.id.edtNomeServico)
        val contexto = activity?.applicationContext
        val mainActivity = activity as MainActivity

        //LIMPA CAIXAS DE TEXTO
        view.findViewById<ImageView>(R.id.ivLimpa).setOnClickListener {
            nomeSerie.text.clear()
            nomeServico.text.clear()
            Toast.makeText(contexto, "Tudo limpo!", LENGTH_SHORT).show()
        }
        //CANCELA OPERACAO
        view.findViewById<ImageView>(R.id.ivCancela).setOnClickListener {
            nomeSerie.text.clear()
            nomeServico.text.clear()
            Toast.makeText(contexto, "okay, saindo :(", LENGTH_SHORT).show()
            dismiss()
        }

        //ADICIONA NOVA SERIE
        view.findViewById<ImageView>(R.id.ivAdiciona).setOnClickListener {
            if (nomeSerie.text.isNullOrEmpty() || nomeServico.text.isNullOrEmpty()) {
                Toast.makeText(contexto, "Preencha todos os campos!", LENGTH_SHORT).show()
            }
            else {
                val nome = nomeSerie.text.toString()
                val servico = nomeServico.text.toString()
                mainActivity.adicionarSerie(nome, servico)
                dismiss()
            }

        }
        return view
    }

}


