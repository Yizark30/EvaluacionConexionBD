package ni.edu.uca.sistematicopersistencia.data.database.dao;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import ni.edu.uca.sistematicopersistencia.data.database.entities.EntityProducto;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ProductoDao_Impl implements ProductoDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<EntityProducto> __insertionAdapterOfEntityProducto;

  private final EntityDeletionOrUpdateAdapter<EntityProducto> __deletionAdapterOfEntityProducto;

  private final EntityDeletionOrUpdateAdapter<EntityProducto> __updateAdapterOfEntityProducto;

  public ProductoDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfEntityProducto = new EntityInsertionAdapter<EntityProducto>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `TblProducto` (`id`,`nombreProd`,`precioProd`,`existProd`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, EntityProducto value) {
        stmt.bindLong(1, value.getId());
        if (value.getNombre() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNombre());
        }
        stmt.bindDouble(3, value.getPrecio());
        stmt.bindLong(4, value.getExistencia());
      }
    };
    this.__deletionAdapterOfEntityProducto = new EntityDeletionOrUpdateAdapter<EntityProducto>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `TblProducto` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, EntityProducto value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfEntityProducto = new EntityDeletionOrUpdateAdapter<EntityProducto>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `TblProducto` SET `id` = ?,`nombreProd` = ?,`precioProd` = ?,`existProd` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, EntityProducto value) {
        stmt.bindLong(1, value.getId());
        if (value.getNombre() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNombre());
        }
        stmt.bindDouble(3, value.getPrecio());
        stmt.bindLong(4, value.getExistencia());
        stmt.bindLong(5, value.getId());
      }
    };
  }

  @Override
  public Object insertarReg(final EntityProducto producto,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfEntityProducto.insert(producto);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object eliminarReg(final EntityProducto producto,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfEntityProducto.handle(producto);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object actualizarReg(final EntityProducto producto,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfEntityProducto.handle(producto);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Flow<List<EntityProducto>> obtRegistos() {
    final String _sql = "SELECT * FROM TblProducto";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"TblProducto"}, new Callable<List<EntityProducto>>() {
      @Override
      public List<EntityProducto> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfNombre = CursorUtil.getColumnIndexOrThrow(_cursor, "nombreProd");
          final int _cursorIndexOfPrecio = CursorUtil.getColumnIndexOrThrow(_cursor, "precioProd");
          final int _cursorIndexOfExistencia = CursorUtil.getColumnIndexOrThrow(_cursor, "existProd");
          final List<EntityProducto> _result = new ArrayList<EntityProducto>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final EntityProducto _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpNombre;
            if (_cursor.isNull(_cursorIndexOfNombre)) {
              _tmpNombre = null;
            } else {
              _tmpNombre = _cursor.getString(_cursorIndexOfNombre);
            }
            final double _tmpPrecio;
            _tmpPrecio = _cursor.getDouble(_cursorIndexOfPrecio);
            final int _tmpExistencia;
            _tmpExistencia = _cursor.getInt(_cursorIndexOfExistencia);
            _item = new EntityProducto(_tmpId,_tmpNombre,_tmpPrecio,_tmpExistencia);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<EntityProducto> obtRegistro(final int id) {
    final String _sql = "SELECT * FROM TblProducto WHERE id= ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"TblProducto"}, new Callable<EntityProducto>() {
      @Override
      public EntityProducto call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfNombre = CursorUtil.getColumnIndexOrThrow(_cursor, "nombreProd");
          final int _cursorIndexOfPrecio = CursorUtil.getColumnIndexOrThrow(_cursor, "precioProd");
          final int _cursorIndexOfExistencia = CursorUtil.getColumnIndexOrThrow(_cursor, "existProd");
          final EntityProducto _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpNombre;
            if (_cursor.isNull(_cursorIndexOfNombre)) {
              _tmpNombre = null;
            } else {
              _tmpNombre = _cursor.getString(_cursorIndexOfNombre);
            }
            final double _tmpPrecio;
            _tmpPrecio = _cursor.getDouble(_cursorIndexOfPrecio);
            final int _tmpExistencia;
            _tmpExistencia = _cursor.getInt(_cursorIndexOfExistencia);
            _result = new EntityProducto(_tmpId,_tmpNombre,_tmpPrecio,_tmpExistencia);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
