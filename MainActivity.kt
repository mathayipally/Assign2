package com.example.assigntwo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var buttonStart :Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

// button ID attributes
        buttonStart = findViewById(R.id.btnstart)

//button start functionality
        buttonStart.setOnClickListener {
//intent function to navigate to the next page
            var intent1= Intent(this,FlasQuestions::class.java)

            startActivity(intent1)
        }


        }
    }
