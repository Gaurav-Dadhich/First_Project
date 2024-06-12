package com.example.first_project

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.ads.mediationtestsuite.activities.HomeActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    val Re = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        Log.i(Re,"Activity Starts!!!")
    }
    override fun onStop() {
        super.onStop()
        Log.i(Re,"Activity Stops!")
    }
    //Similarly we have pause, destroy and resume functions for the activity cycle.

    fun clickHandler(view: View) {
        Log.i("MainActivity-clickHandler","Button Clicked")
//        var dialIntent: Intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:9782915123"))
//        var webIntent: Intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"))
//        startActivity(webIntent)

        /*var hintent = Intent(this,HomeActivity::class.java)
        hintent.putExtra(name:"nykey", value:"abdul-android")
        startActivity(hintent)*/
    }


}