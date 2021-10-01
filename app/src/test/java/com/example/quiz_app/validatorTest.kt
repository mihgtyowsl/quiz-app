package com.example.quiz_app

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import com.google.common.truth.Truth.assertThat


@RunWith(JUnit4::class )
class ValidatorTest{


    @Test

    fun whenImputeIsValid(){
        val amount = 100
        val desc = "som random desc"
        val result = validator.validatorInput(amount, desc)
        assertThat(result).isEqualTo(false)

    }

    @Test

    fun whenImputeIsInvalid(){
        val amount = 0
        val desc = ""
        val result = validator.validatorInput(amount, desc)
        assertThat(result).isEqualTo(false)

    }

}