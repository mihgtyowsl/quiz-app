package com.example.quiz_app

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import com.google.common.truth.Truth.assertThat
import org.junit.Rule

private const val Melding = "tim"

@RunWith(AndroidJUnit4::class)
class MainActivityTest{

    @get:Rule
    var activityRule: ActivityScenarioRule<MainActivity> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun verifyName(){
        onView(withId(R.id.name_input))
            .perform(typeText(Melding))

    }
    @Test
    fun verifyButtonOnClick(){

        assertNotNull(onView(withId(R.id.start_button)))
        onView(withId(R.id.start_button)).perform(click())

    }
}