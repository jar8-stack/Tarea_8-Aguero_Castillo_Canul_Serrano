package com.example.tarea_8_aguero_castillo_canul_serrano

import android.R.attr
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.basic.programming.mygridlayoutapp.model.CharItem
import com.example.tarea_8_aguero_castillo_canul_serrano.adapters.AlphaAdapters
import kotlin.random.Random


class gridActivity : AppCompatActivity() {
    private var recyclerView: RecyclerView? = null
    private var charItem: ArrayList<CharItem>? = null
    private var gridLayoutManager: GridLayoutManager? = null
    private var alphaAdapters: AlphaAdapters? = null
    private var PAQUETE_APP = "com.example.tarea_8_aguero_castillo_canul_serrano"
    private var PAQUETE_SRC = "drawable"

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

        val start = 1
        val end = 26

        var arrayList: ArrayList<CharItem> = ArrayList()

        for (i in 1..12) {

            var vario = rand(start, end)

            val name = "letter_$vario"

            val resource = resources.getIdentifier(name, PAQUETE_SRC,PAQUETE_APP)

            arrayList.add(CharItem(resource, ""+vario))
        }
        return arrayList
    }

    fun rand(start: Int, end: Int): Int {
        require(!(start > end || end - start + 1 > Int.MAX_VALUE)) { "Illegal Argument" }
        return Random(System.nanoTime()).nextInt(end - start + 1) + start
    }
}