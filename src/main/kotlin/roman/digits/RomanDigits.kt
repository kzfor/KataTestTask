package com.github.kzfor.test.caluclator.roman.digits

/**
 * Class with static methods for roman digits
 */
class RomanDigits {
    companion object {
        private val romanDigitsFromOneToTen = listOf(
            "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"
        )
        private val romanTensFromTenToHundred = listOf(
            "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "LC", "C"
        )

        /**
         * Takes integer value and returns roman digit string
         * @param digit Integer value to get corresponding roman digit string
         * @return Corresponding roman digit string
         */
        fun fromInt(digit: Int): String {
            return if (digit <= 0 || digit > 100) {
                throw IllegalArgumentException()
            } else if (digit <= 10) {
                romanDigitsFromOneToTen[digit - 1]
            } else {
                if (digit % 10 == 0) {
                    romanTensFromTenToHundred[digit / 10 - 1]
                } else {
                    romanTensFromTenToHundred[digit / 10 - 1] + romanDigitsFromOneToTen[digit % 10 - 1]
                }
            }
        }
    }
}