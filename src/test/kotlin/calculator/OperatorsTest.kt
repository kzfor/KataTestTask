package calculator

import com.github.kzfor.test.caluclator.calculator.Operator
import com.github.kzfor.test.caluclator.calculator.Operators
import com.github.kzfor.test.caluclator.calculator.exceptions.NotSupportedOperationException
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow
import kotlin.test.assertFailsWith

internal class OperatorsTest {
    @Test
    fun `Try to get invalid operators`() {
        assertFailsWith<NotSupportedOperationException>(block = {
            Operators.fromSign('%')
            Operators.fromSign('!')
            Operators.fromSign('1')
            Operators.fromSign('s')
            Operators.fromSign('\\')
        })
    }

    @Test
    fun `Try to get valid operators`() {
        assertDoesNotThrow {
            Operators.fromSign('+')
            Operators.fromSign('-')
            Operators.fromSign('*')
            Operators.fromSign('/')
        }
    }
}