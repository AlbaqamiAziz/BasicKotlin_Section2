import java.lang.Exception

fun main() {

    fun checkNum(): Int{
        try {
            var firstNumber = readLine()!!.toInt();
            return firstNumber
        } catch (e: Exception){
            return 0
        }

    }

    fun sum(firstNumber: Int, secondNumber: Int): Int{
        return firstNumber + secondNumber
    }

    do {
        print("Enter your first number: ")
        var firstNumber = checkNum();
        print("Enter your second number: ")
        var secondNumber = checkNum();
        val result = sum(firstNumber,secondNumber)
        println("$firstNumber + $secondNumber = $result")

        print("Would you like to add more numbers? (Y/N) >> ")
    } while(readLine() == "Y")

}