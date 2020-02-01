package com.example.customprogressdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var customProgress:CustomProgress

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button_login.setOnClickListener {
            customProgress = CustomProgress.show(this,"登录中...",true,null)
        }
    }
}
