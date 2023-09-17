package com.mobiusone.github.io.seriesassistidas;

import java.lang.System;

@androidx.room.Entity()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\bH\u00c6\u0003J1\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001J\t\u0010 \u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015\u00a8\u0006!"}, d2 = {"Lcom/mobiusone/github/io/seriesassistidas/Serie;", "", "codigo", "", "nomeSerie", "", "nomeServico", "assistido", "", "(ILjava/lang/String;Ljava/lang/String;Z)V", "getAssistido", "()Z", "setAssistido", "(Z)V", "getCodigo", "()I", "setCodigo", "(I)V", "getNomeSerie", "()Ljava/lang/String;", "setNomeSerie", "(Ljava/lang/String;)V", "getNomeServico", "setNomeServico", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class Serie {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int codigo;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nomeSerie;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nomeServico;
    private boolean assistido;
    
    @org.jetbrains.annotations.NotNull()
    public final com.mobiusone.github.io.seriesassistidas.Serie copy(int codigo, @org.jetbrains.annotations.NotNull()
    java.lang.String nomeSerie, @org.jetbrains.annotations.NotNull()
    java.lang.String nomeServico, boolean assistido) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Serie(int codigo, @org.jetbrains.annotations.NotNull()
    java.lang.String nomeSerie, @org.jetbrains.annotations.NotNull()
    java.lang.String nomeServico, boolean assistido) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getCodigo() {
        return 0;
    }
    
    public final void setCodigo(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNomeSerie() {
        return null;
    }
    
    public final void setNomeSerie(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNomeServico() {
        return null;
    }
    
    public final void setNomeServico(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean component4() {
        return false;
    }
    
    public final boolean getAssistido() {
        return false;
    }
    
    public final void setAssistido(boolean p0) {
    }
}