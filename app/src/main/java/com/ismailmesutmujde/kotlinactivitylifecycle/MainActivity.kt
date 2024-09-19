package com.ismailmesutmujde.kotlinactivitylifecycle

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("onCreate","Executed")
    }

    override fun onStart() {
        super.onStart()
        Log.e("onStart","Executed")
    }

    override fun onResume() {
        super.onResume()
        Log.e("onResume","Executed")
    }

    override fun onPause() {
        super.onPause()
        Log.e("onPause","Executed")
    }

    override fun onStop() {
        super.onStop()
        Log.e("onStop","Executed")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("onDestroy","Executed")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("onRestart","Executed")
    }

}