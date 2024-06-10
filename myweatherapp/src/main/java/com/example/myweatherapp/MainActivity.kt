package com.example.myweatherapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    private lateinit var dayEditText: EditText
    private lateinit var minTempEditText: EditText
    private lateinit var maxTempEditText: EditText
    private lateinit var weatherNotesEditText: EditText
    private val days = ArrayList<String>()
    private val minTemps = ArrayList<Int>()
    private val maxTemps = ArrayList<Int>()
    private val weatherNotes = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        dayEditText = findViewById(R.id.dayEditTxt)
        minTempEditText = findViewById(R.id.minTempEditTxt)
        maxTempEditText = findViewById(R.id.maxTempEditTxt)
        weatherNotesEditText = findViewById(R.id.weatherNotesEditTxt)

        val addButton: Button = findViewById(R.id.addBtn)
        val clearButton: Button = findViewById(R.id.clearBtn)
        val detailedViewButton: Button = findViewById(R.id.weatherDetailsBtn)
        val exitButton2: Button = findViewById(R.id.exit2Btn)

        exitButton2.setOnClickListener {  //exit button used to quit the app
            finish()
        }


        addButton.setOnClickListener {
            addWeather()
        }
        clearButton.setOnClickListener {
            clearData()
        }

        detailedViewButton.setOnClickListener {
            val intent = Intent(this, DetailedViewsScreenActivity::class.java)
            intent.putStringArrayListExtra("Days", days)
            intent.putIntegerArrayListExtra("MinTemperature", minTemps)
            intent.putIntegerArrayListExtra("MaxTemperature", maxTemps)
            intent.putStringArrayListExtra("WeatherNotes", weatherNotes)
            startActivity(intent)
        }
    }

    private fun addWeather() {
        val day = dayEditText.text.toString()
        val minTemp = minTempEditText.text.toString().toIntOrNull()
        val maxTemp = maxTempEditText.text.toString().toIntOrNull()
        val weatherType = weatherNotesEditText.text.toString()

        if (day.isNotEmpty() && minTemp != null && maxTemp != null) {
            days.add(day)
            minTemps.add(minTemp)
            maxTemps.add(maxTemp)
            weatherNotes.add(weatherType)

            dayEditText.text.clear()
            minTempEditText.text.clear()
            maxTempEditText.text.clear()
            weatherNotesEditText.text.clear()

            Toast.makeText(this, "Data added successfully", Toast.LENGTH_SHORT).show()
        }
        else
       {
            Toast.makeText(this, "Please try again and fill in all fields correctly", Toast.LENGTH_SHORT).show()
        }

    }

    private fun clearData() {
        days.clear()
        minTemps.clear()
        maxTemps.clear()
        weatherNotes.clear()

        dayEditText.text.clear()
        minTempEditText.text.clear()
        maxTempEditText.text.clear()
        weatherNotesEditText.text.clear()

        Toast.makeText(this, "Data cleared", Toast.LENGTH_SHORT).show()
    }


}