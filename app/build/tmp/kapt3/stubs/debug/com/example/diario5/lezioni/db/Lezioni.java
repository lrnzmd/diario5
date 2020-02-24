package com.example.diario5.lezioni.db;

import java.lang.System;

@androidx.room.Entity(tableName = "lezioni")
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/example/diario5/lezioni/db/Lezioni;", "", "()V", "giorno", "", "getGiorno", "()Ljava/lang/String;", "setGiorno", "(Ljava/lang/String;)V", "materia", "getMateria", "setMateria", "orario", "", "getOrario", "()I", "setOrario", "(I)V", "app_debug"})
public final class Lezioni {
    @androidx.room.ColumnInfo(name = "orario")
    @androidx.room.PrimaryKey()
    private int orario;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "materia")
    private java.lang.String materia;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "giorno")
    private java.lang.String giorno;
    
    public final int getOrario() {
        return 0;
    }
    
    public final void setOrario(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMateria() {
        return null;
    }
    
    public final void setMateria(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGiorno() {
        return null;
    }
    
    public final void setGiorno(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public Lezioni() {
        super();
    }
}