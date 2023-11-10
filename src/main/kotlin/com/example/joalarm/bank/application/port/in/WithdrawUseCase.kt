package com.example.joalarm.bank.application.port.`in`

import java.math.BigDecimal

// 출금 UseCase 인터페이스
interface WithdrawUseCase {
    fun withdraw(id: Long, amount: BigDecimal): Boolean
}