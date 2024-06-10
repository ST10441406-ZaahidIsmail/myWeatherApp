package com.example.myweatherapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class Splash_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash_screen)

        val startButton: Button = findViewById(R.id.startBtn)  //Declaring variables
        val exitButton: Button = findViewById(R.id.exitBtn)

        startButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)                    //intent is used to moved onto next screenn when start button is pressed
            finish()
        }

        exitButton.setOnClickListener {  //exit button used to quit the app
            finish()


        }
    }
}