package com.github.kzfor.test.caluclator.calculator.exceptions

/**
 * Occurs in RomanCalculator when result <= 0
 */
class UnsupportedResultException(override val message: String) : Exception() {
}