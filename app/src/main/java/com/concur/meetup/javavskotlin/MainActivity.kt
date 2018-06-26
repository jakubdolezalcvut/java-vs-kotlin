package com.concur.meetup.javavskotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()

        // Handling Nulls
        exampleOne()

        // Reducing Boilerplate
        exampleTwo()

        // Class Casting
        exampleThree()

        // Android UI Widgets
        exampleFour()

        // Domain Specific Language (DSL)
        exampleFive()
    }

    // Handling Nulls
    private fun exampleOne() {
        // Java:
        NameUtilsJava.validateUsers(this)

        // Kotlin:
        validateUsers(this)
    }

    // Reducing Boilerplate
    private fun exampleTwo() {
        // Java:
        UserJava.Example.createUsers()

        // Kotlin:
        createUsers()
    }

    // Class Casting
    private fun exampleThree() {
        // Java:
        ClassCastingJava.UserUtils.handleUsers()

        // Kotlin:
        handleUsers()
    }

    // Android UI Widgets
    private fun exampleFour() {
        // Java:
        //val intentJava = Intent(this, SimpleActivityJava::class.java)
        //startActivity(intentJava)

        // Kotlin:
        val intentKotlin = Intent(this, SimpleActivityKotlin::class.java)
        startActivity(intentKotlin)
    }

    // Domain Specific Language (DSL)
    private fun exampleFive() {
        // Kotlin only:
        exampleDsl()
    }
}
