package com.losPro.aplicaciondearranque

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.losPro.aplicaciondearranque.dominio.data.User

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    object CurrentUser {
        var currentUser : User? = null
    }

}