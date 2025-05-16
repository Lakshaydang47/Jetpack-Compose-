fun main() {
    println("Solution of 1st ques")
    Ques_1()
    println("\nSolution of 2nd ques")
    Ques_2()
    println("\nSolution of 3rd ques")
    Ques_3()
    println("\nSolution of 4th ques")
    Ques_4()
    println("\nSolution of 5th ques")
    Ques_5()
    println("\nSolution of 6th ques")
    Ques_6()
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

// 4...String concatenation
// This program displays the total party size. There are adults and kids at the party. The numberOfAdults variable holds the number of adults at the party and the numberOfKids variable holds the number of kids.


// fun main() {
//     val numberOfAdults = "20"
//     val numberOfKids = "30"
//     val total = numberOfAdults + numberOfKids
//     println("The total party size is: $total")
// }

fun Ques_4() {
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}

// 5... Message formatting
// fun main() {
//     val baseSalary = 5000
//     val bonusAmount = 1000
//     val totalSalary = "$baseSalary + $bonusAmount"
//     println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
// }
// Can you figure out the output of this code before you run it in Kotlin Playground?
// When you run the code in Kotlin Playground, does it print the output that you expected?

fun Ques_5() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = baseSalary + bonusAmount
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}

//  6...Implement basic math operations
// In this exercise, you write a program that performs basic math operations and prints the output.

// Step 1
// This main() function contains one compile error:


// fun main() {
//     val firstNumber = 10
//     val secondNumber = 5
    
//     println("$firstNumber + $secondNumber = $result")
// }
// Can you fix the error so that the program prints this output?

// 10 + 5 = 15
// Step 2
// The code works, but the logic for adding two numbers is located within the result 
// variable, making your code less flexible to reuse. Instead, you can extract the
//  addition operation into an add() function so that the code is reusable. 
//  To do this, update your code with the code listed below. Notice that the code 
//  now introduces a new val called thirdNumber and prints the result of this new variable with firstNumber.

fun Ques_6() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8
    
    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    val result2 = sub(firstNumber, secondNumber)
    val anotherResult2 = sub(firstNumber, thirdNumber)
    
    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")

    println("$firstNumber - $secondNumber = $result2")
    println("$firstNumber - $thirdNumber = $anotherResult2")
}

// Define add() function below this line
fun add(a: Int, b: Int): Int {
    val sum = a+b
    return sum
}

// Define sub() function below this line
fun sub(a: Int, b: Int): Int {
    val diff = a-b
    return diff
}

/*Solution of 1st ques
Use the val keyword when the value doesn't change.
Use the var keyword when the value can change.
When you define a function, you define the parameters that can be passed to it.
When you call a function, you pass arguments for the parameters.

Solution of 2nd ques
New chat message from a friend

Solution of 3rd ques
Sale - Up to 20% discount on Google Chromecast! Hurry up!

Solution of 4th ques
The total party size is: 50

Solution of 5th ques
Congratulations for your bonus! You will receive a total of 6000 (additional bonus).

Solution of 6th ques
10 + 5 = 15
10 + 8 = 18
10 - 5 = 5
10 - 8 = 2 */
