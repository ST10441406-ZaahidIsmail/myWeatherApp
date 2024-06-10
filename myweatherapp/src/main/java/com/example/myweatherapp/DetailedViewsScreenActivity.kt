package com.example.myweatherapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class DetailedViewsScreenActivity : AppCompatActivity() {


        private lateinit var weatherDetailsTxt: TextView
        private lateinit var averageTempTxt: TextView
        private lateinit var backButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailed_views_screen)

        weatherDetailsTxt = findViewById(R.id.weatherDetailsTxt)
        averageTempTxt = findViewById(R.id.averageTempTxt)
        backButton = findViewById(R.id.backBtn)

        val days = intent.getStringArrayListExtra("Days") ?: arrayListOf()
        val minTemps= intent.getIntegerArrayListExtra("MinTemps") ?: arrayListOf()
        val maxTemps = intent.getIntegerArrayListExtra("MaxTemps") ?: arrayListOf()
        val weatherNotes = intent.getStringArrayListExtra("WeatherNotes") ?: arrayListOf()

        val weatherDetails = StringBuilder()
        var totalTemp = 0
        for (i in days.indices) {
            weatherDetails.append("${days[i]}: Minimum Temperatures: ${minTemps[i]} celsius, Maximum Temperatures: " +
                    "${maxTemps[i]} celsius, The Weather conditions are: ${weatherNotes[i]}\n")
            totalTemp += minTemps[i] + maxTemps[i]
        }
        val averageTemp= if (days.isNotEmpty()) totalTemp / days.size else 0

        weatherDetailsTxt.text = weatherDetails.toString()
        averageTempTxt.text = "The average temperature given the above data is: $averageTemp celsius"

        backButton.setOnClickListener {
            finish()
        }







    }
}