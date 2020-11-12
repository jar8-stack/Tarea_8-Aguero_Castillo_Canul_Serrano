package com.example.tarea_8_aguero_castillo_canul_serrano

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tarea_8_aguero_castillo_canul_serrano.adapters.AlphaAdapters
import com.basic.programming.mygridlayoutapp.model.CharItem

class gridActivity : AppCompatActivity() {
    private var recyclerView: RecyclerView? = null
    private var charItem: ArrayList<CharItem>? = null
    private var gridLayoutManager: GridLayoutManager? = null
    private var alphaAdapters: AlphaAdapters? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reci)

        recyclerView = findViewById(R.id.recycler_view_item)
        gridLayoutManager =
                GridLayoutManager(applicationContext, 3, LinearLayoutManager.VERTICAL, false)
        recyclerView?.layoutManager = gridLayoutManager
        recyclerView?.setHasFixedSize(true)

        charItem = ArrayList()
        charItem = setAlphas()
        alphaAdapters = AlphaAdapters(applicationContext, charItem!!)
        recyclerView?.adapter = alphaAdapters

    }

    private fun setAlphas(): ArrayList<CharItem> {

        var arrayList: ArrayList<CharItem> = ArrayList()

        arrayList.add(CharItem(R.drawable.violin, "violin"))
        arrayList.add(CharItem(R.drawable.violin, "violin"))
        arrayList.add(CharItem(R.drawable.violin, "violin"))
        arrayList.add(CharItem(R.drawable.trompeta, "trompeta"))
        arrayList.add(CharItem(R.drawable.trompeta, "trompeta"))
        arrayList.add(CharItem(R.drawable.trompeta, "trompeta"))
        arrayList.add(CharItem(R.drawable.violin, "violin"))
        arrayList.add(CharItem(R.drawable.violin, "violin"))
        arrayList.add(CharItem(R.drawable.violin, "violin"))


        return arrayList
    }
}