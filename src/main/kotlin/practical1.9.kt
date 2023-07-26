fun main() {
    var arr_list = ArrayList<Int>()
    for(i in 0..5)
    {
        print("arr[$i]: ")
        arr_list.add(readLine()!!.toInt())
    }
    var maxNum:Int
    maxNum=arr_list[0]
    for (i in arr_list) {
        if(maxNum<i)
        {
            maxNum=i
        }
    }
    println("Largest number is: $maxNum")
}