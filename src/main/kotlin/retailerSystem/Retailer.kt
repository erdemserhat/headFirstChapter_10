package retailerSystem

import contest.Pet

interface Retailer<out T: Pet> {
    fun sell():T
}