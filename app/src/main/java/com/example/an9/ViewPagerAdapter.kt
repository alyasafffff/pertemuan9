package com.example.an9

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.an9.FriendsFragment
import com.example.an9.GithubFragment
import com.example.an9.ProfileFragment

class ViewPagerAdapter(fragmentActivity: MainActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FriendsFragment()
            1 -> GithubFragment()
            else -> ProfileFragment()
        }
    }
}