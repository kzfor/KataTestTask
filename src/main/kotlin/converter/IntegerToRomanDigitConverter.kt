package com.github.kzfor.test.caluclator.converters

import com.github.kzfor.test.caluclator.roman.digits.RomanDigits

/**
 * Converter implementation that turns an integer into a roman digit string
 * Uses a RomanDigits method to get the corresponding string
 * @see RomanDigits
 */
class IntegerToRomanDigitConverter : Converter<String, Int> {
    override fun convert(obj: Int): String {
        return RomanDigits.fromInt(obj)
    }
}