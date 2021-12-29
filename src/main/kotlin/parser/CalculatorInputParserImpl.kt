package com.github.kzfor.test.caluclator.parser

class CalculatorInputParserImpl : CalculatorInputParser {
    override fun parse(obj: String): CalculatorTokenSet {
        return CalculatorTokenSetImpl(obj.split(" "))
    }
}