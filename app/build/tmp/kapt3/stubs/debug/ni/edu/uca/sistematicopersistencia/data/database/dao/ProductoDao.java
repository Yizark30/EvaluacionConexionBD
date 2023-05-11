package ni.edu.uca.sistematicopersistencia.data.database.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\nH\'J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010\r\u001a\u00020\u000eH\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lni/edu/uca/sistematicopersistencia/data/database/dao/ProductoDao;", "", "actualizarReg", "", "producto", "Lni/edu/uca/sistematicopersistencia/data/database/entities/EntityProducto;", "(Lni/edu/uca/sistematicopersistencia/data/database/entities/EntityProducto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "eliminarReg", "insertarReg", "obtRegistos", "Lkotlinx/coroutines/flow/Flow;", "", "obtRegistro", "id", "", "app_debug"})
public abstract interface ProductoDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM TblProducto")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<ni.edu.uca.sistematicopersistencia.data.database.entities.EntityProducto>> obtRegistos();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM TblProducto WHERE id= :id")
    public abstract kotlinx.coroutines.flow.Flow<ni.edu.uca.sistematicopersistencia.data.database.entities.EntityProducto> obtRegistro(int id);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = 5)
    public abstract java.lang.Object insertarReg(@org.jetbrains.annotations.NotNull()
    ni.edu.uca.sistematicopersistencia.data.database.entities.EntityProducto producto, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Update()
    public abstract java.lang.Object actualizarReg(@org.jetbrains.annotations.NotNull()
    ni.edu.uca.sistematicopersistencia.data.database.entities.EntityProducto producto, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object eliminarReg(@org.jetbrains.annotations.NotNull()
    ni.edu.uca.sistematicopersistencia.data.database.entities.EntityProducto producto, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}