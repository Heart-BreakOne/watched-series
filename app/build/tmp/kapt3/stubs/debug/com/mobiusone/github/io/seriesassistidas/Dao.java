package com.mobiusone.github.io.seriesassistidas;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\'\u00a8\u0006\n"}, d2 = {"Lcom/mobiusone/github/io/seriesassistidas/Dao;", "", "alterarSerie", "", "serie", "Lcom/mobiusone/github/io/seriesassistidas/Serie;", "excluirSerie", "incluirSerie", "obterTodos", "", "app_debug"})
public abstract interface Dao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM serie ORDER BY assistido ASC, codigo DESC")
    public abstract java.util.List<com.mobiusone.github.io.seriesassistidas.Serie> obterTodos();
    
    @androidx.room.Insert()
    public abstract void incluirSerie(@org.jetbrains.annotations.NotNull()
    com.mobiusone.github.io.seriesassistidas.Serie serie);
    
    @androidx.room.Update()
    public abstract void alterarSerie(@org.jetbrains.annotations.NotNull()
    com.mobiusone.github.io.seriesassistidas.Serie serie);
    
    @androidx.room.Delete()
    public abstract void excluirSerie(@org.jetbrains.annotations.NotNull()
    com.mobiusone.github.io.seriesassistidas.Serie serie);
}