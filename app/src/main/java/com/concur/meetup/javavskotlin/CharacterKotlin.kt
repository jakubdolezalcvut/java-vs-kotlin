package com.concur.meetup.javavskotlin

import android.util.Log

private const val TAG = "CharacterKotlin"

data class CharacterKotlin(
        var firstName: String? = null,
        var lastName: String? = null,
        var birthYear: Int? = 0
)

fun createUsers() {
    val bilbo = CharacterKotlin("Bilbo", "Baggins", 2890)

    val born = bilbo.birthYear
    val businessCard = "${bilbo.firstName} ${bilbo.lastName}, born $born"
    Log.i(TAG, "born: $born")
    Log.i(TAG, "businessCard: $businessCard")

    val sauron = CharacterKotlin(lastName = "Sauron", birthYear = 0)
    sauron.lastName = "Melkor"

    val hashCode = sauron.hashCode()
    Log.i(TAG, "Hashcode: $hashCode")
    Log.i(TAG, "toString: $sauron")

    val melkor = CharacterKotlin(lastName = "Melkor", birthYear = 0)
    val equal = sauron == melkor
    Log.i(TAG, "sauron and melkor are equal: $equal")
}