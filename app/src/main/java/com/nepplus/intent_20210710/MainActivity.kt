package com.nepplus.intent_20210710

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val REQ_CODE_NICKNAME = 1001

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        moveToOtherBtn.setOnClickListener {
            //다른화면으로 넘어가기.
            val myIntent = Intent(this,OtherActivity::class.java)
            startActivity(myIntent);
        }

        sendMessageBtn.setOnClickListener {
            //Message 조회 하면으로 넘어가기.
            val inputMessage = messageEdt.text.toString()
            val myIntent = Intent(this,ViewActivity::class.java)

            //출발 하기 전에 짐을 첨부하고나서
            myIntent.putExtra("message", inputMessage)
            //비행기 출발
            startActivity(myIntent);
        }

        otherMessagebtn.setOnClickListener {
            val otherMessage = messageEdt.text.toString()
            val otherIntent = Intent(this,ViewContentActivity::class.java)

            otherIntent.putExtra("othermessage",otherMessage)
            startActivity(otherIntent)
        }
        editNicknameBtn.setOnClickListener {
            val myIntent = Intent(this,EditNickNameActivity::class.java)
            startActivityForResult(myIntent,REQ_CODE_NICKNAME)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == REQ_CODE_NICKNAME) {
            if(resultCode == Activity.RESULT_OK){
                val newNickName = data?.getStringExtra("nick")
                nicknameTxt.text = newNickName
            }
        }

    }
}