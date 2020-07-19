package com.yanap.kotlinandroidtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

// アクティビティ
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 文字列をブチ込むテスト
        val textView = findViewById(R.id.textView) as TextView
        // ↓リテラル直書きは推奨されないらしい。
        //textView.text = "Fucking Text"
        //textView.setText("Fucking Text")
        // ↓変数を一旦挿むか、
        val fuckingText = "Fucking Variable Text"
        textView.text = fuckingText
        // ↓あらかじめResourceに放り込んでおいたものを引っ張ってくる。
        //textView.setText(R.string.FuckingText)
    }
}