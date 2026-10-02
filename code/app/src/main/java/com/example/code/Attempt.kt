package com.example.code

import kotlin.time.ExperimentalTime
import kotlin.time.Instant

// Class Attempt is used to record each sequence guess made by a player.
// No outstanding issues have been observed.
// As the assignment outline mentioned that each attempt should include
// the chosen sequence length, user input, actual sequence, correctness and
// timestamp of the attempt, those were the only attributes included within the class.

data class Attempt @OptIn(ExperimentalTime::class) constructor(
    val sequenceLen: Int,
    val input: Int,
    val answer: Int,
    val correct: Boolean,
    val current_ts: Instant  // Kotlin Foundation (JetBrains), (n.d.), Apache 2.0, https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.time/-instant/
) {
}