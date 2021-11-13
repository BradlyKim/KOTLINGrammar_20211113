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

        btnCondition01.setOnClickListener {
//            조건문 01 버튼 눌리면 실행될 코드

            val userAge = 10

//            나이가 20살 이상인가? -> 로그로 "성인입니다." 문장 출력

            if(userAge >= 20){

                Log.d("조건문01", "성인입니다.")
            }

            else if (userAge >= 17) {
//                성인이 아리고, 질문 -> 17살 이상인가?
                Log.d("조건문01", "고등학생입니다.")

            }

            else if (userAge >= 14) {
//                성인이 아니고, 고등학생도 아닐때 질문
                Log.d("조건문01", "중학생입니다.")
            }

            else {
                Log.d("조건문01", "초등학생이거나, 미취학 아동입니다. ")
            }


        }
    }
}