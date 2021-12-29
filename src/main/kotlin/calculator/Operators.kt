package com.github.kzfor.test.caluclator.calculator

import com.github.kzfor.test.caluclator.calculator.exceptions.NotSupportedOperationException

/**
 * Class with static methods which work with Operator
 *
 * @see Operator
 */
class Operators {
    companion object {
        private val signOperatorMap: Map<Char, Operator> = mapOf(
            '+' to Operator {x: Int, y: Int -> x + y },
            '-' to Operator {x: Int, y: Int -> x - y},
            '*' to Operator {x: Int, y: Int -> x * y},
            '/' to Operator {x: Int, y: Int -> x / y}
        )

        /**
         * Returns an operator by its sign.
         * @param sign Sign of the operator
         * @return The operator corresponding to the sign
         */
        fun fromSign(sign: Char): Operator {
            if (sign in signOperatorMap.keys) {
                return signOperatorMap[sign]!!
            } else {
                throw NotSupportedOperationException("Operation $sign is not supported!")
            }
        }
    }
}