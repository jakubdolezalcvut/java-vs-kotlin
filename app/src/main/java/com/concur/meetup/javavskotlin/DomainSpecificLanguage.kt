package com.concur.meetup.javavskotlin

import android.util.Log

private const val TAG = "DSL"

data class Protagonist(
        var firstName: String? = null,
        var lastName: String? = null,
        var birth: Int? = null,
        var trips: MutableList<Trip> = mutableListOf()
)

data class Trip(
        var from: String? = null,
        var to: String? = null,
        var year: Int? = null
)

fun protagonist(body: Protagonist.() -> Unit): Protagonist {
    return Protagonist().apply(body)
}

fun Protagonist.trip(block: Trip.() -> Unit) {
    Trip().apply(block).also { trips.add(it) }
}

fun createProtagonist(): Protagonist {
    return protagonist {
        firstName = "Bilbo"
        lastName = "Baggins"
        birth = 2890

        trip {
            from = "Shire"
            to = "Lonely Mountain"
            year = 2941
        }
        trip {
            from = "Shire"
            to = "Rivendell"
            year = 3018
        }
        trip {
            from = "Rivendell"
            to = "Undying Lands"
            year = 3021
        }
    }
}

fun exampleDsl() {
    val protagonist = createProtagonist()
    Log.i(TAG, protagonist.toString())
}