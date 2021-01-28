package com.example.webview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_web_view.*

class WebView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)


        btnWebView.setOnClickListener {
            val dashboardIntent = Intent(this, ThirdActivity::class.java)
            startActivity(dashboardIntent)
        }
    }
}