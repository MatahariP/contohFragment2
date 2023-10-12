package com.example.contohfragment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val homeFragment = homeFragment()
        val nextPageFragment = nextPageFragment()
        val btnHomeFragment = findViewById<Button>(R.id.btnFragment1)
        val btnnextPageFragment = findViewById<Button>(R.id.btnFragment2)
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, homeFragment)
            addToBackStack(null)
            commit()
        }

        btnHomeFragment.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, homeFragment)
                addToBackStack(null)
                commit()
            }
        }
        btnnextPageFragment.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, nextPageFragment)
                addToBackStack(null)
                commit()
            }
        }
    }
}