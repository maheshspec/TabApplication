package com.example.tablayoutapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tablayoutapplication.R
import com.example.tablayoutapplication.com.example.tablayoutapplication.models.Sports
import com.example.tablayoutapplication.adapters.SportAdapter
import kotlinx.android.synthetic.main.fragment_sport.*
import java.util.*
import kotlin.collections.ArrayList


class SportFragment : Fragment() {

    private val sportList = ArrayList<Sports>()

    private lateinit var sportnames:Array<String>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_sport, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }
    private fun initViews() {

        sportview.setHasFixedSize(true)
        val layoutManager = LinearLayoutManager(context)
        sportview.layoutManager = layoutManager

        val sports = prepareData()
        val adapter = SportAdapter(sports)
        sportview.adapter = adapter

    }

    private fun prepareData(): ArrayList<Sports> {
    sportnames = resources.getStringArray(R.array.sports_array)
        for (i in sportnames.indices) {
            val sport =
                Sports()
            sport.sportname = sportnames[i]

            sportList.add(sport)
        }
        return sportList
    }
}
