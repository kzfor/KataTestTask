package com.github.kzfor.test.caluclator.calculator

/**
 * Interface for arithmetic operators.
 * Arithmetic operators are used in calculators.
 *
 * @see Calculator
 */
fun interface Operator {
    /**
     * Applies operator to the following arguments
     * @param x The first integer to which the operator will be applied
     * @param y The second integer to which the operator will be applied
     * @return An integer, the result of applying the operator to two arguments
     */
    fun apply(x: Int, y: Int): Int
}