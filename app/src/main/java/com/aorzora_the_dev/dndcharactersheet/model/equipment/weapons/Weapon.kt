package com.aorzora_the_dev.dndcharactersheet.model.equipment.weapons

import com.aorzora_the_dev.dndcharactersheet.model.DamageType
import com.aorzora_the_dev.dndcharactersheet.model.dice.Dice
import com.aorzora_the_dev.dndcharactersheet.model.equipment.Equipment

interface Weapon : Equipment {
    val damageDice: Dice
    val damageDiceCount: Int
    val damageType: DamageType
    val properties: List<WeaponProperty>
}