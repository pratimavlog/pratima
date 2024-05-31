package com.example.themesetting

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        var tv_seconctivity:TextView=findViewById(R.id.tv_seconctivity)

       var bundle:Bundle?=intent.extras
        var result=bundle!!.getString("User_name")
        result?.let {
            TotoastMessage(it)
        }
        tv_seconctivity.text=result



        var button2:Button=findViewById(R.id.button2)
        button2.setOnClickListener {

            var i= Intent(Intent.ACTION_SEND)
            i.putExtra(Intent.EXTRA_TEXT,result)
            i.type="text/plain"

            startActivity(Intent.createChooser(i,"Share to: "))
        }


    }
}