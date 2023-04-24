package com.aorzora_the_dev.dndcharactersheet.model.currency

import com.aorzora_the_dev.dndcharactersheet.model.currency.Currency

class Gold : Currency {
    override val value: Int
        get() = 100
}