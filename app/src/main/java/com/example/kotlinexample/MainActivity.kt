package com.example.kotlinexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var a = 10;
//        var b = 20;
//
//        if(a>b){
//            Log.d("TAG","a>b")
//        }else{
//            Log.d("TAG","a<b")
//        }
        var a = "vanh"
        var b = 110;
//        when (a) {
//            "viet anh","vanh" -> Log.d("TAG", "Xin chao viet anh")
//            "ngan" -> Log.d("TAG", "Xin chao trang nga")
//            else -> Log.d("TAG", "Chao ban")
//        }
//        when (b) {
//            in 1..3 -> Log.d("TAG", "Quy 1")
//            in 4..6 -> Log.d("TAG", "Quy 2")
//            in 7..9 -> Log.d("TAG", "Quy 3")
//            in 10..12 -> Log.d("TAG", "Quy 4")
//            else -> Log.d("TAG", "K hop le")
//        }
//        var c = 0;
//        while (c < 10) {
//            Log.d("TAG", "c=" + c)
//            c++
//        }
        var temp = 10
        for(i in temp downTo  0 step 2 ){
            Log.d("TAG", "i=" + i)
        }
    }

}