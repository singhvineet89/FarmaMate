package com.example.farmamateminiproject

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class aboutus : AppCompatActivity() {
    private fun openUrl(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aboutus)
        val link=findViewById<ImageView>(R.id.whatsappcommunity)

        link.setOnClickListener{
            openUrl("https://chat.whatsapp.com/GW2Rf3JHoDnBF8GmE4Yyms")
        }
    }
}