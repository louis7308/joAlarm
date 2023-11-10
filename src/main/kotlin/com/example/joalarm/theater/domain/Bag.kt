package com.example.joalarm.theater.domain

class Bag(
    private var amount: Int,
    private val invitation: Invitation, // 초대 자격
    var ticket: Ticket? = null
) {

    fun hasInvitation(): Boolean { // 초대 자격 검증
        return invitation.isWhen
    }

    fun hasTicket(): Boolean {
        return ticket != null
    }


    fun minusAmount(money: Int) {
        if(amount < money) {
            println("현재 가진 돈이 더 적습니다.")
            return
        }

        amount -= money
    }

    fun plusAmount(money: Int) {
        amount += money
    }


}