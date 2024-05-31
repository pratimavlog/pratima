package com.example.themesetting

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class scoreactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_scoreactivity)

        var correcttv:TextView=findViewById(R.id.correcttv)
        var wrongtv:TextView= findViewById(R.id.wrongtv)
        val bundle:Bundle?=intent.extras
        val a=bundle?.getInt("Correct").toString()
       val b= bundle?.getInt("Wrong").toString()
        Toast.makeText(this,"a $a",Toast.LENGTH_SHORT).show()
        Toast.makeText(this,"b $b",Toast.LENGTH_SHORT).show()
        correcttv.text=a
        wrongtv.text=b


    }
}