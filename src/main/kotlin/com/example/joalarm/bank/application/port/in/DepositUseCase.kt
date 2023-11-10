package com.example.joalarm.bank.application.port.`in`

import java.math.BigDecimal

// 입금 UseCase 인터페이스
interface DepositUseCase {
    fun deposit(id: Long, amount: BigDecimal)
}