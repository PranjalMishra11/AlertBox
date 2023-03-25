package com.example.coustomisealertbox

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var dialog : Dialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var myButton = findViewById<Button>(R.id.btnClick)

        dialog= Dialog(this)
        dialog.setContentView(R.layout.activity_custom_dailoge_box)
        dialog.window?.setBackgroundDrawable(getDrawable(R.drawable.bg_alert_box))

        var buttonGood = dialog.findViewById<Button>(R.id.btngood)
        var buttonFeedback = dialog.findViewById<Button>(R.id.btnfeedback)

        buttonGood.setOnClickListener {
            dialog.dismiss()
        }

        buttonFeedback.setOnClickListener {
            //This will show some google form use intent
        }

        myButton.setOnClickListener {
            dialog.show()
        }
    }
}