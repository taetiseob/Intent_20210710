package com.nepplus.intent_20210710

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_other.*

class OtherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)
        moveToMainBtn.setOnClickListener {
//            val otherIntent = Intent(this,MainActivity::class.java)
//            startActivity(otherIntent);
            finish();
        }
    }
}