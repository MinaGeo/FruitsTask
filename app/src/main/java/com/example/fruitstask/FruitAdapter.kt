
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

//    private lateinit var mListener: onItemClickListener
//    interface onItemClickListener
//    {
//        fun onItemClick(position: Int)
//    }
//    fun setOnItemClickListener(listener: onItemClickListener)
//    {
//        mListener = listener
//    }

    class FruitViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){


        val textView : TextView = itemView.findViewById(R.id.fruit_name)
        val imageView : ImageView = itemView.findViewById(R.id.fruit_image)
//        init {
////            fruitName = itemView.findViewById(R.id.fruit_name)
////            fruitImage = itemView.findViewById(R.id.fruit_image)
//            itemView.setOnClickListener {
//                val currentFruit = fruitList[layoutPosition]
////                listener.onItemClick(layoutPosition)
//
//                Toast.makeText(
//                    itemView.context, currentFruit.fruitName, Toast.LENGTH_SHORT
//                ).show()
//            }
//        }

//        fun bindCharacter(fruit: Fruit) {
//            fruitName.text = fruit.fruitName
//            fruitImage.setImageResource(fruit.fruitImage)
//        }


    }
var onItemClick: ((Fruit) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitViewHolder {
        val itemFruitView =
            LayoutInflater.from(parent.context).inflate(R.layout.fruit_item, parent, false)
//        return FruitViewHolder(itemFruitView, mListener)
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


//    inner class FruitViewHolder(itemView: View, listener: onItemClickListener) : RecyclerView.ViewHolder(itemView){


}