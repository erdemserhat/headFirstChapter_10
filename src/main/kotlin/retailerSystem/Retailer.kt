package retailerSystem

import contest.Pet

interface Retailer<T: Pet> {
    fun sell():T
}