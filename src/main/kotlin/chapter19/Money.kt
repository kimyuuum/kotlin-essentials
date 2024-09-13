package chapter19

import java.math.BigDecimal

data class Money(
    val amount: BigDecimal,
    val currency: Currency,
) {
    operator fun plus(plusMoney: Money): Money {
        require(this.currency == plusMoney.currency)

        return Money(
            this.amount + plusMoney.amount,
            this.currency,
        )
    }

    operator fun minus(minusMoney: Money): Money {
        require(this.currency == minusMoney.currency)

        return Money(
            this.amount - minusMoney.amount,
            this.currency,
        )
    }

    operator fun unaryMinus(): Money {
        return Money(-this.amount, this.currency)
    }

    operator fun times(other: Int): Money =
        Money(
            this.amount * other.toBigDecimal(),
            this.currency,
        )

    companion object {
        fun eur(amount: String) =
            Money(
                BigDecimal(amount),
                Currency.EUR,
            )
    }
}

enum class Currency {
    EUR,
    USD,
    GBP,
    RUB,
}
