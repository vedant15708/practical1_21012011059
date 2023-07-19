fun main(){
    print("Enter number:")
    var num = readLine()?.toInt()
    if (num != null)
        if(num % 2 == 0)
            println("$num is even")
        else
            println("$num is odd")
    else
        println("Invalid input")
}