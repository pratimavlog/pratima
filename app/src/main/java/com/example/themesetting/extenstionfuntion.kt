package com.example.themesetting

import android.app.Activity
import android.content.Context
import android.os.Message
import android.widget.Toast
import kotlin.time.Duration

fun Context.TotoastMessage(message: String)
{
    Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
}

//context is supercalss of activet

//deefault parameter
//fun Context.TotoastMessage(message: String,duration:Int=Toast.LENGTH_SHORT)
//{
//    Toast.makeText(this,message,duration).show()
//}