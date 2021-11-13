package com.nepplus.kotlingrammar_20211113

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnVariable01.setOnClickListener {

            // 이 안에 적는 코드 - 변수 문법 연습 01

            var myName : String

            myName = "김정환"

            Log.d("문법연습01", myName)

            val friendName : String

            friendName = "전혜진"
//            friendName = "김도훈"



            Log.d("문법연습01", friendName)

        }
    }
}