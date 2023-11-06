package com.example.googlestoreclone

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ApplicationRowAdapter(val items: ArrayList<ApplicationCategoryModel>):
    RecyclerView.Adapter<ApplicationRowAdapter.ApplicationRowViewHolder>() {
    val viewPool = RecyclerView.RecycledViewPool();

    class ApplicationRowViewHolder(val itemView: View):RecyclerView.ViewHolder(itemView) {
        val categoryName: TextView = itemView.findViewById<TextView>(R.id.category_name)
        val applicationRow: RecyclerView = itemView.findViewById<RecyclerView>(R.id.application_list)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ApplicationRowViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.application_row,parent, false)
        return ApplicationRowViewHolder(itemView);
    }

    override fun onBindViewHolder(holder: ApplicationRowViewHolder, position: Int) {
        val item = items[position];
        print(position)
        holder.categoryName.text = item.name;

        val adapter = ApplicationAdapter(item.applications);


        val layoutManager = LinearLayoutManager(holder.applicationRow.context, LinearLayoutManager.HORIZONTAL, false);
        layoutManager.initialPrefetchItemCount = item.applications.size

        holder.applicationRow.layoutManager = layoutManager;
        holder.applicationRow.adapter = adapter;
        holder.applicationRow.setRecycledViewPool(viewPool);

    }

    override fun getItemCount(): Int {
        return items.size;
    }
}