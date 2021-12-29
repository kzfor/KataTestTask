package com.github.kzfor.test.caluclator.calculator

/**
 * Simple implementation of the calculator interface.
 * The class is open to inheritance to create more special calculators.
 *
 * @see Calculator
 */
open class CalculatorImpl: Calculator {
    override fun calculate(operator: Operator, x: Int, y: Int): Int {
        return operator.apply(x, y)
    }
}