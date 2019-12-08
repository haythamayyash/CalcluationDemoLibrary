package com.haythamayyash.calculationdemolibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       Toast.makeText(this, "${Calculation.add(4, 8)}" ,Toast.LENGTH_LONG).show()
        Log.v("kk","kk")
    }
}
