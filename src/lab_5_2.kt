// David Monge
// CSE 408
//  Lab 5 Number 2


// Displays age group based on the map. 0-20 Family, 60-100 senior,
// normal. Using "WHEN" statement
// Main Function
fun main(){
    println("Please enter age: ")       // Ask user input
    val age = Integer.valueOf(readLine())   // Creates age variable

    ageCategory(age)     // Calls the age function

}
// The age function that displays the category of age inputted.
fun ageCategory(x: Int ){
    when (x){
        // Displays the age in the correspondig category.
        in 0..20 -> println("$x is in Family age.")
        in 29..59 -> println("$x is in the Normal age.")
        in 60..100 -> println("$x is in Senior age.")
    }
}