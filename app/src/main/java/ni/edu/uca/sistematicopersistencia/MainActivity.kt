package ni.edu.uca.sistematicopersistencia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.core.content.ContentProviderCompat.requireContext
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import ni.edu.uca.sistematicopersistencia.data.database.dao.ProductoDao
import ni.edu.uca.sistematicopersistencia.data.database.entities.EntityProducto
import ni.edu.uca.sistematicopersistencia.data.database.entities.ProductoViewModel
import ni.edu.uca.sistematicopersistencia.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val productoViewModel: ProductoViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        insertar()


    }

    fun insertar() {
        binding.btnGuardar.setOnClickListener {
            try {
                var nombre = binding.etNombre.text.toString()
                var precio = binding.etPrecio.text.toString().toDouble()
                var existencia = binding.etCantidadExist.text.toString().toInt()


                val producto = EntityProducto(
                    nombre = nombre,
                    precio = precio,
                    existencia = existencia
                )

                // Insertar usuario en la base de datos
                CoroutineScope(Dispatchers.IO).launch {
                    productoViewModel.inserProd(producto)

                }


                // Mostrar mensaje de éxito
                Toast.makeText(
                    this,
                    "Producto registrado exitosamente",
                    Toast.LENGTH_SHORT
                ).show()

            } catch (ex: Exception) {
                Toast.makeText(
                    this, "Error al Insertar: ${ex.toString()}",
                    Toast.LENGTH_LONG
                ).show()
            }

        }
    }
}