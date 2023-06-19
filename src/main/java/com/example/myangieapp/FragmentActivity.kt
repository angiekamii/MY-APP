package com.example.myangieapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class FragmentActivity : AppCompatActivity() {
    private lateinit var pager:ViewPager
    private lateinit var tab:TabLayout
    private lateinit var bar:Toolbar

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        pager=findViewById(R.id.viewPager)
        tab=findViewById(R.id.tabs)
        bar=findViewById(R.id.toolbar)

        setSupportActionBar(bar)

        //Initializing the ViewPagerAdapter
        val adapter=ViewPagerAdapter(supportFragmentManager)

        //add fragment to the list
        adapter.addFragment(SignUpFragment(),"Signup")
        adapter.addFragment(LoginFragment(),"Login")
        adapter.addFragment(HomeFragment(),"Home")

        //Adding the adapter to the viewpage
        pager.adapter=adapter

        //bind the viewPage
        tab.setupWithViewPager(pager)

    }
}