package com.github.kzfor.test.caluclator.calculator

/**
 * Interface for any calculator implementations.
 * We consider a calculator to be anything that can apply an operator to
 * two integers and return the result
 */
interface Calculator {
    /**
     * Takes two integers, performs an arithmetic action and returns the result
     * @param operator The operator we want to apply to following arguments
     * @param x The first integer to which the operator will be applied
     * @param y The second integer to which the operator will be applied
     * @return Result of applying the operator to two arguments
     */
    fun calculate(operator: Operator, x: Int, y: Int): Int
}