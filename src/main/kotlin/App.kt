package com.github.kzfor.test.caluclator

import com.github.kzfor.test.caluclator.calculator.Calculator
import com.github.kzfor.test.caluclator.calculator.CalculatorImpl
import com.github.kzfor.test.caluclator.calculator.Operators
import com.github.kzfor.test.caluclator.calculator.RomanCalculator
import com.github.kzfor.test.caluclator.converters.IntegerToRomanDigitConverter
import com.github.kzfor.test.caluclator.converters.RomanDigitToIntegerConverter
import com.github.kzfor.test.caluclator.parser.CalculatorInputParserImpl
import com.github.kzfor.test.caluclator.parser.CalculatorTokenSet
import com.github.kzfor.test.caluclator.validator.CalculatorTokenSetValidator
import com.github.kzfor.test.caluclator.validator.CalculatorTokenSetValidatorImpl
import java.util.*

class App {
    private val parser = CalculatorInputParserImpl()
    private val inputValidator = CalculatorTokenSetValidatorImpl()
    private val romanToIntConverter = RomanDigitToIntegerConverter()
    private val intToRomanDigitConverter = IntegerToRomanDigitConverter()

    fun run(input: String): String {
        val firstNumber: Int
        val secondNumber: Int
        val result: Int
        val tokenSet: CalculatorTokenSet = parser.parse(input)
        val calculator: Calculator

        inputValidator.validate(tokenSet)

        if (inputValidator.isRoman()) {
            calculator = RomanCalculator()
            firstNumber = romanToIntConverter.convert(tokenSet.getFirstRawDigit())
            secondNumber = romanToIntConverter.convert(tokenSet.getSecondRawDigit())
        } else {
            calculator = CalculatorImpl()
            firstNumber = tokenSet.getFirstRawDigit().toInt()
            secondNumber = tokenSet.getSecondRawDigit().toInt()
        }
        result = calculator.calculate(
            tokenSet.getOperator(),
            firstNumber,
            secondNumber
        )
        return if (inputValidator.isRoman()) {
            intToRomanDigitConverter.convert(result)
        } else {
            result.toString()
        }
    }
}

fun main() {
    val inputScanner = Scanner(System.`in`)
    val input = inputScanner.nextLine()
    val app = App()
    val appOutput = app.run(input)
    println(appOutput)
}