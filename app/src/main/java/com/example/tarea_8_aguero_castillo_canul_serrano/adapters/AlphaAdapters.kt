package com.example.tarea_8_aguero_castillo_canul_serrano.adapters

import android.content.ClipData
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tarea_8_aguero_castillo_canul_serrano.R
import com.example.tarea_8_aguero_castillo_canul_serrano.model.AlphaChar

class AlphaAdapters (var context: Context,var arrayList: ArrayList<AlphaChar>): RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        val itemHolder = LayoutInflater.from(parent.context).inflate(R.layout.grid_layout_list_item,parent,false)
        return ItemHolder(itemHolder)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var alphaChar:AlphaChar = arrayList.get(position)

    }

    override fun getItemCount(): Int {
        return arrayList.size
    }
    class ItemHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        var icons = itemView.findViewById<ImageView>(R.id.icons_image)
        var alphas = itemView.findViewById<TextView>(R.id.alpha_text_view)
    }
}