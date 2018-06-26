package com.concur.meetup.javavskotlin

import android.util.Log

private const val TAG = "ClassCastingKotlin"

interface User {
    var name: String
}

class LocalUser(
        override var name: String = "Honza",
        var stationId: Long = 42
) : User

class RemoteUser(
        override var name: String = "Vladimir",
        var ipAddress: String = "2001:0db8:85a3:0000:0000:8a2e:0370:7334"
) : User


fun getUserSpecifics(user: User): String {
    val specifics = when(user) {
        is LocalUser -> user.stationId.toString()
        is RemoteUser -> user.ipAddress
        else -> throw IllegalArgumentException("Unknown user type.")
    }
    return "User $specifics"
}

fun handleUsers() {
    val localUser = LocalUser()
    val remoteUser = RemoteUser()

    val localSpecifics = getUserSpecifics(localUser)
    val remoteSpecifics = getUserSpecifics(remoteUser)

    Log.i(TAG, localSpecifics)
    Log.i(TAG, remoteSpecifics)
}
