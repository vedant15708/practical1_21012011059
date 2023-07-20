fun main(){
    print("Enter the number:")
    var number= readLine()!!.toInt()
    var ans=factorial(number)
    println("factorial:"+ans)
}

fun factorial(number:Int):Int{
 if (number==1 || number==0) {
     return 1
 }
    else{
        return number*factorial(number-1)
    }
}