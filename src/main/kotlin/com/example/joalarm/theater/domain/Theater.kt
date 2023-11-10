package com.example.joalarm.theater.domain

class Theater(
    private val ticketSeller: TicketSeller
) {
    fun enter(audience: Audience) {
        val ticket: Ticket = ticketSeller.ticketOffice.ticket

        if(audience.bag.hasInvitation()) {
            audience.bag.ticket = ticket
        } else {
            audience.bag.minusAmount(ticket.fee)
            ticketSeller.ticketOffice.plusAmount(ticket.fee)
            audience.bag.ticket = ticket
        }
    }
}