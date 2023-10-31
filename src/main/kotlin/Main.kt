fun main(args:Array<String>){
       val catFuzz = Cat("Fuzz Lightyear")
       val catKatsu=Cat("Katsu")
       val fishFinny=Fish("Fish McGraw")

       val catContest=Contest<Cat>()
       catContest.addScore(catFuzz,50)
       catContest.addScore(catKatsu,45)
       val  topCat = catContest.getWinner().first()
       println("Cat contest winner is ${topCat.name}")

       val petContest = Contest<Pet>()
       petContest.addScore(catFuzz,50)
       petContest.addScore(fishFinny,56)
       val topPet = petContest.getWinner().first()
       println("Cat contest winner is ${topPet.name}")

       val person:Student=Student("Serhat","Erdem")
       val person2:Retired=Retired("Ahmet","Erdoğan")
       println(person)
       println(person2)
       val paymentProcessor:PaymentProcessor<Person,TicketType>
       paymentProcessor=PaymentProcessor(person,TicketType.LONG_DISTANCE)
       paymentProcessor.makePayment()
       val paymentProcessor2=PaymentProcessor(person2,TicketType.LONG_DISTANCE)
       paymentProcessor2.makePayment()
       println(person)
       println(person2)



}

abstract  class Pet(var name:String)
class Cat(name:String):Pet(name)
class Dog(name:String):Pet(name)
class Fish(name:String):Pet(name)

class Contest <T :Pet> {
       private val scores: MutableMap<T,Int> = mutableMapOf()

       fun addScore(t:T, score:Int=0){
              if(score>=0) scores[t] = score
       }

       fun getWinner():MutableSet<T>{
              val winners:MutableSet<T> = mutableSetOf()
              val highScore=scores.values.max()
              for((t, score) in scores){
                     if(score==highScore) winners.add(t)
              }
              return winners
       }
}