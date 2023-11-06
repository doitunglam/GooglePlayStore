package com.example.googlestoreclone

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ApplicationAdapter(val items: ArrayList<ApplicationModel>):
RecyclerView.Adapter<ApplicationAdapter.ApplicationViewHolder>(){
    class ApplicationViewHolder(val itemView: View): RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById<ImageView>(R.id.application_img)
        val rating: TextView = itemView.findViewById<TextView>(R.id.application_rating)
        val name: TextView = itemView.findViewById<TextView>(R.id.application_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ApplicationViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.application_item, parent, false)
        return ApplicationViewHolder(itemView);
    }

    override fun onBindViewHolder(holder: ApplicationViewHolder, position: Int) {
        val item = items[position]
        holder.name.text = item.name
        holder.rating.text = item.rating
        holder.image.setImageResource(item.imgId)
    }

    override fun getItemCount(): Int {
        return items.size;
    }
}