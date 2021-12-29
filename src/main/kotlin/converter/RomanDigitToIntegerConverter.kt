package com.github.kzfor.test.caluclator.converters

/**
 * A converter that turns a roman digit string into an integer
 */
class RomanDigitToIntegerConverter : Converter<Int, String> {
    private val romanDigitsStringToIntegerMap: Map<String, Int> = mapOf(
        "I" to 1,
        "II" to 2,
        "III" to 3,
        "IV" to 4,
        "V" to 5,
        "VI" to 6,
        "VII" to 7,
        "VIII" to 8,
        "IX" to 9,
        "X" to 10
    )
    override fun convert(obj: String): Int {
        return romanDigitsStringToIntegerMap[obj] ?: throw IllegalArgumentException()
    }
}