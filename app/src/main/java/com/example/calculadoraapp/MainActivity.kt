package com.example.calculadoraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun adicao(view:View){
        var num1 = findViewById<EditText>(R.id.numero1).text.toString().toInt()
        var num2 = findViewById<EditText>(R.id.numero2).text.toString().toInt()
        var adicao = num1 + num2

        findViewById<EditText>(R.id.resultado).setText("" + adicao)
    }

    fun subtracao(view:View){
        var num1 = findViewById<EditText>(R.id.numero1).text.toString().toInt()
        var num2 = findViewById<EditText>(R.id.numero2).text.toString().toInt()
        var subtracao = num1 - num2

        findViewById<EditText>(R.id.resultado).setText("" + subtracao)
    }

    fun multiplicacao(view:View){
        var num1 = findViewById<EditText>(R.id.numero1).text.toString().toInt()
        var num2 = findViewById<EditText>(R.id.numero2).text.toString().toInt()
        var multiplicacao = num1 * num2

        findViewById<EditText>(R.id.resultado).setText("" + multiplicacao)
    }

    fun divisao(view:View){
        var num1 = findViewById<EditText>(R.id.numero1).text.toString().toInt()
        var num2 = findViewById<EditText>(R.id.numero2).text.toString().toInt()
        var divisao = num1 / num2

        findViewById<EditText>(R.id.resultado).setText("" + divisao)
    }
}