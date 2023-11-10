package com.example.joalarm.bank.adapter.out.persistence

import org.springframework.data.jpa.repository.JpaRepository

interface BankAccountSpringDataRepository : JpaRepository<BankAccountEntity, Long> {
}