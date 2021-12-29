package com.github.kzfor.test.caluclator.parser

import com.github.kzfor.test.caluclator.calculator.Operator

/**
 * Specified token set for calculator
 * It contains methods to get all the necessary data
 */
interface CalculatorTokenSet : TokenSet<String>  {
    fun getOperator(): Operator
    fun getFirstRawDigit(): String
    fun getSecondRawDigit(): String
}