package com.example.joalarm.bank.application.service

import com.example.joalarm.bank.application.port.`in`.DepositUseCase
import com.example.joalarm.bank.application.port.`in`.WithdrawUseCase
import com.example.joalarm.bank.application.port.out.LoadAccountPort
import com.example.joalarm.bank.application.port.out.SaveAccountPort
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.math.BigDecimal

@Service
class BankAccountService(
    private val loadAccountPort: LoadAccountPort,
    private val saveAccountPort: SaveAccountPort
) : DepositUseCase, WithdrawUseCase {
    override fun deposit(id: Long, amount: BigDecimal) {
        val account = loadAccountPort.load(id)

        account.deposit(amount)

        saveAccountPort.save(account)
    }

    override fun withdraw(id: Long, amount: BigDecimal): Boolean {
        val account = loadAccountPort.load(id)

        val hasWithdrawn = account.withdraw(amount)

        if(hasWithdrawn) {
            saveAccountPort.save(account)
        }

        return hasWithdrawn
    }
}