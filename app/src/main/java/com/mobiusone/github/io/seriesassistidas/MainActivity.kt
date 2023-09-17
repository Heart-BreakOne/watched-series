package com.mobiusone.github.io.seriesassistidas

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Adapter
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var dados: MutableList<Serie>
    private lateinit var recyclerView: RecyclerView
    private lateinit var serieAdapter: SerieAdapter

    private lateinit var db:AppDatabase

    @SuppressLint("NotifyDataSetChanged")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        db = Room.databaseBuilder(applicationContext, AppDatabase::class.java, "banco.db").allowMainThreadQueries().build()
        dados = db.serieDao().obterTodos()
        recyclerView = findViewById(R.id.rvSeries)

        serieAdapter = SerieAdapter(this, dados)
        recyclerView.adapter = serieAdapter
        val layout = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.layoutManager = layout

        val divider = DividerItemDecoration(recyclerView.context, layout.orientation)
        recyclerView.addItemDecoration(divider)

        serieAdapter.onItemClick = { serie ->
            if(serie.assistido) {
                Toast.makeText(this, "ASSISTIR: ${serie.nomeSerie}", Toast.LENGTH_SHORT).show()
                val updateSerie = Serie(serie.codigo, serie.nomeSerie, serie.nomeServico, false)
                db.serieDao().alterarSerie(updateSerie)
            }
            else {
                val updateSerie = Serie(serie.codigo, serie.nomeSerie, serie.nomeServico, true)
                db.serieDao().alterarSerie(updateSerie)
                Toast.makeText(this, "ASSISTIDO: ${serie.nomeSerie}", Toast.LENGTH_SHORT).show()
            }
            serie.assistido = !serie.assistido
            serieAdapter.notifyDataSetChanged()
        }
        serieAdapter.notifyDataSetChanged()
    }

    //INICIO MENU
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.addNoteMenu -> {
                NovoItem().show(supportFragmentManager, "nova serie")
            }
        }
        return false
    }
    //FIM MENU

    //ADICIONA ITEM
    @SuppressLint("NotifyDataSetChanged")
    fun adicionarSerie(nome:String, servico:String) {

            val novaSerie = Serie(0, nome, servico, false)
            dados.add(novaSerie)
            db.serieDao().incluirSerie(novaSerie)
            recyclerView.adapter!!.notifyDataSetChanged()
        }
    }
