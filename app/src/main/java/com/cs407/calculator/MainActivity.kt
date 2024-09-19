package com.cs407.calculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
//import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val num_one = findViewById<EditText>(R.id.first)
        val num_two = findViewById<EditText>(R.id.second)


        val additionButton = findViewById<Button>(R.id.button)
        val subtractButton = findViewById<Button>(R.id.button2)
        val multiplyButton = findViewById<Button>(R.id.button3)
        val divideButton = findViewById<Button>(R.id.button4)




        additionButton.setOnClickListener {
            if (num_one.text.isNotEmpty() && num_two.text.isNotEmpty()) {
                val number1 = num_one.text.toString().toFloat()
                val number2 = num_two.text.toString().toFloat()
                val solution = number1 + number2


                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("EXTRA_RESULT", solution)
                startActivity(intent)


            } else {
                Toast.makeText(this, "Please enter both numbers", Toast.LENGTH_SHORT).show()
            }
        }




        subtractButton.setOnClickListener {
            if (num_one.text.isNotEmpty() && num_two.text.isNotEmpty()) {
                val number1 = num_one.text.toString().toFloat()
                val number2 = num_two.text.toString().toFloat()
                val solution = number1 - number2


                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("EXTRA_RESULT", solution)
                startActivity(intent)


            } else {
                Toast.makeText(this, "Please enter both numbers", Toast.LENGTH_SHORT).show()
            }
        }


        multiplyButton.setOnClickListener {
            if (num_one.text.isNotEmpty() && num_two.text.isNotEmpty()) {
                val number1 = num_one.text.toString().toFloat()
                val number2 = num_two.text.toString().toFloat()
                val solution = number1 * number2


                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("EXTRA_RESULT", solution)
                startActivity(intent)


            } else {
                Toast.makeText(this, "Please enter both numbers", Toast.LENGTH_SHORT).show()
            }
        }




        divideButton.setOnClickListener {
            if (num_one.text.isNotEmpty() && num_two.text.isNotEmpty()) {
                val number1 = num_one.text.toString().toFloat()
                val number2 = num_two.text.toString().toFloat()


                if (number2 == 0f) {
                    Toast.makeText(this, "Cannot divide by zero", Toast.LENGTH_SHORT).show()
                } else {
                    val solution = number1 / number2

                    val intent = Intent(this, ResultActivity::class.java)
                    intent.putExtra("EXTRA_RESULT", solution)
                    startActivity(intent)
                }
            }else{
                Toast.makeText(this, "Please enter both numbers", Toast.LENGTH_SHORT).show()
            }


        }
    }
}
