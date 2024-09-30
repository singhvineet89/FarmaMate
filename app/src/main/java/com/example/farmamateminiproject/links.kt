package com.example.farmamateminiproject

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class links : AppCompatActivity() {
    private fun openUrl(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_links)
        val govschemes=findViewById<Button>(R.id.govschemes)
        val loan=findViewById<Button>(R.id.loanassistance)
        val ngo=findViewById<Button>(R.id.ngos)
        val forums=findViewById<Button>(R.id.forums)
        val weather=findViewById<Button>(R.id.weather)
        val market=findViewById<Button>(R.id.marketenam)
        val insta=findViewById<ImageView>(R.id.instagram)
        val twitter=findViewById<ImageView>(R.id.twitter)
        val facebook=findViewById<ImageView>(R.id.fb)


        govschemes.setOnClickListener{
            openUrl("https://agriwelfare.gov.in/en/Major")
        }
        loan.setOnClickListener{
            openUrl("https://www.bankbazaar.com/home-loan/types-of-agricultural-loans-in-india.html#:~:text=Applying%20for%20the%20Kisan%20Credit,for%20amounts%20up%20to%20Rs.")
        }
        ngo.setOnClickListener{
            openUrl("https://give.do/blog/10-ngos-empowering-indian-farmers-to-grow-and-sustain/")
        }
        forums.setOnClickListener{
            openUrl("https://bks.org.in/")
        }
        weather.setOnClickListener{
            openUrl("https://enam.gov.in/web/weather_forecast")
        }
        market.setOnClickListener{
            openUrl("https://www.enam.gov.in/web/")
        }
        insta.setOnClickListener{
            openUrl("https://www.instagram.com/theflamesofdark/?utm_source=qr&igsh=aDlmcjRjeHE2YXkw")
        }
        twitter.setOnClickListener{
            openUrl("https://twitter.com/vineetwrites1")
        }
        facebook.setOnClickListener{
            openUrl("https://www.facebook.com/")
        }


    }
}