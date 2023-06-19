package com.example.myangieapp

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.coroutines.NonCancellable.cancel

class AlertActivity : AppCompatActivity() {
    lateinit var alert:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert)

        alert=findViewById(R.id.alertbutton)

        alert.setOnClickListener {
            val box=AlertDialog.Builder(this)
            box.setMessage("Do you want to close this application")
            box.setPositiveButton("proceed",DialogInterface.OnClickListener { dialog, id ->finish()  })
            box.setNegativeButton("cancel",DialogInterface.OnClickListener { dialog, id ->cancel()  })

            val alert=box.create()
            alert.setTitle("SOLANGE")
            alert.show()
        }
    }
}