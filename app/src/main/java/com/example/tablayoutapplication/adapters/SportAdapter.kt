package com.example.tablayoutapplication.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.tablayoutapplication.R
import com.example.tablayoutapplication.com.example.tablayoutapplication.models.Sports

class SportAdapter(val sportList: ArrayList<Sports>): RecyclerView.Adapter<SportAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.sport_item, viewGroup, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {

        val context = viewHolder.itemView.context
        viewHolder.sporttext.text = sportList[i].sportname

        viewHolder.itemView.setOnClickListener {
            Toast.makeText(context, "" + sportList[i].sportname + " is clicked", Toast.LENGTH_SHORT).show()
        }

    }

    override fun getItemCount(): Int {
        return sportList.size
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val sporttext = view.findViewById<TextView>(R.id.sportView)

    }
}
