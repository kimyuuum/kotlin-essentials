package chapter19

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.math.BigDecimal

class MoneyTest {
    @Test
    fun testMoney() {
        val money1 = Money.eur("10.00")
        val money2 = Money.eur("29.99")
        assertEquals(Money.eur("39.99"), money1 + money2)
        assertEquals(Money.eur("19.99"), money2 - money1)
        assertEquals(Money.eur("-10.00"), -Money.eur("10.00"))
        assertEquals(Money.eur("30.00"), Money.eur("10.00") * 3)
    }

    @Test
    fun testMoneyType() {
        val money1 = Money.eur("10.00")
        val money2 = Money(BigDecimal("99.99"), Currency.GBP)
        assertThrows<IllegalArgumentException> {
            money1 + money2
        }
    }
}
