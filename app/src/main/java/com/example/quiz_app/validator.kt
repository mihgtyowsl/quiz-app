package com.example.quiz_app

object validator {
    fun validatorInput (amount : Int , disc : String): Boolean {
    return !(amount <= 0 || disc.isEmpty())
    }
}