package com.example.code

// Class Game holds each attempt made by a player
// No outstanding issues have been observed.
// As the game is essentially a collection of individual user-attempts,
// that's the approach used when designing the Game class. Due to the smaller
// scale of the game, I did not make players a class as there's only one player
// at any point, so it wouldn't be too difficult to store statistics such as the number
// of attempts made by a player, or the number of correct responses. However, if the
// game was to include multiple players in the future, it would definitely make sense
// to have a Player class, and store attributes such as attempt count, and number of correct
// responses.
class Game {
    private val _attempts = mutableListOf<Attempt>()

    fun attempts(): List<Attempt> {
        return _attempts
    }
    fun addAttempt(attempt: Attempt) {
        _attempts.add(attempt)
    }
}