package com.example.fruitstask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class FruitDetailedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruit_detailed)

        val fruit = intent.getParcelableExtra<Fruit>("Food")
        if(fruit!=null){


            val textView : TextView = findViewById(R.id.fruitLabelDetailed)
            val imageView  : ImageView = findViewById(R.id.fruitImageDetailed)
            val descView : TextView = findViewById(R.id.fruitDesc)
            textView.text= fruit.fruitName
            descView.text = fruit.shortDesc
            imageView.setImageResource(fruit.fruitImage)
        }
    }
}