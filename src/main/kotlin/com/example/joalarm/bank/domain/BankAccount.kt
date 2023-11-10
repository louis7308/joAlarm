package com.example.joalarm.bank.domain

import java.math.BigDecimal

//  헥사고날 아키텍처의 가장 가운데 있는 외부를 향한 의존성이 전혀 없는 도메인 모델
// Spring 어노테이션이 없는 순수 Java POJO(Plan Old Java Object) 입니다.

// 현재 BankAccount 도메인 모델에는 출금, 입금이라는 비즈니스 규칙이 담겨있다.
data class BankAccount(
    val id: Long,
    var balance: BigDecimal
) {
    fun withdraw(amount: BigDecimal): Boolean { // 출급
        if(balance < amount) {
            return false
        }

        balance = balance.subtract(amount)
        return true
    }


    fun deposit(amount: BigDecimal) { // 입금
        balance = balance.add(amount)
    }


}