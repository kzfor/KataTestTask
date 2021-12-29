package com.github.kzfor.test.caluclator.calculator.exceptions

/**
 * Exception for the com.github.kzfor.test.caluclator.calculator.Operators class.
 * Occurs when an operator that is not supported by the class has been passed
 * to the fromSign method.
 *
 * @see com.github.kzfor.test.caluclator.calculator.Operators
 */
class NotSupportedOperationException(override val message: String) : IllegalArgumentException() {
}