package com.example.demo.datasource.mock

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class MockBankDataSourceTest {
    private val mockBankDataSource = MockBankDataSource()

    @Test
    fun `should provide a collections of banks`() {
        val banks = mockBankDataSource.retrieveBanks()
        Assertions.assertThat(banks).isNotEmpty
        Assertions.assertThat(banks.size).isGreaterThanOrEqualTo(3)
    }

    @Test
    fun `should provide mock data`() {
        val banks = mockBankDataSource.retrieveBanks()
        Assertions.assertThat(banks).allMatch {it.accountNumber.isNotBlank()}
        Assertions.assertThat(banks).anyMatch {it.trust != 0.0}
        Assertions.assertThat(banks).allMatch {it.transactionFee > 0}
    }
}