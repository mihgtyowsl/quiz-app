package com.example.quiz_app

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
 
class question2 : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question2)
        var questionnummer: Int = intent.getIntExtra("questionnummer", 0)
        questionnummer ++
        val takk = findViewById<TextView>(R.id.locket)
        takk.text =  "$name, takk for at du tokk quiz-en min"
        val svar = findViewById<TextView>(R.id.riktigesvar)
        svar.text = "du fikk $riktigesvar riktigsvar av $questionnummer"





    }
}