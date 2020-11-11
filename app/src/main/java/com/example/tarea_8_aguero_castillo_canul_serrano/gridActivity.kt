package com.example.tarea_8_aguero_castillo_canul_serrano

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tarea_8_aguero_castillo_canul_serrano.adapters.AlphaAdapters
import com.example.tarea_8_aguero_castillo_canul_serrano.model.AlphaChar

class gridActivity : AppCompatActivity() {
    private var recyclerView:RecyclerView ?=null
    private var gridLayoutManager:GridLayoutManager ?=null
    private var arrayList:ArrayList<AlphaChar> ?= null
    private var alphaAdapters:AlphaAdapters ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid)

        recyclerView = findViewById(R.id.my_recycler_view)
        gridLayoutManager = GridLayoutManager(applicationContext,3,GridLayoutManager.VERTICAL,false)
        recyclerView?.layoutManager = gridLayoutManager
        recyclerView?.setHasFixedSize(true)
        arrayList = ArrayList()
        arrayList = setDataInList()
        alphaAdapters = AlphaAdapters(applicationContext,arrayList!!)
        recyclerView?.adapter = alphaAdapters

    }
    private fun setDataInList():ArrayList<AlphaChar>{
        var items:ArrayList<AlphaChar> = ArrayList()

        items.add(AlphaChar(R.drawable.violin,"Char Violin"))
        items.add(AlphaChar(R.drawable.violin,"Char Violin"))
        items.add(AlphaChar(R.drawable.violin,"Char Violin"))
        items.add(AlphaChar(R.drawable.violin,"Char Violin"))
        items.add(AlphaChar(R.drawable.violin,"Char Violin"))
        items.add(AlphaChar(R.drawable.violin,"Char Violin"))


        return items
    }
}