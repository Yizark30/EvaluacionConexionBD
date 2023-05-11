package ni.edu.uca.sistematicopersistencia.data.database.entities

import androidx.lifecycle.ViewModel
import android.app.Application
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import ni.edu.uca.sistematicopersistencia.data.database.BaseDatos
import ni.edu.uca.sistematicopersistencia.data.database.dao.ProductoDao

class ProductoViewModel (application: Application): ViewModel() {

    private val productoDao: ProductoDao

    init {
        val database = BaseDatos.obtBaseDatos(application.applicationContext)
        productoDao = database.productoDao()
    }

    suspend fun inserProd(producto: EntityProducto) = withContext(Dispatchers.IO){
        productoDao.insertarReg(producto)
    }

}