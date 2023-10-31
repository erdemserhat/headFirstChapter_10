package ticketSystem

abstract class Person(
    open val name:String,
    open val surname:String,
    open var balance: Double =100.0,
    open val dRate:Double=1.0) {
}