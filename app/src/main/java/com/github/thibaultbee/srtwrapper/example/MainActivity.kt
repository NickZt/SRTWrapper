package com.github.thibaultbee.srtwrapper.example

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.github.thibaultbee.srtwrapper.Srt

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var mSrt= Srt()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        mSrt.startUp()
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

}
