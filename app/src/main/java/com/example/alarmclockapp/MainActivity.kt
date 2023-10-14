package com.example.alarmclockapp
import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.alarmclockapp.Mybroadcastreceiver

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById(R.id.mybtn1) as Button
        val edttxt = findViewById( R.id.editText) as EditText;
        btn1.setOnClickListener() {
            var sec=edttxt.text.toString().toInt();
            var intent= Intent(applicationContext, Mybroadcastreceiver::class.java)
            var pendingIntent = PendingIntent.getBroadcast(
                applicationContext,
                111,
                intent,
                PendingIntent.FLAG_IMMUTABLE
            )
            var am : AlarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager
            am.set(AlarmManager.RTC_WAKEUP,System.currentTimeMillis() + (sec*1000),pendingIntent)
            Toast.makeText(applicationContext,"Alarm is set $sec seconds", Toast.LENGTH_LONG).show()
        }
    }
}


