package com.concur.meetup.javavskotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_simple.*

private const val TAG = "SimpleActivityKotlin"

class SimpleActivityKotlin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_simple)
        setSupportActionBar(simple_toolbar)

        simple_toolbar.setNavigationOnClickListener({
            Log.i(TAG, "Navigation clicked.")
        })

        simple_text.text = "Kotlin Activity"
    }
}