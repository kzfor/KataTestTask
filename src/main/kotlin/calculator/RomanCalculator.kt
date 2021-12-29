package com.github.kzfor.test.caluclator.calculator

import com.github.kzfor.test.caluclator.calculator.exceptions.UnsupportedResultException

/**
 * Roman calculator can't deal with 0 and negative numbers
 */
class RomanCalculator : CalculatorImpl() {
    override fun calculate(operator: Operator, x: Int, y: Int): Int {
        val result: Int = super.calculate(operator, x, y)
        if (result <= 0) {
            throw UnsupportedResultException("Number $result cannot be represented as Roman")
        }
        return result
    }
}