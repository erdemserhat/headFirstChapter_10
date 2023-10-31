package ticketSystem

data class Retired(
    override val name:String,
    override val  surname:String,
    override var balance: Double=100.0,
    override val dRate: Double=0.90

): Person(name,surname, dRate) {
}