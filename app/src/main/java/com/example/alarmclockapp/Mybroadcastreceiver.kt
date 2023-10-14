package com.example.alarmclockapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import com.example.alarmclockapp.AlarmonActivity

class Mybroadcastreceiver :BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        var intent = Intent(context,AlarmonActivity::class.java)
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        context?.startActivity(intent)
    }
}