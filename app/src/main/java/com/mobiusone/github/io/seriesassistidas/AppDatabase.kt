package com.mobiusone.github.io.seriesassistidas

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Serie::class), version = 2)
abstract class AppDatabase : RoomDatabase() {
    abstract fun serieDao(): Dao
}