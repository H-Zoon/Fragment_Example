package com.example.freagment_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // getFragmentmanager is dispatcher
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val fragment = BlankFragment_A()
        fragmentTransaction.add(R.id.fragmentContainerView, fragment)
        fragmentTransaction.commit()

    }
}