package com.github.kzfor.test.caluclator.validator

import com.github.kzfor.test.caluclator.parser.CalculatorTokenSet

interface CalculatorTokenSetValidator: Validator<CalculatorTokenSet> {
    fun isRoman(): Boolean
}