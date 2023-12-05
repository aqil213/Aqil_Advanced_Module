package com.example.myadvancedaqil

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.myadvancedaqil.Tab.Adapters.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class TabActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab)
        val btn1 = findViewById<Button>(R.id.btn1)
        btn1.setOnClickListener {
            finish()
        }
        val btn2 : Button = findViewById(R.id.btn2)
        btn2.setOnClickListener(this)

        val tabLayout=findViewById<TabLayout>(R.id.tlKubus)
        val viewPager2=findViewById<ViewPager2>(R.id.pgKubus)

        val adapter=ViewPagerAdapter(supportFragmentManager,lifecycle)

        viewPager2.adapter=adapter

        TabLayoutMediator(tabLayout,viewPager2){tab,position ->
            when(position){
                0->{
                    tab.text="Kubus"
                }
                1->{
                    tab.text="Balok"
                }
                2->{
                    tab.text="Prisma"
                }
                3->{
                    tab.text="Limas"
                }
            }
        }.attach()

    }

    override fun onClick(v: View?) {
        if (v != null){
            when(v.id){
                R.id.btn2 ->{
                    val pindahIntent = Intent(this, ProfileActivity::class.java)
                    startActivity(pindahIntent)
                }
            }
        }
    }
}
