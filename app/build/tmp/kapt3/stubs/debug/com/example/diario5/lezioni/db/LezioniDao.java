package com.example.diario5.lezioni.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\'\u00a2\u0006\u0002\u0010\bJ!\u0010\t\u001a\u00020\u00032\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0007\"\u00020\u0005H\'\u00a2\u0006\u0002\u0010\u000bJ!\u0010\f\u001a\u00020\u00032\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0007\"\u00020\u0005H\'\u00a2\u0006\u0002\u0010\u000bJ!\u0010\u000e\u001a\u00020\u00032\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u0007\"\u00020\u0010H\'\u00a2\u0006\u0002\u0010\u0011J!\u0010\u0012\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0007\"\u00020\u0005H\'\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\u0013"}, d2 = {"Lcom/example/diario5/lezioni/db/LezioniDao;", "", "delete", "", "lezioni", "Lcom/example/diario5/lezioni/db/Lezioni;", "getAll", "", "()[Lcom/example/diario5/lezioni/db/Lezioni;", "insertGiorno", "giorno", "([Lcom/example/diario5/lezioni/db/Lezioni;)V", "insertMateria", "materia", "insertOrario", "orario", "", "([Ljava/lang/String;)V", "updateLezioni", "app_debug"})
public abstract interface LezioniDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM lezioni")
    public abstract com.example.diario5.lezioni.db.Lezioni[] getAll();
    
    @androidx.room.Insert()
    public abstract void insertMateria(@org.jetbrains.annotations.NotNull()
    com.example.diario5.lezioni.db.Lezioni... materia);
    
    @androidx.room.Insert()
    public abstract void insertOrario(@org.jetbrains.annotations.NotNull()
    java.lang.String... orario);
    
    @androidx.room.Insert()
    public abstract void insertGiorno(@org.jetbrains.annotations.NotNull()
    com.example.diario5.lezioni.db.Lezioni... giorno);
    
    @androidx.room.Update()
    public abstract void updateLezioni(@org.jetbrains.annotations.NotNull()
    com.example.diario5.lezioni.db.Lezioni... lezioni);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.example.diario5.lezioni.db.Lezioni lezioni);
}