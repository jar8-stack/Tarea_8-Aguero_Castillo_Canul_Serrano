package com.example.tarea_8_aguero_castillo_canul_serrano

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.core.view.isGone
import com.bumptech.glide.Glide

class relativeActivity : AppCompatActivity() {

    private lateinit var monedaTres: ImageView
    private lateinit var reyBastos: ImageView
    private lateinit var caballoEspadas: ImageView
    private lateinit var diezCopas: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative)

        monedaTres= findViewById(R.id.moneda_3)
        reyBastos= findViewById(R.id.rey_bastos)
        caballoEspadas= findViewById(R.id.caballo_espadas)
        diezCopas= findViewById(R.id.diez_copas)

        Glide.with(this).load("https://media.istockphoto.com/photos/this-is-the-three-of-oros-from-a-pack-of-moroccan-spanish-playing-picture-id530003571").into(monedaTres)
        Glide.with(this).load("https://3.bp.blogspot.com/-KzRfGRr6j7A/WPnzh3TwO5I/AAAAAAAAANw/3E_nGl-FA5coBbVbmyi1vXkx_p2A0TJiwCLcB/s1600/12b_.jpg").into(reyBastos)
        Glide.with(this).load("https://4.bp.blogspot.com/-ne9BE3-EWR4/WfyORhDHQpI/AAAAAAAAAUs/4bGm2SniFBcW_4yKn-ZfuYVVol4e_xBcgCLcBGAs/s400/11e_.jpg").into(caballoEspadas)
        Glide.with(this).load("https://1.bp.blogspot.com/-eGpkyFhJbNk/Wmrh_zfCqcI/AAAAAAAAAdQ/CX3l8AlE-5wG04VM6rvHQ0NWa2Keuy05wCLcBGAs/s400/10c_.jpg").into(diezCopas)

        diezCopas.setOnClickListener{view: View ->
            diezCopas.visibility= View.GONE
        }

        caballoEspadas.setOnClickListener{view: View ->
            caballoEspadas.visibility= View.GONE
        }

        reyBastos.setOnClickListener{view: View ->
            reyBastos.visibility= View.GONE
        }

        monedaTres.setOnClickListener{view: View ->
            monedaTres.visibility= View.GONE
        }

    }
}