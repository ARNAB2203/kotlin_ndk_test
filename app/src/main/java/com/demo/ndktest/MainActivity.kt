package com.demo.ndktest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var txt : TextView

    // loading native library in a static block
    companion object {
        init {
            System.loadLibrary("ndktest")
        }

        // calling native function
        @JvmStatic
        external fun funName() : String
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txt = findViewById(R.id.txt)
        txt.text = funName()
    }
}