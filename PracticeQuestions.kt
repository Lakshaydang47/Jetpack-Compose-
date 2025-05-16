fun main() {
    println("Solution of 1st ques")
    Ques_1()
    println("\nSolution of 2nd ques")
    Ques_2()
    println("\nSolution of 3rd ques")
    Ques_3()
}

// 1...Print messages
// Tell your friends what you learned in this pathway.

// Can you write a main() function that prints these messages on four separate lines?

// Use the val keyword when the value doesn't change. 
// Use the var keyword when the value can change.
// When you define a function, you define the parameters that can be passed to it. 
// When you call a function, you pass arguments for the parameters.

fun Ques_1() {
    println("Use the val keyword when the value doesn't change.")
    println("Use the var keyword when the value can change.")
    println("When you define a function, you define the parameters that can be passed to it.")
    println("When you call a function, you pass arguments for the parameters.")
}

// 2... Fix compile error
// This program prints a message that notifies the user that they received a chat message from a friend.


// fun main() { 
//     println("New chat message from a friend'}
// }

fun Ques_2(){
    println("New chat message from a friend")
}

// 3...String templates
// This program informs users about the upcoming promotional sale on a particular item. It has a string template, which relies on the discountPercentage variable for the percent discount and the item variable for the item on sale. However, there are compilation errors in the code.


// fun main() {
//     val discountPercentage: Int = 0
//     val offer: String = ""
//     val item = "Google Chromecast"
//     discountPercentage = 20
//     offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
    
//     println(offer)
// }

fun Ques_3(){
    val discountPercentage: Int = 20
    val item = "Google Chromecast"
    val offer: String = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
    
    println(offer)
}

