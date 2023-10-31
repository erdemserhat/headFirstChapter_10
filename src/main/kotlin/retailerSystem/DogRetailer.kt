package retailerSystem

import contest.Dog

class DogRetailer:Retailer<Dog> {
    override fun sell(): Dog {
        println("Sell Dog")
        return Dog("")
    }
}