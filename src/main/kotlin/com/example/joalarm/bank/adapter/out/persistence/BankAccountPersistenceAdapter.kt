package com.example.joalarm.bank.adapter.out.persistence

import com.example.joalarm.bank.application.port.out.LoadAccountPort
import com.example.joalarm.bank.application.port.out.SaveAccountPort
import com.example.joalarm.bank.domain.BankAccount
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Repository

@Repository
class BankAccountPersistenceAdapter(
    private val repository: BankAccountSpringDataRepository,
    private val bankAccountMapper: BankAccountMapper
) : LoadAccountPort, SaveAccountPort {
    override fun load(id: Long): BankAccount {
        val entity = repository.findByIdOrNull(id)
            ?: throw NoSuchElementException()

        return bankAccountMapper.toDomain(entity)
    }

    override fun save(bankAccount: BankAccount) {
        val entity = bankAccountMapper.toEntity(bankAccount)

        repository.save(entity)
    }
}