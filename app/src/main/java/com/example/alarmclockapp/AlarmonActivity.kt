package com.example.alarmclockapp

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AlarmonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarmon)

        val btn2 = findViewById(R.id.button2) as Button;


        var mp = MediaPlayer.create(applicationContext, R.raw.alaramtome)
        mp.start()

        btn2.setOnClickListener(){
            mp.stop()
        }

    }


}