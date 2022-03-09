package com.roynaldi19.pzna01_02gamebatukertasgunting

import kotlin.random.Random

object Game {
    private val rules = mapOf(
        "ROCK-SCISSORS" to true,
        "ROCK-PAPER" to false,
        "SCISSORS-PAPER" to true,
        "SCISSORS-ROCK" to false,
        "PAPER-ROCK" to true,
        "PAPER-SCISSORS" to false,
    )

    private val options = listOf("ROCK", "SCISSORS", "PAPER")

    private val optionsDrawable = mapOf(
        "ROCK" to R.drawable.batu,
        "PAPER" to R.drawable.kertas,
        "SCISSORS" to R.drawable.gunting
    )

    fun pickRandomOption(): String = options[Random.nextInt(0, 3)]

    fun pickDrawable(option: String): Int = optionsDrawable[option]!!

    fun isDraw(from: String, to: String): Boolean = from == to

    fun isWin(from: String, to: String): Boolean = rules["$from-$to"]!!
}