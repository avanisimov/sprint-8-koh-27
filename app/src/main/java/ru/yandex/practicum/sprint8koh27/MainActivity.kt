package ru.yandex.practicum.sprint8koh27

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


    private var lastOnStopTimestamp: Long = 0
    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        Log.d("SPRINT_8", "onCreate $this")


        findViewById<Button>(R.id.btn_next).setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }


//        recreate()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
    }


    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
    }


    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
    }


    override fun onStart() {
        super.onStart()
        Log.d("SPRINT_8", "onStart $this")
        if ((System.currentTimeMillis() - lastOnStopTimestamp) > 7000L){
            // show pin code
            Log.d("SPRINT_8", "show pin code")
        }
    }

    override fun onResume() {
        super.onResume()
        Log.d("SPRINT_8", "onResume $this")
    }


    override fun onRestart() {
        super.onRestart()
    }

    override fun onPause() {
        super.onPause()
        Log.d("SPRINT_8", "onPause $this")
    }

    override fun onStop() {
        super.onStop()
        Log.d("SPRINT_8", "onStop $this")
        lastOnStopTimestamp = System.currentTimeMillis()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("SPRINT_8", "onDestroy $this")
    }


}