package com.aorzora_the_dev.dndcharactersheet.model.dice

import kotlin.random.Random

class Dice(
    private val sides: Int,
) {
    fun roll(): Int {
        return Random.nextInt(1, this.sides)
    }
}