package contest

class Contest<T:Pet>() {
    val scoresMap:MutableMap<T,Int> = mutableMapOf()

    fun addScore(t:T,score:Int){
        scoresMap[t]=score
    }
    fun getWinner():T?{
        var winner: T? =null
        val highScore=scoresMap.values.max()
        for((t,score) in scoresMap){
            if(score==highScore) winner=t
        }
        return winner
    }

}