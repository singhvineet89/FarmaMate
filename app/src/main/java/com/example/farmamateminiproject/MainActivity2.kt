package com.example.farmamateminiproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity2 : AppCompatActivity() {

    private fun seedsourcing(){
        val newactivity=Intent(this,seedsourcing::class.java)
        startActivity(newactivity)
    }
    private fun marketaccess(){
        val newactivity=Intent(this,marketaccess::class.java)
        startActivity(newactivity)
    }
    private fun cropselection(){
        val newactivity=Intent(this,cropselection::class.java)
        startActivity(newactivity)
    }
    private fun cropdiseases(){
        val newactivity=Intent(this,cropdiseases::class.java)
        startActivity(newactivity)
    }
    private fun irrigation(){
        val newactivity=Intent(this,irrigation::class.java)
        startActivity(newactivity)
    }
    private fun innovation(){
        val newactivity=Intent(this,innovation::class.java)
        startActivity(newactivity)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val button1=findViewById<ImageButton>(R.id.seedsourcing)
        button1.setOnClickListener {
            seedsourcing() }
        val button2=findViewById<ImageButton>(R.id.marketaccess)
        button2.setOnClickListener {
            marketaccess() }
        val button3=findViewById<ImageButton>(R.id.cropselection)
        button3.setOnClickListener {
            cropselection() }
        val button4=findViewById<ImageButton>(R.id.diseases)
        button4.setOnClickListener {
            cropdiseases() }
        val button5=findViewById<ImageButton>(R.id.irrigation)
        button5.setOnClickListener {
            irrigation() }
        val button6=findViewById<ImageButton>(R.id.innovation)
        button6.setOnClickListener {
            innovation() }
    }
}