package com.example.themesetting

import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.themesetting.databinding.ActivityQuizappBinding

class quizapp : AppCompatActivity() {

    private lateinit var binding: ActivityQuizappBinding
    private val question= arrayOf(
        "What is the built-in database in Androide studio?",
        "What is the full form of APK in androide?",
        "In which year ,first androide was release by google?"
    )
    private val options= arrayOf(arrayOf("MYSQL","SQLITE","FIREBASE"),
        arrayOf("Application programmin Interface","androide Programming Interface","Androide package information"),
        arrayOf("2010","2006","2008")
    )
    private val answer= arrayOf(1,0,2)

    private var currentQuestionInddex=0
    private var score=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityQuizappBinding.inflate(layoutInflater
        )
        setContentView(binding.root)

        displayquestion()
        binding.optionfirst.setOnClickListener {
            checkAnswer(0)
        }
        binding.optionsec.setOnClickListener {
            checkAnswer(1)
        }
        binding.optionthird.setOnClickListener {
            checkAnswer(2)
        }

        binding.resatrtbutton.setOnClickListener {
            restartquiz()

        }

    }

    private fun  correctButtonColor(buttonIndex:Int){
        when(buttonIndex)
        {
            0 -> binding.optionfirst.setBackgroundColor(Color.GREEN)
            1 -> binding.optionsec.setBackgroundColor(Color.GREEN)
            2 -> binding.optionthird.setBackgroundColor(Color.GREEN)

        }
    }

    private fun  wrongButtonColor(buttonIndex:Int){
        when(buttonIndex)
        {
            0 -> binding.optionfirst.setBackgroundColor(Color.RED)
            1 -> binding.optionsec.setBackgroundColor(Color.RED)
            2 -> binding.optionthird.setBackgroundColor(Color.RED)

        }
    }
    private fun  resetButtonColor(){
        binding.optionfirst.setBackgroundColor(Color.WHITE)
        binding.optionsec.setBackgroundColor(Color.WHITE)
        binding.optionthird.setBackgroundColor(Color.WHITE)
    }

    private fun showresult()
    {
        Toast.makeText(this,"Your score: $score out of ${question.size}",Toast.LENGTH_SHORT).show()
        binding.resatrtbutton.isEnabled=true
    }

    private fun displayquestion(){
        binding.questionTextview.text=question[currentQuestionInddex]
        binding.optionfirst.text=options[currentQuestionInddex][0]
        binding.optionsec.text=options[currentQuestionInddex][1]
        binding.optionthird.text=options[currentQuestionInddex][2]
        resetButtonColor()


    }
    private  fun checkAnswer(selectedanswerIndex: Int)
    {
      val corrrectAnswerIndex=answer[currentQuestionInddex]
       // Toast.makeText(this,"Current aswaer= $corrrectAnswerIndex",Toast.LENGTH_LONG).show()
        if(selectedanswerIndex==corrrectAnswerIndex)

        {
          //  Toast.makeText(this,selectedanswerIndex,Toast.LENGTH_SHORT).show()

            score++
            correctButtonColor(selectedanswerIndex)
        }
        else{
            wrongButtonColor(selectedanswerIndex)
            correctButtonColor(currentQuestionInddex)
        }


        if(currentQuestionInddex < question.size-1)
        {
            currentQuestionInddex++
            binding.questionTextview.postDelayed({displayquestion()},1000)
        }
        else
        {
            showresult()
        }

    }

    private fun restartquiz()
    {
        currentQuestionInddex=0
        score=0
        displayquestion()
        binding.resatrtbutton.isEnabled=false
    }
}