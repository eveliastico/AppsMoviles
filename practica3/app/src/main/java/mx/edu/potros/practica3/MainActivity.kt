package mx.edu.potros.practica3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    var minValue=0
    var maxValue=100
    var num:Int=0
    var won=false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val guessings: TextView = findViewById(R.id.textView3)
        val down: Button = findViewById(R.id.buttonDown)
        val up: Button = findViewById(R.id.buttonUp)
        val generate: Button = findViewById(R.id.buttonGenerate)
        val guessed: Button = findViewById(R.id.buttonGuessed)

        generate.setOnClickListener{
            num= Random.nextInt(minValue,maxValue)
            guessings.setText(num.toString())
            generate.visibility= View.INVISIBLE
            guessed.visibility=View.VISIBLE
        }

        up.setOnClickListener{
            minValue=num
            if(checkingLimits()){
                num= Random.nextInt(minValue,maxValue)
                guessings.setText(num.toString())
            }else {
                guessings.setText("No puede ser;( me ganaste)")
            }
        }

        down.setOnClickListener{
            maxValue=num
            if(checkingLimits()){
                num= Random.nextInt(minValue,maxValue)
                guessings.setText(num.toString())
            }else {
                guessings.setText(num.toString())
            }
        }

        guessed.setOnClickListener{
            if(!won){
                guessed.setText("Adivine, tu numero es el "+num)
                guessed.setText("Voolver a ")
                won=true
            }else {
                generate.visibility=View.VISIBLE
                generate.setText("Tap on generate to start")
                guessed.visibility=View.GONE
                resetValues()
            }
        }



    }

    fun resetValues(){
        minValue=0
        maxValue=100
        num=0
        won=false
    }

    fun checkingLimits():Boolean{
        return minValue!=maxValue
    }

}