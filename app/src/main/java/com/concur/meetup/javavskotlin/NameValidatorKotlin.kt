package com.concur.meetup.javavskotlin

import android.content.Context
import android.util.Log
import android.widget.Toast

private const val TAG = "NameUtilsKotlin"

object NameUtilsKotlin {

    fun transformName(name: String?): String? {
        return name?.replace("o", "0")
    }

    fun isNameValid(name: String?): Boolean {
        val length = name?.length ?: 0
        return (length >= 5)
    }

    fun showLogic(name: String?, context: Context) {
        name?.let {
            Toast.makeText(context, it, Toast.LENGTH_SHORT).show()
        }
    }

    fun showChained(name: String?, context: Context) {
        name?.let {
            Toast.makeText(context, it, Toast.LENGTH_SHORT)

        }?.also {
            it.setMargin(10f, 5f)
            it.show()
        }
    }
}

fun validateUsers(context: Context) {
    Log.i(TAG, "transformName ${NameUtilsKotlin.transformName(null)}")
    Log.i(TAG, "transformName ${NameUtilsKotlin.transformName("Honza")}")

    Log.i(TAG, "isNameValid ${NameUtilsKotlin.isNameValid(null)}")
    Log.i(TAG, "isNameValid ${NameUtilsKotlin.isNameValid("Jan")}")
    Log.i(TAG, "isNameValid ${NameUtilsKotlin.isNameValid("Honza")}")

    NameUtilsKotlin.showLogic(null, context)
    NameUtilsKotlin.showLogic("Honza", context)
    //showChained("Honza", context);
}