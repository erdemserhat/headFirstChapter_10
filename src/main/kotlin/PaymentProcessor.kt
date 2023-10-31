class PaymentProcessor<T:Person, E:TicketType>(val person: T, val ticketType:E) {

    fun makePayment() {
        person.balance-=ticketType.price*person.dRate
        println("${person.name} ${person.surname} bought a ${ticketType.toString()}")
        println("processing fee = ${ticketType.price*person.dRate}")


    }
}