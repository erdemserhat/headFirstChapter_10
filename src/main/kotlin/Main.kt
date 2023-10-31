import ticketSystem.*
import contest.*
import retailerSystem.CatRetailer
import retailerSystem.DogRetailer
import retailerSystem.Retailer

fun main(args:Array<String>){
       /*
       val catFuzz = Cat("Fuzz Lightyear")
       val catKatsu=Cat("Katsu")
       val fishFinny=Fish("Fish McGraw")

       val catContest=Contest<Cat>()
       catContest.addScore(catFuzz,50)
       catContest.addScore(catKatsu,45)
       val  topCat = catContest.getWinner()
       println("Cat contest winner is ${topCat?.name}")

       val petContest = Contest<Pet>()
       petContest.addScore(catFuzz,50)
       petContest.addScore(fishFinny,56)
       val topPet = petContest.getWinner()
       println("Cat contest winner is ${topPet?.name}")

       val person: Student = Student("Serhat","Erdem")
       val person2: Retired = Retired("Ahmet","Erdoğan")
       println(person)
       println(person2)
       val paymentProcessor: PaymentProcessor<Person, TicketType>
       paymentProcessor= PaymentProcessor(person, TicketType.LONG_DISTANCE)
       paymentProcessor.makePayment()
       val paymentProcessor2= PaymentProcessor(person2, TicketType.LONG_DISTANCE)
       paymentProcessor2.makePayment()
       println(person)
       println(person2)

        */

       val catRetailer:CatRetailer= CatRetailer()
       val catRetailer2= CatRetailer()
       catRetailer.sell()

       val dogRetailerx: Retailer<Dog> = DogRetailer()
       val catRetailerx: Retailer<Cat> = CatRetailer()


       val petRetailer:Retailer<Pet> = CatRetailer()






}
