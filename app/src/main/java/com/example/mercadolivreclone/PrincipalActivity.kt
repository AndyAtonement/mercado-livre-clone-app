package com.example.mercadolivreclone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Slide
import android.view.View
import com.denzcoskun.imageslider.ImageSlider
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel

class PrincipalActivity : AppCompatActivity() {

    lateinit var slider: ImageSlider

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        inicializarSlider()
    }

    fun deslogar(view: View){
        val autenticacao = Firebase.auth
        autenticacao.signOut()
        finish()
        startActivity(
            Intent(
                this,
                MainActivity::class.java
            )
        )
    }

    fun inicializarSlider(){
        slider = findViewById(R.id.image_slider)
        val listaImagens = ArrayList<SlideModel>() // Create image list

        listaImagens.add(SlideModel(R.drawable.promocao01, ScaleTypes.CENTER_CROP))
        listaImagens.add(SlideModel(R.drawable.promocao02, ScaleTypes.CENTER_CROP))
        listaImagens.add(SlideModel(R.drawable.promocao03, ScaleTypes.CENTER_CROP))
        listaImagens.add(SlideModel(R.drawable.promocao04, ScaleTypes.CENTER_CROP))
        listaImagens.add(SlideModel(R.drawable.promocao05, ScaleTypes.CENTER_CROP))
        listaImagens.add(SlideModel(R.drawable.promocao06, ScaleTypes.CENTER_CROP))

        slider.setImageList(listaImagens)
    }
}