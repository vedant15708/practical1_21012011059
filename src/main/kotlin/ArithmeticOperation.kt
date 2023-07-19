fun ArithmeticOperation(operator:Char,operand1:Double,operand2:Double):Double{
    return when (operator){
        '+' -> operand1+operand2
        '-' -> operand1-operand2
        '*' -> operand1*operand2
        '/' -> operand1/operand2
        else -> throw IllegalArgumentException("Error: Invalid operator.")
    }
}
fun main(){
    print("Enter the first number:")
    val operand1 = readLine()!!.toDouble()
    print("Enter the second number:")
    val operand2 = readLine()!!.toDouble()
    print("Enter the operator(+,-,*,/):")
    val operator = readLine()!![0]
    val result = ArithmeticOperation(operator,operand1,operand2)
    println("Result:$result")
}