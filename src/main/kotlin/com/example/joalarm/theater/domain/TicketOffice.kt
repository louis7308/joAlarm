package com.example.joalarm.theater.domain

class TicketOffice(
    var amount: Int,
    val ticket: Ticket
) {
    fun minusAmount(money: Int) {
        if(amount < money) {
            println("현재 티켓 사무소에 거슬러 줄 수 있는 돈이 없습니다.")
            return
        }

        amount -= money
    }

    fun plusAmount(money: Int) {
        amount += money
    }
}