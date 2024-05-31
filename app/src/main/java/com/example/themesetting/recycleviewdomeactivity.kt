package com.example.themesetting

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import drawable.Supplier

class recycleviewdomeactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycleviewdomeactivity)

var recyclervw:RecyclerView=findViewById(R.id.recyclervw)
        val layoutManager=LinearLayoutManager(this)
        layoutManager.orientation=LinearLayoutManager.VERTICAL
        recyclervw.layoutManager=layoutManager


        var adaper=adapterclass(this,Supplier.hobbies)
        recyclervw.adapter=adaper





    }
}