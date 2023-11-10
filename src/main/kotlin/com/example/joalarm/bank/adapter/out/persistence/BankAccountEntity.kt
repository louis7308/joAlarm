package com.example.joalarm.bank.adapter.out.persistence

import jakarta.persistence.*
import java.math.BigDecimal

@Entity
@Table(name = "account")
class BankAccountEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val balance: BigDecimal
) {
}