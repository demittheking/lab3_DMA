package com.example.lab3_dma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.ImageButton
import android.widget.ImageView
import kotlin.random.Random

class Activity4 : AppCompatActivity() {
    val imageArray: IntArray = intArrayOf(
        R.drawable.image_1,
        R.drawable.image_2,
        R.drawable.image_3,
    )
    val random: Random = Random
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4)
        val layout: FrameLayout = findViewById(R.id.frameLayout)
        val imageView: ImageView = findViewById(R.id.imageView)
        val imageButton: ImageButton = findViewById(R.id.imageButton)
        imageView.setImageResource(imageArray[0])
        imageButton.setOnClickListener {
            val randomNumber = random.nextInt(imageArray.size)
            imageView.setImageResource(imageArray[randomNumber])
        }
    }

}