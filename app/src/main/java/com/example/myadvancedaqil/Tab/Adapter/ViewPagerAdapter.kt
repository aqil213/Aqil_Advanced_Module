package com.example.myadvancedaqil.Tab.Adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.myadvancedaqil.Tab.Tab1Fragment
import com.example.myadvancedaqil.Tab.Tab2Fragment
import com.example.myadvancedaqil.Tab.Tab3Fragment
import com.example.myadvancedaqil.Tab.Tab4Fragment

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
       return 4
    }

    override fun createFragment(position: Int): Fragment {
     return  when (position) {
            0 -> {
                Tab1Fragment()
            }

            1 -> {
                Tab2Fragment()
            }

            2 -> {
                Tab3Fragment()
            }

            3 -> {
                Tab4Fragment()
            }

            else -> {
                Fragment()
            }
        }
    }

}




