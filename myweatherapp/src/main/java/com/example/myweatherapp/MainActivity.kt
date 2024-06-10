package com.example.myweatherapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    private lateinit var dayEditText: EditText    //Declarations, some set as var for versatility
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
        val detailedViewButton: Button = findViewById(R.id.weatherDetailsBtn)   //Declarations of buttons
        val exitButton2: Button = findViewById(R.id.exit2Btn)

        //exitButton2.setOnClickListener {  //exit button used to quit the app
            finish()
       // }


        addButton.setOnClickListener {
            addWeather()
        }
        clearButton.setOnClickListener {
            clearData()
        }

        detailedViewButton.setOnClickListener {
            val intent: Intent = Intent(this, DetailedViewsScreenActivity::class.java)  //intents used to display data on the next activity/screen
            intent.putStringArrayListExtra("days", days)
            intent.putIntegerArrayListExtra("minTemps", minTemps)
            intent.putIntegerArrayListExtra("maxTemps", maxTemps)
            intent.putStringArrayListExtra("weatherNotes", weatherNotes)
            startActivity(intent)
        }
    }

    private fun addWeather() {
        val day = dayEditText.text.toString()
        val minTemp = minTempEditText.text.toString().toIntOrNull()
        val maxTemp = maxTempEditText.text.toString().toIntOrNull()  //since tempreture is a number, it is an integer and can ne null
        val weatherType = weatherNotesEditText.text.toString()

        if (day.isNotEmpty() && minTemp != null && maxTemp != null) {  //if statment with and logical operators
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