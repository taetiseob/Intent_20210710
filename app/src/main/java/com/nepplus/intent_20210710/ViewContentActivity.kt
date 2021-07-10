package com.nepplus.intent_20210710

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_view_content.*

class ViewContentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_content)
        val message = intent.getStringExtra("othermessage")
        otherTextView.text = message
    }
}