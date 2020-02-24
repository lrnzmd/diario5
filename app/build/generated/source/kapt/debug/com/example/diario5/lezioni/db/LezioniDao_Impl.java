package com.example.diario5.lezioni.db;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

@SuppressWarnings({"unchecked", "deprecation"})
public final class LezioniDao_Impl implements LezioniDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Lezioni> __insertionAdapterOfLezioni;

  private final EntityDeletionOrUpdateAdapter<Lezioni> __deletionAdapterOfLezioni;

  private final EntityDeletionOrUpdateAdapter<Lezioni> __updateAdapterOfLezioni;

  public LezioniDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfLezioni = new EntityInsertionAdapter<Lezioni>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `lezioni` (`orario`,`materia`,`giorno`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Lezioni value) {
        stmt.bindLong(1, value.getOrario());
        if (value.getMateria() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getMateria());
        }
        if (value.getGiorno() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getGiorno());
        }
      }
    };
    this.__deletionAdapterOfLezioni = new EntityDeletionOrUpdateAdapter<Lezioni>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `lezioni` WHERE `orario` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Lezioni value) {
        stmt.bindLong(1, value.getOrario());
      }
    };
    this.__updateAdapterOfLezioni = new EntityDeletionOrUpdateAdapter<Lezioni>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `lezioni` SET `orario` = ?,`materia` = ?,`giorno` = ? WHERE `orario` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Lezioni value) {
        stmt.bindLong(1, value.getOrario());
        if (value.getMateria() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getMateria());
        }
        if (value.getGiorno() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getGiorno());
        }
        stmt.bindLong(4, value.getOrario());
      }
    };
  }

  @Override
  public void insertMateria(final Lezioni... materia) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfLezioni.insert(materia);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertOrario(final String... orario) {
  }

  @Override
  public void insertGiorno(final Lezioni... giorno) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfLezioni.insert(giorno);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final Lezioni lezioni) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfLezioni.handle(lezioni);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateLezioni(final Lezioni... lezioni) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfLezioni.handleMultiple(lezioni);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Lezioni[] getAll() {
    final String _sql = "SELECT * FROM lezioni";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfOrario = CursorUtil.getColumnIndexOrThrow(_cursor, "orario");
      final int _cursorIndexOfMateria = CursorUtil.getColumnIndexOrThrow(_cursor, "materia");
      final int _cursorIndexOfGiorno = CursorUtil.getColumnIndexOrThrow(_cursor, "giorno");
      final Lezioni[] _result = new Lezioni[_cursor.getCount()];
      int _index = 0;
      while(_cursor.moveToNext()) {
        final Lezioni _item;
        _item = new Lezioni();
        final int _tmpOrario;
        _tmpOrario = _cursor.getInt(_cursorIndexOfOrario);
        _item.setOrario(_tmpOrario);
        final String _tmpMateria;
        _tmpMateria = _cursor.getString(_cursorIndexOfMateria);
        _item.setMateria(_tmpMateria);
        final String _tmpGiorno;
        _tmpGiorno = _cursor.getString(_cursorIndexOfGiorno);
        _item.setGiorno(_tmpGiorno);
        _result[_index] = _item;
        _index ++;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
