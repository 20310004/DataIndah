package com.intent.dataindah

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.fragment.app.FragmentStatePagerAdapter

class ViewPagerAdapter(fragmentActivity: FragmentActivity) :
        FragmentStateAdapter(fragmentActivity) {
    private val JUMLAH_MENU = 3

    override fun createFragment(position: Int): Fragment {
        when (position){
            0 -> {return MyFriendsFragment()}
            1 -> {return GitHubFragmen()}
            2 -> {return ProfileFragment()}
            else -> {return GitHubFragmen()}
        }
    }

    override fun getItemCount(): Int {
       return JUMLAH_MENU
    }

 }
