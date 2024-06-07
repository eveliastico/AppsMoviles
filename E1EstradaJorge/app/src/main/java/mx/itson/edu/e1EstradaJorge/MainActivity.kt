package mx.itson.edu.e1EstradaJorge

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

        val btnDescuento: Button = findViewById(R.id.btnDiscount)
        val btnPropina: Button = findViewById(R.id.btnTip)

        val precioOriginal: TextView = findViewById(R.id.precioOriginal)

        var estadoDescuento:Boolean = false
        var estadoPropina:Boolean = false

        btnDescuento.setOnClickListener {
            estadoPropina = false
            estadoDescuento = true
        }

        btnPropina.setOnClickListener {
            estadoDescuento = false
            estadoPropina = true
        }

        btn10.setOnClickListener{
            if(precioOriginal.text.toString() == ""){
                precioOriginal.setText("0.0")
            }else{
                var descuento = 0.10
                var precio = precioOriginal.toString().toDouble()

                if(estadoDescuento == true){
                    var nuevoPrecio = aplicarDescuento(precio, descuento)
                    precioOriginal.setText(nuevoPrecio.toString())
                }
                if (estadoPropina == true){
                    var nuevoPrecio = aplicarPropina(precio, descuento)
                    precioOriginal.setText(nuevoPrecio.toString())
                }

            }
        }

        btn20.setOnClickListener{
            if(precioOriginal.text.toString() == ""){
                precioOriginal.setText("0.0")
            }else{
                var descuento = 0.20
                var precio = precioOriginal.toString().toDouble()
                if(estadoDescuento == true){
                    var nuevoPrecio = aplicarDescuento(precio, descuento)
                    precioOriginal.setText(nuevoPrecio.toString())
                }
                if (estadoPropina == true){
                    var nuevoPrecio = aplicarPropina(precio, descuento)
                    precioOriginal.setText(nuevoPrecio.toString())
                }
            }
        }

        btn30.setOnClickListener{
            if(precioOriginal.text.toString() == ""){
                precioOriginal.setText("0.0")
            }else{
                var descuento = 0.30
                var precio = precioOriginal.toString().toDouble()
                if(estadoDescuento == true){
                    var nuevoPrecio = aplicarDescuento(precio, descuento)
                    precioOriginal.setText(nuevoPrecio.toString())
                }
                if (estadoPropina == true){
                    var nuevoPrecio = aplicarPropina(precio, descuento)
                    precioOriginal.setText(nuevoPrecio.toString())
                }
            }
        }

        btn40.setOnClickListener{
            if(precioOriginal.text.toString() == ""){
                precioOriginal.setText("0.0")
            }else{
                var descuento = 0.40
                var precio = precioOriginal.toString().toDouble()
                if(estadoDescuento == true){
                    var nuevoPrecio = aplicarDescuento(precio, descuento)
                    precioOriginal.setText(nuevoPrecio.toString())
                }
                if (estadoPropina == true){
                    var nuevoPrecio = aplicarPropina(precio, descuento)
                    precioOriginal.setText(nuevoPrecio.toString())
                }
            }
        }

        btn50.setOnClickListener{
            if(precioOriginal.text.toString() == ""){
                precioOriginal.setText("0.0")
            }else{
                var descuento = 0.50
                var precio = precioOriginal.toString().toDouble()
                if(estadoDescuento == true){
                    var nuevoPrecio = aplicarDescuento(precio, descuento)
                    precioOriginal.setText(nuevoPrecio.toString())
                }
                if (estadoPropina == true){
                    var nuevoPrecio = aplicarPropina(precio, descuento)
                    precioOriginal.setText(nuevoPrecio.toString())
                }
            }
        }

        btn60.setOnClickListener{
            if(precioOriginal.text.toString() == ""){
                precioOriginal.setText("0.0")
            }else{
                var descuento = 0.60
                var precio = precioOriginal.toString().toDouble()

                if(estadoDescuento == true){
                    var nuevoPrecio = aplicarDescuento(precio, descuento)
                    precioOriginal.setText(nuevoPrecio.toString())
                }
                if (estadoPropina == true){
                    var nuevoPrecio = aplicarPropina(precio, descuento)
                    precioOriginal.setText(nuevoPrecio.toString())
                }

                var nuevoPrecio = aplicarDescuento(precio, descuento)
                precioOriginal.setText(nuevoPrecio.toString())
            }
        }

    }

    fun aplicarDescuento(cantidad:Double, descuento:Double):Double{
            val precioNuevo = cantidad - (cantidad * descuento)
            return precioNuevo
    }

    fun aplicarPropina(cantidad:Double, propina:Double):Double{
        val precioNuevo = cantidad - (cantidad * propina)
        return precioNuevo
    }
}