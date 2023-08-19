fun arithmetic(n1:Int,n2:Int,n3:Int)
{
    var result:Int
    result = n1 + n2+n3
    println("Addition of $n1,$n2,$n3 is $result")
    result = n1 - n2-n3
    println("Substraction of $n1,$n2,$n3 is $result")
    result = n1 * n2*n3
    println("Multiplication of $n1,$n2,$n3 is $result")
    result = n2 /n1
    println("Division of $n2,$n1 is $result")
}
fun main()
{
    arithmetic(125,5353,-245)
}