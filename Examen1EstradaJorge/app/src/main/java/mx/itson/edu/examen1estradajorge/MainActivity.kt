package mx.itson.edu.examen1estradajorge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn10: Button = findViewById(R.id.btn10)
        val btn20: Button = findViewById(R.id.btn20)
        val btn30: Button = findViewById(R.id.btn30)
        val btn40: Button = findViewById(R.id.btn40)
        val btn50: Button = findViewById(R.id.btn50)
        val btn60: Button = findViewById(R.id.btn60)
        val btnDescuento: Button = findViewById(R.id.btnDescuento)
        val btnPropina: Button = findViewById(R.id.btnPropina)
        val precioOriginal: TextView = findViewById(R.id.precioOriginal)
        val txtDescuento: TextView = findViewById(R.id.txtDescuento)
        val txtTotal: TextView = findViewById(R.id.txtTotal)

        var porcentaje:Double = 0.0

        //val precioNuevo:Double = precioOriginal.text.toString().toDouble()


        if(precioOriginal.text == ""){
            precioOriginal.setText("Ingresar Cantidad")
        }

        btn10.setOnClickListener {
            porcentaje = 0.10
        }

        btn20.setOnClickListener {
            porcentaje = 0.20
        }

        btn30.setOnClickListener {
            porcentaje = 0.30
        }

        btn40.setOnClickListener {
            porcentaje = 0.40
        }

        btn50.setOnClickListener {
            porcentaje = 0.50
        }

        btn60.setOnClickListener {
            porcentaje = 0.60
        }

        btnDescuento.setOnClickListener {
            if(precioOriginal.text.toString() == ""){
                precioOriginal.setHint("Ingresar Cantidad Porfavor")
            }else{
                var descuentoAplicado = porcentaje * precioOriginal.text.toString().toDouble()
                txtDescuento.setText(descuentoAplicado.toString())

                var precioNuevo = aplicarDescuento(precioOriginal.text.toString().toDouble(), porcentaje)
                txtTotal.setText(precioNuevo.toString())
            }

        }

        btnPropina.setOnClickListener {

            if(precioOriginal.text.toString() == ""){
                precioOriginal.setHint("Ingresar Cantidad Porfavor")

            }else{
                var porcentajeAplicado = porcentaje * precioOriginal.text.toString().toDouble()
                txtDescuento.setText(porcentajeAplicado.toString())

                var precioNuevoAplicado = aplicarPropina(precioOriginal.text.toString().toDouble(), porcentaje)
                txtTotal.setText(precioNuevoAplicado.toString())
            }
        }
    }

    fun aplicarDescuento(cantidad:Double, descuento:Double):Double{
        val precioNuevo = cantidad - (cantidad * descuento)
        return precioNuevo
    }

    fun aplicarPropina(cantidad:Double, porcentaje:Double):Double{
        var propina = cantidad * porcentaje
        val precioNuevoAplicado = cantidad + propina
        return precioNuevoAplicado
    }

}