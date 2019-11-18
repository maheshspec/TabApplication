package com.example.tablayoutapplication.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.tablayoutapplication.com.example.tablayoutapplication.models.Books
import com.example.tablayoutapplication.R

class BookAdapter( val bookList: ArrayList<Books>): RecyclerView.Adapter<BookAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.book_item, viewGroup, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {

        val context = viewHolder.itemView.context
        viewHolder.booktext.text = bookList[i].bookname

        viewHolder.itemView.setOnClickListener {
            Toast.makeText(context,""+bookList[i].bookname+" is clicked", Toast.LENGTH_SHORT).show()
        }

    }

    override fun getItemCount(): Int {
        return bookList.size
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val booktext= view.findViewById<TextView>(R.id.bookView)
    }

}