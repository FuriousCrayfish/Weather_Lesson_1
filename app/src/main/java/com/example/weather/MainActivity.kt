package com.example.weather

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    var weatherData = WeatherData("Rostov", 5)
    val newcopy = weatherData.copy(temp = 8)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textView)
        val button: Button = findViewById(R.id.button)
        val button2: Button = findViewById(R.id.button2)

        button.setOnClickListener {
            textView.text = weatherData.toString()
        }

        button2.setOnClickListener {
            textView.text = newcopy.toString()
        }

        val weathers = listOf(
            WeatherData("Ростов", 10),
            WeatherData("Москва", 9),
            WeatherData("Краснодар", 8),
            WeatherData("Пермь", 7),
            WeatherData("Рязань", 6),
            WeatherData("Новосибирск", 5),
            WeatherData("Чита", 4),
            WeatherData("Екатеринбург", 3),
            WeatherData("Ижевск", 2),
            WeatherData("Уфа", 1),
        )

        weathers.forEach {
            Log.e("TAG", it.toString())
        }

        for (weather in 1..10 step 2) {
            Log.e("TAG", weather.toString())
        }

        for (weather in 10 downTo 1 step 2) {
            Log.e("TAG", weather.toString())
        }
    }
}

