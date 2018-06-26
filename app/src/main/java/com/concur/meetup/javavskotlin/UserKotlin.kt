package com.concur.meetup.javavskotlin

import android.util.Log

private const val TAG = "UserKotlin"

data class UserKotlin(
        var firstName: String? = null,
        var lastName: String? = null,
        var birthYear: Int? = 0
)

fun createUsers() {
    val user1 = UserKotlin("Bilbo", "Baggins", 2890)

    val born = user1.birthYear
    val businessCard = "${user1.firstName} ${user1.lastName}, born $born"
    Log.i(TAG, "born: $born")
    Log.i(TAG, "businessCard: $businessCard")

    val user2 = UserKotlin(lastName = "Sauron", birthYear = 0)
    user2.lastName = "Melkor"

    val hashCode = user2.hashCode()
    Log.i(TAG, "Hashcode: $hashCode")
    Log.i(TAG, "toString: $user2")

    val user3 = UserKotlin(lastName = "Melkor", birthYear = 0)
    val equal = user2 == user3
    Log.i(TAG, "user2 and user3 are equal: $equal")
}