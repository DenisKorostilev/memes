package com.example.memes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val leftTopText: TextView = findViewById(R.id.left_top_text)
        val rightTopText: TextView = findViewById(R.id.right_top_text)
        val leftBottomText: TextView = findViewById(R.id.bottom_left_text)
        val rightBottomText: TextView = findViewById(R.id.bottom_right_text)
        val leftTopImage: ImageView = findViewById(R.id.left_top_picture)
        val rightTopImage: ImageView = findViewById(R.id.right_top_picture)
        val leftBottomImage: ImageView = findViewById(R.id.bottom_left_picture)
        val rightBottomImage: ImageView = findViewById(R.id.bottom_right_picture)

        val phrases = listOf(
            R.string.textkota1, R.string.textkota2, R.string.textkota3, R.string.textkota4
        )

        // Обработчики щелчков
        leftTopImage.setOnClickListener {
            val shuffledList = phrases.shuffled() // перемешанный список
            // Выводим в текстовые метки
            leftTopText.text = getString(shuffledList[0])
        }

        rightTopImage.setOnClickListener {
            val shuffledList = phrases.shuffled()
            rightTopText.text = getString(shuffledList[0])
        }

        leftBottomImage.setOnClickListener {
            val shuffledList = phrases.shuffled()
            leftBottomText.text = getString(shuffledList[0])
        }

        rightBottomImage.setOnClickListener {
            val shuffledList = phrases.shuffled()
            rightBottomText.text = getString(shuffledList[0])
        }
    }
}