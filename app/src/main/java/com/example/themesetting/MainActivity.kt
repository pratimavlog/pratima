package com.example.themesetting

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.themesetting.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.clickme.setOnClickListener {
            Log.i("Textid","Hello Pratima")
            TotoastMessage("button clicked")
        }

        binding.button2.setOnClickListener {
            Toast.makeText(this,"Second button clikced", Toast.LENGTH_LONG).show()

            var name: String=binding.utusermessage.text.toString()

            var i=Intent(this,SecondActivity::class.java)
            i.putExtra("User_name",name)
            startActivity(i)



        }

        binding.recyclerviewbutton.setOnClickListener {
            var i=Intent(this,recycleviewdomeactivity::class.java)
            startActivity(i)
        }

        binding.bmibutton.setOnClickListener {
            var i=Intent(this,bmicalculator::class.java)
            startActivity(i)
        }
        binding.quizapp.setOnClickListener {
            var i=Intent(this,quizapp::class.java)
            startActivity(i)
        }

        binding.anotherquizapp.setOnClickListener {
            var i=Intent(this,secquizapp::class.java)
            startActivity(i)
        }

    }
}