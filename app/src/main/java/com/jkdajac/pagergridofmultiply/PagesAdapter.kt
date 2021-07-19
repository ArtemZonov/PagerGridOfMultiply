package com.jkdajac.pagergridofmultiply

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PagesAdapter( val pages : ArrayList<Page>,  val fragmentManager : FragmentManager) : FragmentPagerAdapter(fragmentManager){
    override fun getCount(): Int {
        return pages.size
    }

    override fun getItem(position: Int): Fragment {
        return  PageFragment.newInstance(pages[position].title, pages[position].text, pages[position].image)
    }
}