package com.example.themesetting

import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.themesetting.databinding.ActivitySecquizappBinding

class secquizapp : AppCompatActivity() {
    private lateinit var binding:ActivitySecquizappBinding

    private var questions = arrayOf(
        "Q.1. If a computer has more than one processor then it is known as?",
        "Q.2. Full form of URL is?",
        "Q.3. One kilobyte (KB) is equal to",
        "Q.4. Father of ‘C’ programming language?",
        "Q.5. SMPS stands for",
        "Q.6. What is a floppy disk used for",
        "Q.7. Which operating system is developed and used by Apple Inc?",
        "Q.8. Random Access Memory (RAM) is which storage of device?",
        "Q.9. Who is the founder of the Internet?",
        "Q.10. Which one is the first search engine in internet?")
    private var answer = arrayOf(
        "Multiprocessor",
        "Uniform Resource Locator",
        "1,024 bytes",
        "Dennis Ritchie",
        "Switched mode power supply",
        "To store information",
        "iOS",
        "Primay",
        "Tim Berners-Lee",
        "Archie")
    private var options = arrayOf(
        "Uniprocess",
        "Multiprocessor",
        "Multithreaded",
        "Multiprogramming",
        "Uniform Resource Locator",
        "Uniform Resource Linkwrong",
        "Uniform Registered Link",
        "Unified Resource Link",
        "1,000 bits",
        "1,024 bytes",
        "1,024 megabytes",
        "1,024 gigabytes",
        "Dennis Ritchie",
        "Prof Jhon Kemeny",
        "Thomas Kurtz",
        "Bill Gates",
        "Switched mode power supply",
        "Start mode power supply",
        "Store mode power supply",
        "Single mode power supply",
        "To unlock the computer",
        "To store information",
        "To erase the computer screen",
        "To make the printer work",
        "Windows",
        "Android",
        "iOS",
        "UNIX",
        "Primay",
        "Secondary",
        "Teriary",
        "Off line",
        "Vint Cerf",
        "Charles Babbage",
        "Tim Berners-Lee",
        "None of these",
        "Google",
        "Archie",
        "Altavista",
        "WAIS")
    var currentIndex:Int=0
    var score:Int=0
    var wrong:Int=0
    var qindex:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivitySecquizappBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initview()

    }

    private fun initview() {
        binding.questiontab.text = questions[currentIndex]
        binding.radiobutton1.text = options[0]
        binding.radiobutton2.text = options[1]
        binding.radiobutton3.text = options[2]
        binding.radiobutton4.text = options[3]
        currentIndex++


        binding.nextQuestionBtn.setOnClickListener {
            if (binding.radioGroup.checkedRadioButtonId == -1) {
                Toast.makeText(this,"Please select any option",Toast.LENGTH_SHORT).show()

            } else {
                shownextquestion()
            }
        }


    }

    private fun shownextquestion()
    {
        checkAnswer()
        if(qindex < questions.size -1)
        {
            binding.questiontab.text=questions[currentIndex]
        }
        
    }
    private fun checkAnswer()
    {
        val radiobutton=findViewById<RadioButton>(binding.radioGroup.checkedRadioButtonId)
        val button=radiobutton.text.toString()
        Toast.makeText(this,"anser is: $button",Toast.LENGTH_SHORT).show()

        if(button==answer[qindex])
        {
            score++
            correctdailog()
        }
        else{
            wrong++
            wrongdailog()
        }
    }

    private fun correctdailog()
    {


    }
    private fun wrongdailog()
    {

    }
}
