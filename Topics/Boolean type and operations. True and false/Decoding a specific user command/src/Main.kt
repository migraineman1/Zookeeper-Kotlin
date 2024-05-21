// imports here
import java.util.*

// The "Scanner" class is used to get user input for primitive types like int, double, etc.
val scanner = Scanner(System.`in`)

/**
 * Read the line provided by the user
*/
fun readInput(): String {
    return scanner.nextLine()
}

/**
 * Evaluate the command 'RUN silent' and return 'true' or 'false' accordingly.
 * Please write your boolean logic here to solve the problem.
 */
fun evaluateCommand(input: String): Boolean {
    // Write your code here!
    val run, command = input.slice(" ")
    if (command == " silent") result = true
    else result == false
    return result
    throw NotImplementedError("Not implemented yet!")
}

/**
 * The main function, answer to the problem must be printed from this function
 */
fun main() {
    val command = readInput()
    val result = evaluateCommand(command)
    println(result)
}
