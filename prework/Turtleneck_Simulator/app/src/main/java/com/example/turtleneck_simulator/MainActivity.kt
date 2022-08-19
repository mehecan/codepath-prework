package com.example.turtleneck_simulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import org.w3c.dom.Text


//This Kotlin file is where we're going to be handling user interaction
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button).setOnClickListener{
            //Handles button tap for text color
            Log.i("Osvaldo","Tapped on button")
            findViewById<TextView>(R.id.textView).setTextColor( getResources().getColor(R.color.funkyPop))
        }
        findViewById<Button>(R.id.button2).setOnClickListener{
            //Handles button tap for background color
            Log.i("Osvaldo","Tapped on button 2")
            findViewById<ConstraintLayout>(R.id.backgroundView).setBackgroundColor(getResources().getColor(R.color.white))
        }


    }
}