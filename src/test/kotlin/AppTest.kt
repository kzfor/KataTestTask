import com.github.kzfor.test.caluclator.App
import com.github.kzfor.test.caluclator.calculator.exceptions.NotSupportedOperationException
import com.github.kzfor.test.caluclator.calculator.exceptions.UnsupportedResultException
import com.github.kzfor.test.caluclator.validator.exceptions.ValidationErrorException
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import kotlin.test.assertFailsWith

internal class AppTest {
    private val app = App()

    @Test
    fun `Invalid input test`() {
        assertFailsWith<ValidationErrorException> {
            app.run("2 + V")
        }
        assertFailsWith<ValidationErrorException> {
            app.run("2+ 2")
        }
        assertFailsWith<ValidationErrorException> {
            app.run("2+2")
        }
        assertFailsWith<ValidationErrorException> {
            app.run("V - 2")
        }
        assertFailsWith<NotSupportedOperationException> {
            app.run("10 % 2")
        }
        assertFailsWith<ValidationErrorException> {
            app.run("11 + 2")
        }
        assertFailsWith<ValidationErrorException> {
            app.run("LX + II")
        }
    }

    @Test
    fun `Arabic numbers, valid input and positive numbers without zeroes`() {
        assertEquals(app.run("1 + 1"), "2")
        assertEquals(app.run("2 * 3"), "6")
        assertEquals(app.run("7 / 3"), "2")
        assertEquals(app.run("7 - 5"), "2")
    }

    @Test
    fun `Arabic numbers, valid input and positive numbers with zeroes`() {
        assertFailsWith<ArithmeticException> { app.run("2 / 0") }
        assertEquals(app.run("2 * 0"), "0")
        assertEquals(app.run("2 + 0"), "2")
        assertEquals(app.run("2 - 0"), "2")
    }

    @Test
    fun `Arabic numbers, valid input and negative numbers`() {
        assertEquals(app.run("2 - -5"), "7")
        assertEquals(app.run("2 + -5"), "-3")
        assertEquals(app.run("7 * -1"), "-7")
        assertEquals(app.run("6 / -2"), "-3")
    }

    @Test
    fun `Roman digits, valid input`() {
        assertEquals(app.run("VI / III"), "II")
        assertEquals(app.run("VIII - V"), "III")
        assertEquals(app.run("X + VIII"), "XVIII")
        assertEquals(app.run("IX * VIII"), "LXXII")
    }

    @Test
    fun `Roman digits, valid input but invalid results`() {
        assertFailsWith<UnsupportedResultException> {
            app.run("II - V")
        }
        assertFailsWith<UnsupportedResultException> {
            app.run("V - V")
        }
    }
}
