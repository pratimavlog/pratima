package com.example.themesetting

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.themesetting.databinding.ActivityBmicalculatorBinding
import kotlin.math.pow

class bmicalculator : AppCompatActivity() {
    private lateinit var binding:ActivityBmicalculatorBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityBmicalculatorBinding.inflate(layoutInflater
        )
        setContentView(binding.root)


        binding.calculatebutton.setOnClickListener {
            calculate()


        }



    }
    fun calculate()
    {
        var weight= binding.weighted.text.toString().toFloat()
        var height=binding.heighted.text.toString().toFloat()

        if(weight != null && height != null)
        {
            var bmi=weight/(height/100).pow(2)
            var bmiresult=String.format("%.2f",bmi)

            val bmicategory =when {
                bmi < 18.5 -> "Underweight"
                bmi < 25 -> "Normal Weight"
                bmi < 30  -> "Overweight"
                else -> "obseses"

            }
            binding.resulttextview.text="BMI: $bmiresult\nCategory: $bmicategory"

        }
        else{
            binding.resulttextview.text="Invalid Input"
        }


    }
}