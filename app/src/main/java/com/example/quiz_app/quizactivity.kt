package com.example.quiz_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
var riktigesvar : Int = 0


class QuizActivity : AppCompatActivity() {
    private var questionnummer : Int = 0
    private val questions : Array<String> = arrayOf("1.kan kylinger fly?","2.lever elton jhon?","3.har eirik oransje hår?","4.fantes det dinosaurer?","5.er jorda flat?","kal")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quizactivity)
        endreQuestion()
        print(intent.extras)
    }

    private fun endreQuestion() {
        val question = findViewById<TextView>(R.id.questions)
        question.text = questions[questionnummer]
    }

    fun fKnapp(view: View) {
        when (questionnummer) {
            0,3 -> {
                riktigesvar ++
                questionnummer ++
            }
            5 -> {
                val intent = Intent(this, question2::class.java)
                intent.putExtra("questionnummer",questionnummer)
                startActivity(intent)
            }
            else -> {
                questionnummer ++
            }
        }

        endreQuestion()
    }
    fun sKnapp(view: View) {
        when (questionnummer) {
            1,2,4 -> {
                questionnummer ++
                riktigesvar ++
            }


            5 -> {
                riktigesvar ++
                val intent = Intent(this, question2::class.java)
                intent.putExtra("questionnummer",questionnummer)
                startActivity(intent)
            }else -> questionnummer ++
        }
        endreQuestion()
    }


    }


