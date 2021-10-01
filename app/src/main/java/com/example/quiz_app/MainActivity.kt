package com.example.quiz_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

var name : String = ""
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startNewActivity(view: View) {
        val input : EditText = findViewById(R.id.name_input)
        name = input.text.toString()

        val intent = Intent(this, QuizActivity::class.java)
        startActivity(intent)
    }

}


