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

        btnVariable02.setOnClickListener {
//            변수 연습02

            var myName = "김정환"
            val myBirthYear = 1988
            var myHeight = 180.3

            myHeight = 185.0

            Log.d("변수연습02", myName)
        }
    }
}