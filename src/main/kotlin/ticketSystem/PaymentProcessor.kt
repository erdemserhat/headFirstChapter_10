package ticketSystem

/**
 * This class represents a ticketSystem.PaymentProcessor that is parameterized with generics.
 *
 * @param T The type representing a person (should be a class or interface).
 * @param E The type representing a ticket type (should be a class or interface).
 * @property person The person making the payment.
 * @property ticketType The type of the ticket for which the payment is made.
 */
class PaymentProcessor<T : Person, E : TicketType>(val person: T, val ticketType: E) {

    /**
     * This function performs the payment process.
     * It deducts the ticket price from the person's balance after applying a discount rate.
     */
    fun makePayment() {
        // Deduct the ticket price after applying the discount rate from the person's balance
        person.balance -= ticketType.price * person.dRate

        // Print a message about the purchase
        println("${person.name} ${person.surname} bought a ${ticketType.toString()}")

        // Print the processing fee
        println("Processing fee = ${ticketType.price * person.dRate}")
    }
}
