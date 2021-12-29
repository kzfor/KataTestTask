package com.github.kzfor.test.caluclator.validator

import com.github.kzfor.test.caluclator.parser.CalculatorTokenSet
import com.github.kzfor.test.caluclator.validator.exceptions.ValidationErrorException

class CalculatorTokenSetValidatorImpl : CalculatorTokenSetValidator {
    private val validRomanDigits: List<String> = listOf(
        "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"
    )

    private var isRomanDigit: Boolean = false

    override fun validate(obj: CalculatorTokenSet) {
        if (obj.getParsedTokens().size != 3) {
            throw ValidationErrorException("Application requires 3 arguments but" +
                    " ${obj.getParsedTokens().size} was given.")
        }
        val firstParsedDigit = obj.getFirstRawDigit()
        val secondParsedDigit = obj.getSecondRawDigit()
        try {
            val firstNum = firstParsedDigit.toInt()
            val secondNum = secondParsedDigit.toInt()

            if (firstNum > 10 || secondNum > 10) {
                throw ValidationErrorException("Calculator accepts numbers less than 10 as input")
            }
        } catch (e: NumberFormatException) {
            if (!(firstParsedDigit in validRomanDigits && secondParsedDigit in validRomanDigits)) {
                throw ValidationErrorException("Both numbers must be either Arabic or Roman.")
            }
            isRomanDigit = true
        } catch(_: RuntimeException) {
            throw ValidationErrorException("Invalid input.")
        }
    }

    override fun isRoman(): Boolean {
        return isRomanDigit
    }
}