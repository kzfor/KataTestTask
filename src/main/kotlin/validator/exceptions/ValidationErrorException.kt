package com.github.kzfor.test.caluclator.validator.exceptions

/**
 * Exception occurs in CalculatorTokenSetValidatorImpl
 * @see CalculatorTokenSetValidatorImpl
 */
class ValidationErrorException(override val message: String) : IllegalArgumentException() {
}