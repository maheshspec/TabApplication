package com.example.tablayoutapplication.adapters


import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.tablayoutapplication.fragments.BookFragment
import com.example.tablayoutapplication.fragments.SportFragment

class ViewAdapter( fm: FragmentManager,var totalTabs: Int) : FragmentPagerAdapter(fm,FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) { //to switch to its replacement

    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> {
                return BookFragment()
            }
            1 -> {
                return SportFragment()
            }

            else -> return getItem(0)
        }
    }

    override fun getCount(): Int {
        return totalTabs
    }
}
