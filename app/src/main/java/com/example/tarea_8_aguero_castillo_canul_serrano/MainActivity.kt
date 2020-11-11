package com.example.tarea_8_aguero_castillo_canul_serrano

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var relativeButton: Button
    private lateinit var gridButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        relativeButton= findViewById(R.id.relativeBtn)
        gridButton= findViewById(R.id.gridBtn)

        relativeButton.setOnClickListener{view: View ->
            val intent:Intent = Intent(this, relativeActivity::class.java)
            startActivity(intent)
        }
        gridButton.setOnClickListener{view: View ->
            val intent:Intent = Intent(this, gridActivity::class.java)
            startActivity(intent)
        }

    }
}