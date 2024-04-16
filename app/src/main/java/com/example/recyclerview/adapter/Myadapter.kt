package com.example.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.models.model
import java.util.ArrayList

class Myadapter(var context: Context, var arrayList: ArrayList<model>): RecyclerView.Adapter<Myadapter.ItemHolder>() {

    class ItemHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        var icons = itemView.findViewById<ImageView>(R.id.icon_image)
        var text = itemView.findViewById<TextView>(R.id.text_title)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Myadapter.ItemHolder {

        val itemholder = LayoutInflater.from(parent.context).inflate(R.layout.grid_item, parent, false)

        return ItemHolder(itemholder)

    }

    override fun onBindViewHolder(holder: Myadapter.ItemHolder, position: Int) {
        var mycard: model = arrayList.get(position)

        holder.icons.setImageResource(mycard.iconsCard!!)
        holder.text.text = mycard.textCard

        holder.text.setOnClickListener {
            Toast.makeText(context, "Clicked.", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

}