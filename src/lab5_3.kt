// David Monge
// CSE 408
// Lab 5 Number 3

// main function
fun main (){
    var cardPoints = 7_000
    val cardLevel: String
    // TODO: replace this if with a when
    // try to use ranges!

    when (cardPoints){
        in 0..999 -> cardLevel = "Pearl"
        in 1000..4999 -> cardLevel = "Silver"
        in 5000..9999 -> cardLevel = "Gold"
        else -> cardLevel = "Platinum "
    }
    val plural = if(cardPoints > 1 || cardPoints == 0) "s" else ""
    println("You have $cardPoints point$plural and are at the $cardLevel level.")
}