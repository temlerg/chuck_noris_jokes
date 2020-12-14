package com.example.chuck_noris_jokes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.chuck_noris_jokes.Network.Value

class Adapter(var items: List<Value>) :
    RecyclerView.Adapter<Adapter.MainHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MainHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.card, parent, false)
    )

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        holder.bind(items[position])
    }

    inner class MainHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val message = itemView.findViewById<TextView>(R.id.joke)

        fun bind(item: Value) {
            message.text = item.joke
        }
    }
}