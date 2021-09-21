import java.lang.Exception

fun main() {
    fun cal(num1: Float, operator: Char, num2: Float) : Float{
        return when{
            operator == '+' -> num1 + num2
            operator == '-' -> num1 - num2
            operator == '*' -> num1 * num2
            else -> num1 / num2
        }
    }

    fun checkNumber(number: String): Boolean {
        try{
            number.toFloat()
            return true
        } catch (e: Exception) {
            return false
        }
    }

    while (true){
        print("Enter first number: ")
        val firstNumber = readLine()
        if(checkNumber(firstNumber!!)){
            println(firstNumber)
            print("Enter operator: ")
            val oper = readLine()
            if(oper=="+"||oper=="-"||oper=="*"||oper=="/") {
                val ch = oper[0]
                println(firstNumber + oper)
                print("Enter second number: ")
                val secondNumber = readLine()
                if (checkNumber(secondNumber!!)) {
                    if (oper == "/" && secondNumber.toFloat() == 0f) {
                        println("You cannot divide by 0")
                    } else {
                        val result = cal(firstNumber!!.toFloat(), ch, secondNumber.toFloat())
                        println("$firstNumber $oper $secondNumber = $result")
                        break
                    }
                }
            } else {
                println("Please enter valid operation")
            }
        } else {
            println("Please enter numbers only")}
    }
}
