package com.example.myangieapp

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import kotlinx.coroutines.NonCancellable

class DashboardActivity : AppCompatActivity() {
    lateinit var home:CardView
    lateinit var profile:CardView
    lateinit var chat:CardView
    lateinit var widget:CardView
    lateinit var settings:CardView
    lateinit var logout:CardView
    lateinit var tool:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        home=findViewById(R.id.cardHome)

        home.setOnClickListener {
            Toast.makeText(applicationContext,"You have entered home successfully",Toast.LENGTH_LONG).show()
            val intent= Intent(this,HomePageActivity::class.java)
            startActivity(intent)

        }
        profile=findViewById(R.id.cardProfile)

        profile.setOnClickListener {
            Toast.makeText(applicationContext,"My Profile",Toast.LENGTH_LONG).show()
            val intent= Intent(this,ListActivity::class.java)
            startActivity(intent)
        }

        chat=findViewById(R.id.cardChat)

        chat.setOnClickListener {
            Toast.makeText(applicationContext,"Let's chat",Toast.LENGTH_LONG).show()
            val intent= Intent(this,MapsActivity::class.java)
            startActivity(intent)
        }
        widget=findViewById(R.id.cardwidget)

        widget.setOnClickListener {
            Toast.makeText(applicationContext,"My Widgets",Toast.LENGTH_LONG).show()
            val intent= Intent(this,WidgetsActivity::class.java)
            startActivity(intent)
        }

        settings=findViewById(R.id.cardsettings)

        settings.setOnClickListener {
            Toast.makeText(applicationContext,"Settings",Toast.LENGTH_LONG).show()
            val intent= Intent(this,FragmentActivity::class.java)  
            startActivity(intent)

        }

        logout=findViewById(R.id.cardlogout)



        logout.setOnClickListener {
                val box= AlertDialog.Builder(this)
                box.setMessage("Do you want to close this application")
                box.setPositiveButton("proceed", DialogInterface.OnClickListener { dialog, id ->finish()  })
                box.setNegativeButton("cancel", DialogInterface.OnClickListener { dialog, id -> NonCancellable.cancel() })

                val alert=box.create()
                alert.setTitle("SOLANGE")
                alert.show()
                Toast.makeText(applicationContext,"Login out ",Toast.LENGTH_LONG).show()

        }
        tool=findViewById(R.id.Home)

        tool.setOnClickListener {
            val bar=Intent(this,HomePageActivity::class.java)
            startActivity(bar)

        }

        }


    }
