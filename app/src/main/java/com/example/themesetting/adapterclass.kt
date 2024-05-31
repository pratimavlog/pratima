package com.example.themesetting

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import drawable.modeldata

class adapterclass(val context: Context,val hobbies: List<modeldata>): RecyclerView.Adapter<adapterclass.MyViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val view=LayoutInflater.from(parent.context).inflate(R.layout.list_layout,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return hobbies.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val hobby=hobbies[position]
        holder.setdata(hobby,position)

    }




    class MyViewHolder (itemView: View):RecyclerView.ViewHolder(itemView)

    {
        var image_view:ImageView=itemView.findViewById(R.id.image_view)
        var currenthobby:modeldata? =null
        var currentpos:Int=0
        init {
            itemView.setOnClickListener {
              //  TotoastMessage(currenthobby!!.titile)


            }
            image_view.setOnClickListener{
                val message:String="i have clicked "+currenthobby!!.titile

                var i=Intent(Intent.ACTION_SEND)
                i.putExtra(Intent.EXTRA_TEXT,message)
                i.type="text/plain"
                itemView.context.startActivity(Intent.createChooser(i,"Choose App"))

            }
        }

    fun setdata(hobby: modeldata, position: Int) {


        var text_view: TextView = itemView.findViewById(R.id.text_view)

        text_view.text= hobby.titile


        this.currenthobby=hobby
        this.currentpos=position


    }

    }

}