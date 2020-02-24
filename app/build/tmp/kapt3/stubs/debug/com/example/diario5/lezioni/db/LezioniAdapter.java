package com.example.diario5.lezioni.db;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0016B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u001c\u0010\u0012\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/example/diario5/lezioni/db/LezioniAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/diario5/lezioni/db/Lezioni;", "Lcom/example/diario5/lezioni/db/LezioniAdapter$LezioniViewHolder;", "lezioni", "Lcom/example/diario5/lezioni/giorni/Lunedi;", "(Lcom/example/diario5/lezioni/giorni/Lunedi;)V", "getLezioni", "()Lcom/example/diario5/lezioni/giorni/Lunedi;", "setLezioni", "lezioniinfo", "", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "LezioniViewHolder", "app_debug"})
public final class LezioniAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.diario5.lezioni.db.Lezioni, com.example.diario5.lezioni.db.LezioniAdapter.LezioniViewHolder> {
    private java.util.List<com.example.diario5.lezioni.db.Lezioni> lezioniinfo;
    @org.jetbrains.annotations.NotNull()
    private com.example.diario5.lezioni.giorni.Lunedi lezioni;
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.diario5.lezioni.db.LezioniAdapter.LezioniViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.diario5.lezioni.db.LezioniAdapter.LezioniViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.diario5.lezioni.giorni.Lunedi getLezioni() {
        return null;
    }
    
    public final void setLezioni(@org.jetbrains.annotations.NotNull()
    com.example.diario5.lezioni.giorni.Lunedi p0) {
    }
    
    public LezioniAdapter(@org.jetbrains.annotations.NotNull()
    com.example.diario5.lezioni.giorni.Lunedi lezioni) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t\u00a8\u0006\f"}, d2 = {"Lcom/example/diario5/lezioni/db/LezioniAdapter$LezioniViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemview", "Landroid/view/View;", "(Lcom/example/diario5/lezioni/db/LezioniAdapter;Landroid/view/View;)V", "materia", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getMateria", "()Landroid/widget/TextView;", "orario", "getOrario", "app_debug"})
    public final class LezioniViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.TextView orario = null;
        private final android.widget.TextView materia = null;
        
        public final android.widget.TextView getOrario() {
            return null;
        }
        
        public final android.widget.TextView getMateria() {
            return null;
        }
        
        public LezioniViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemview) {
            super(null);
        }
    }
}