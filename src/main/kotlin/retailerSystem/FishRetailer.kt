package retailerSystem

import contest.Fish

class FishRetailer:Retailer<Fish> {
    override fun sell(): Fish {
        println("Sell Fish")
        return Fish("")
    }
}