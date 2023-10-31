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
       petRetailer.sell()
       println()

       //Okey but what is the goal of covariance??

       /**
        * Covariance is a concept that allows more specific subtypes
        * to be used in place of more general supertypes.
        * This can be especially useful when working with generic types,
        * making your code more flexible and user-friendly.
        * Here are some comments about the purpose and
        * benefits of covariance:
        */

       /**
        * 1. Greater General Use:
        * Covariance allows you to place a more specific type on top of
        * a more general type. This makes your code more flexible
        * and supports a wider range of types. This is particularly
        * important for data structures like collections.
        * For example, you can assign a 'List<Cat>' type to a
        * 'List<Pet>' type.
        */

       /**
        * 2. User-Friendly:
        * Covariance makes APIs easier to use, reducing the need
        * for type conversions and improving usability.
        * It helps in writing more concise and user-friendly code.
        */

       /**
        * 3. Reducing Pointer Problems:
        * Covariance reduces pointer problems, such as type
        * incompatibility. It leads to safer and error-free code.
        * It ensures that you can work with different subtypes of a
        * common supertype more seamlessly.
        */

       /**
        * While covariance is a powerful feature, it should be
        * used carefully, as misuse can lead to runtime errors.
        * Understanding type parameters and variance rules is
        * essential when working with covariance.
        */







}
