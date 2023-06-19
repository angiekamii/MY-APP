package com.example.myangieapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class ListActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        var names= arrayOf("Angie","Mukami","Njagi","Joan","Angie","Mukami","Njagi","Joan","Angie","Mukami","Njagi","Joan","Angie","Mukami","Njagi","Joan","Angie","Mukami","Njagi","Joan","Angie","Mukami","Njagi","Joan","Angie","Mukami","Njagi","Joan","Angie","Mukami","Njagi","Joan","Angie","Mukami","Njagi","Joan","Angie","Mukami","Njagi","Joan","Angie","Mukami","Njagi","Joan")

        var myadapter=ArrayAdapter(this,R.layout.list_item,names)

        var mylist:ListView=findViewById(R.id.list)

        mylist.setAdapter(myadapter)


    }
}