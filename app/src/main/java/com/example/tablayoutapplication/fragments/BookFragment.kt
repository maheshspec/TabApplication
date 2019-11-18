package com.example.tablayoutapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tablayoutapplication.com.example.tablayoutapplication.models.Books
import com.example.tablayoutapplication.R
import com.example.tablayoutapplication.adapters.BookAdapter
import kotlinx.android.synthetic.main.fragment_book.*
import java.util.*
import kotlin.collections.ArrayList

class BookFragment : Fragment() {

    private val booklist = ArrayList<Books>()

    private lateinit var booknames:Array<String>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_book, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    private fun initViews() {

        with(bookview) {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context)
            adapter = BookAdapter(prepareData())
        }
    }

    private fun prepareData(): ArrayList<Books> {
        booknames = resources.getStringArray(R.array.books_array)
        for (i in booknames.indices) {
            val book =
                Books()
            book.bookname = booknames[i]

            booklist.add(book)
        }
        return booklist
    }

}