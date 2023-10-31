package ticketSystem

data class Student(
    override val name:String,
    override val surname:String,
    override var balance: Double=100.0,
    override val dRate:Double=0.8

): Person(name,surname,dRate) {
}