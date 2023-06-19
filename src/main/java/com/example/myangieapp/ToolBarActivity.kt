package com.example.myangieapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ToolBarActivity : AppCompatActivity() {
    lateinit var tool:TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tool_bar)

        tool=findViewById(R.id.Home)

        tool.setOnClickListener {
            val bar=Intent(this,HomePageActivity::class.java)
            startActivity(bar)

        }
    }
}