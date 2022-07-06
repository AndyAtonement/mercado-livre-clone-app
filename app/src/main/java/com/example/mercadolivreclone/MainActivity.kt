package com.example.mercadolivreclone


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()

        val authentication = Firebase.auth
        val ActualUser = authentication.currentUser
        if( ActualUser != null ){
            finish()
            startActivity(
                Intent(
                    this,
                    PrincipalActivity::class.java
                )
            )
        }
    }

    fun toResgister(view: View){
        startActivity(
            Intent(
                this,
                CadastroActivity::class.java
            )
        )
    }

    fun toLogin(view: View){
        startActivity(
            Intent(
                this,
                LoginActivity::class.java
            )
        )
    }
}