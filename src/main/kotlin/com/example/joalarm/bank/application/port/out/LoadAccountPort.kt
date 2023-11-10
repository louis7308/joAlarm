package com.example.joalarm.bank.application.port.out

import com.example.joalarm.bank.domain.BankAccount

// 입출급을 위하여 데이터베이스와 상호작용하기 위한 Output Port
interface LoadAccountPort {
    fun load(id: Long): BankAccount
}