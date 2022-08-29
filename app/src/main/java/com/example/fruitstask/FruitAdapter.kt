
package com.example.recyclerapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.fruitstask.Fruit
import com.example.fruitstask.R

class FruitAdapter(
    private val fruitList: List<Fruit>
) : RecyclerView.Adapter<FruitAdapter.FruitViewHolder>() {

    class FruitViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){


        val textView : TextView = itemView.findViewById(R.id.fruit_name)
        val imageView : ImageView = itemView.findViewById(R.id.fruit_image)


    }
var onItemClick: ((Fruit) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitViewHolder {
        val itemFruitView =
            LayoutInflater.from(parent.context).inflate(R.layout.fruit_item, parent, false)
        return FruitViewHolder(itemFruitView)

    }

    override fun onBindViewHolder(holder: FruitViewHolder, position: Int) {
        val currentFruit = fruitList[position]
        holder.imageView.setImageResource(currentFruit.fruitImage)
        holder.textView.text=currentFruit.fruitName
        holder.itemView.setOnClickListener{
            onItemClick?.invoke(currentFruit)
        }
    }

    override fun getItemCount(): Int {
        return fruitList.size
    }



}