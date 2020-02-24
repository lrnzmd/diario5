package com.example.diario5.appunti;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u00015B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J7\u0010%\u001a\u00020&2\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00060(2\u0006\u0010)\u001a\u00020\u00062\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060(2\u0006\u0010+\u001a\u00020\u0006\u00a2\u0006\u0002\u0010,J!\u0010-\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u00062\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060(\u00a2\u0006\u0002\u0010.J\u000e\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202J)\u00103\u001a\u00020\u00182\u0006\u00101\u001a\u0002022\u0006\u0010)\u001a\u00020\u00062\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060(\u00a2\u0006\u0002\u00104R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\u001a\u0010\u0011\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u001a\u0010\u0014\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\bR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$\u00a8\u00066"}, d2 = {"Lcom/example/diario5/appunti/DbManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "colDes", "", "getColDes", "()Ljava/lang/String;", "setColDes", "(Ljava/lang/String;)V", "colID", "getColID", "setColID", "colTitle", "getColTitle", "setColTitle", "dbName", "getDbName", "setDbName", "dbTable", "getDbTable", "setDbTable", "dbVersion", "", "getDbVersion", "()I", "setDbVersion", "(I)V", "sqlCreateTable", "getSqlCreateTable", "sqlDB", "Landroid/database/sqlite/SQLiteDatabase;", "getSqlDB", "()Landroid/database/sqlite/SQLiteDatabase;", "setSqlDB", "(Landroid/database/sqlite/SQLiteDatabase;)V", "Query", "Landroid/database/Cursor;", "projection", "", "selection", "selectionArgs", "sorOrder", "([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "delete", "(Ljava/lang/String;[Ljava/lang/String;)I", "insert", "", "values", "Landroid/content/ContentValues;", "update", "(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "DatabaseHelperNotes", "app_debug"})
public final class DbManager {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String dbName;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String dbTable;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String colID;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String colTitle;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String colDes;
    private int dbVersion;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String sqlCreateTable = null;
    @org.jetbrains.annotations.Nullable()
    private android.database.sqlite.SQLiteDatabase sqlDB;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDbName() {
        return null;
    }
    
    public final void setDbName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDbTable() {
        return null;
    }
    
    public final void setDbTable(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getColID() {
        return null;
    }
    
    public final void setColID(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getColTitle() {
        return null;
    }
    
    public final void setColTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getColDes() {
        return null;
    }
    
    public final void setColDes(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getDbVersion() {
        return 0;
    }
    
    public final void setDbVersion(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSqlCreateTable() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.database.sqlite.SQLiteDatabase getSqlDB() {
        return null;
    }
    
    public final void setSqlDB(@org.jetbrains.annotations.Nullable()
    android.database.sqlite.SQLiteDatabase p0) {
    }
    
    public final long insert(@org.jetbrains.annotations.NotNull()
    android.content.ContentValues values) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.database.Cursor Query(@org.jetbrains.annotations.NotNull()
    java.lang.String[] projection, @org.jetbrains.annotations.NotNull()
    java.lang.String selection, @org.jetbrains.annotations.NotNull()
    java.lang.String[] selectionArgs, @org.jetbrains.annotations.NotNull()
    java.lang.String sorOrder) {
        return null;
    }
    
    public final int delete(@org.jetbrains.annotations.NotNull()
    java.lang.String selection, @org.jetbrains.annotations.NotNull()
    java.lang.String[] selectionArgs) {
        return 0;
    }
    
    public final int update(@org.jetbrains.annotations.NotNull()
    android.content.ContentValues values, @org.jetbrains.annotations.NotNull()
    java.lang.String selection, @org.jetbrains.annotations.NotNull()
    java.lang.String[] selectionArgs) {
        return 0;
    }
    
    public DbManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\"\u0010\r\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0011"}, d2 = {"Lcom/example/diario5/appunti/DbManager$DatabaseHelperNotes;", "Landroid/database/sqlite/SQLiteOpenHelper;", "context", "Landroid/content/Context;", "(Lcom/example/diario5/appunti/DbManager;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "onCreate", "", "db", "Landroid/database/sqlite/SQLiteDatabase;", "onUpgrade", "oldVersion", "", "newVersion", "app_debug"})
    public final class DatabaseHelperNotes extends android.database.sqlite.SQLiteOpenHelper {
        @org.jetbrains.annotations.Nullable()
        private android.content.Context context;
        
        @org.jetbrains.annotations.Nullable()
        public final android.content.Context getContext() {
            return null;
        }
        
        public final void setContext(@org.jetbrains.annotations.Nullable()
        android.content.Context p0) {
        }
        
        @java.lang.Override()
        public void onCreate(@org.jetbrains.annotations.Nullable()
        android.database.sqlite.SQLiteDatabase db) {
        }
        
        @java.lang.Override()
        public void onUpgrade(@org.jetbrains.annotations.Nullable()
        android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
        }
        
        public DatabaseHelperNotes(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super(null, null, null, 0);
        }
    }
}