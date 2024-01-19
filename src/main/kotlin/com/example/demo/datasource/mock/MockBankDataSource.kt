package com.example.demo.datasource.mock

import com.example.demo.datasource.BankDataSource
import com.example.demo.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {
    private val banks = listOf(
        Bank("ABC", 1.0, 7),
        Bank("XYZ", 2.3, 1),
        Bank("123", 0.1, 12)
    )

    override fun retrieveBanks(): Collection<Bank> = banks
}