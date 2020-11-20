package com.example.eventoclickkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.logging.Level

class MainActivity : AppCompatActivity(){


    var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.setText(contador.toString())

        buttonContadorUp.setOnClickListener { view ->
            contador++
          //  Toast.makeText(this,"Contador:  $contador", Toast.LENGTH_SHORT).show()
            textView.setText(contador.toString())
        }

        buttonContadorDown.setOnClickListener  {view ->

            contador--
            textView.setText(contador.toString())
        }

    }




}
