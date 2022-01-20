package edu.washington.activityspy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("MainActivity", "onCreate event fired")
        Log.i("MainActivity", "savedInstanceState is " + savedInstanceState.toString())
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.i("MainActivity", "onStart event fired")
    }

    override fun onPause() {
        super.onStart()
        Log.i("MainActivity", "onPause event fired")
    }

    override fun onResume() {
        super.onStart()
        Log.i("MainActivity", "onResume event fired")
    }

    override fun onStop() {
        super.onStart()
        Log.i("MainActivity", "onStop event fired")
    }

    override fun onRestart() {
        super.onStart()
        Log.i("MainActivity", "onRestart event fired")
    }

    override fun onDestroy() {
        super.onStart()
        Log.i("MainActivity", "onDestroy event fired")
        Log.e("MainActivity", "We're going down, Captain!")
    }
}