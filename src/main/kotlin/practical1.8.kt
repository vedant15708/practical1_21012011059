import java.util.Arrays
fun main(){
    print("Using arrayof() method:")
    var arr1 = arrayOf(17,48,59,72,30)
    println(Arrays.deepToString(arr1))
    print("Using Array<>() method:")
    var arr2 = Array<Int>(5){0}
    println(Arrays.deepToString(arr2))
    print("Using Array<>() and lambda function:")
    val arr3 = Array(5) { index -> (index + 1) * 5 }
    println(Arrays.deepToString(arr3))
    print("Using IntArray() method:")
    var arr4 = IntArray(5)
    arr4[0]=21
    arr4[1]=57
    arr4[2]=36
    arr4[3]=80
    arr4[4]=66
    for(i in arr4){
        print(" $i")
    }
    print("\nUsing intArrayOf() method:")
    var arr5 = intArrayOf(45,77,30,5,4)
    for(i in arr5){
        print(" $i")
    }
    print("\n2D array using arrayof() and intArrayof():")
    val arr6 = arrayOf(
        intArrayOf(1, 2),
        intArrayOf(3, 4),
        intArrayOf(5, 6)
    )
    println(Arrays.deepToString(arr6))
}