package com.example.joalarm.bank.adapter.out.persistence

import com.example.joalarm.bank.domain.BankAccount
import org.springframework.stereotype.Component

@Component
class BankAccountMapper {
    fun toDomain(entity: BankAccountEntity): BankAccount =
        BankAccount(
            id = entity.id,
            balance = entity.balance
        )

    fun toEntity(domain: BankAccount): BankAccountEntity =
        BankAccountEntity(
            id = domain.id,
            balance = domain.balance
        )
}