package ni.edu.uca.sistematicopersistencia.data.database;

import java.lang.System;

@androidx.room.Database(entities = {ni.edu.uca.sistematicopersistencia.data.database.entities.EntityProducto.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lni/edu/uca/sistematicopersistencia/data/database/BaseDatos;", "Landroidx/room/RoomDatabase;", "()V", "productoDao", "Lni/edu/uca/sistematicopersistencia/data/database/dao/ProductoDao;", "Companion", "app_debug"})
public abstract class BaseDatos extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final ni.edu.uca.sistematicopersistencia.data.database.BaseDatos.Companion Companion = null;
    @kotlin.jvm.Volatile()
    private static volatile ni.edu.uca.sistematicopersistencia.data.database.BaseDatos INSTANCE;
    
    public BaseDatos() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract ni.edu.uca.sistematicopersistencia.data.database.dao.ProductoDao productoDao();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lni/edu/uca/sistematicopersistencia/data/database/BaseDatos$Companion;", "", "()V", "INSTANCE", "Lni/edu/uca/sistematicopersistencia/data/database/BaseDatos;", "obtBaseDatos", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ni.edu.uca.sistematicopersistencia.data.database.BaseDatos obtBaseDatos(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}