package com.example.myangieapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast

class ImageBackgroundActivity : AppCompatActivity() {
    lateinit var number1: EditText
    lateinit var number2: EditText
    lateinit var Image: ImageButton
    lateinit var subtraction: ImageButton
    lateinit var division: ImageButton
    lateinit var multipication: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_background)

        number1 = findViewById(R.id.editText1)
        number2 = findViewById(R.id.editText2)
        Image = findViewById(R.id.imgbtn1)

        Image.setOnClickListener {
            if (number1.text.toString().isEmpty() || number2.text.toString().isEmpty()) {
                Toast.makeText(applicationContext, "Enter both numbers", Toast.LENGTH_LONG).show()
            } else {
                var num1 = Integer.parseInt(number1.text.toString())
                var num2 = Integer.parseInt(number2.text.toString())
                Toast.makeText(applicationContext, "The sum is" + (num1 + num2), Toast.LENGTH_LONG)
                    .show()
            }
        }

        subtraction = findViewById(R.id.imgbtn2)

        subtraction.setOnClickListener {
            if (number1.text.toString().isEmpty() || number2.text.toString().isEmpty()) {
                Toast.makeText(applicationContext, "Enter both numbers", Toast.LENGTH_LONG).show()

            } else {
                var num1 = Integer.parseInt(number1.text.toString())
                var num2 = Integer.parseInt(number2.text.toString())
                Toast.makeText(applicationContext, "The subtraction is" + (num1 - num2), Toast.LENGTH_LONG)
                    .show()

            }


        }
        division = findViewById(R.id.imgbtn3)

        division.setOnClickListener {
            if (number1.text.toString().isEmpty() || number2.text.toString().isEmpty()) {
                Toast.makeText(applicationContext, "Enter both numbers", Toast.LENGTH_LONG).show()
            } else {
                var num1 = Integer.parseInt(number1.text.toString())
                var num2 = Integer.parseInt(number2.text.toString())
                Toast.makeText(applicationContext, "The division is" + (num1 / num2), Toast.LENGTH_LONG)
                    .show()
            }
        }

        multipication=findViewById(R.id.imgbtn4)

        multipication.setOnClickListener {
            if (number1.text.toString().isEmpty() || number2.text.toString().isEmpty()) {
                Toast.makeText(applicationContext, "Enter both numbers", Toast.LENGTH_LONG).show()
            }
            else {
                var num1 = Integer.parseInt(number1.text.toString())
                var num2 = Integer.parseInt(number2.text.toString())
                Toast.makeText(applicationContext, "The multiplication is" + (num1 * num2), Toast.LENGTH_LONG)
                    .show()
            }
        }
    }
}