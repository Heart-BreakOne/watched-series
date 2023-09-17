package com.mobiusone.github.io.seriesassistidas

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity
data class Serie(
    @PrimaryKey(autoGenerate = true)
    var codigo:Int,
    var nomeSerie:String,
    var nomeServico: String,
    var assistido:Boolean)