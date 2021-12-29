package com.github.kzfor.test.caluclator.parser

import com.github.kzfor.test.caluclator.calculator.Operator
import com.github.kzfor.test.caluclator.calculator.Operators

class CalculatorTokenSetImpl(private val tokens: List<String>) : CalculatorTokenSet {
    override fun getOperator(): Operator {
        return Operators.fromSign(tokens[1].first())
    }

    override fun getFirstRawDigit(): String {
        return tokens[0]
    }

    override fun getSecondRawDigit(): String {
        return tokens[2]
    }

    override fun getParsedTokens(): List<String> {
        return tokens
    }
}