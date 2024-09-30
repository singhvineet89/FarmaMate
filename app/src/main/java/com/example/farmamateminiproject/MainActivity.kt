package com.example.farmamateminiproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private fun mainpage(){
        val newactivity=Intent( this,MainActivity2::class.java)
        startActivity(newactivity)
    }
    private fun aboutus(){
        val newactivity2=Intent(this,aboutus::class.java)
        startActivity(newactivity2)
    }
    private fun links(){
        val newactivity3=Intent(this,links::class.java)
        startActivity(newactivity3)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button1=findViewById<Button>(R.id.mainbutton)
        button1.setOnClickListener {
            mainpage() }
        val button2=findViewById<Button>(R.id.aboutus)
        button2.setOnClickListener{
            aboutus()
        }
        val button3=findViewById<Button>(R.id.links)
        button3.setOnClickListener{
            links()
        }

    }
}