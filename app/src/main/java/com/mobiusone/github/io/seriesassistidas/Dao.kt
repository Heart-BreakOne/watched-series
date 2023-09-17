package com.mobiusone.github.io.seriesassistidas

import androidx.room.*
import androidx.room.Dao

@Dao
interface Dao {

    @Query("SELECT * FROM serie ORDER BY assistido ASC, codigo DESC")
    fun obterTodos(): MutableList<Serie>

    @Insert
    fun incluirSerie(serie: Serie)

    @Update
    fun alterarSerie(serie: Serie)

    @Delete
    fun excluirSerie(serie: Serie)
}