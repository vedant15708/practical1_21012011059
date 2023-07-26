import javax.print.attribute.standard.MediaSize.Other
class Matrix(var data: Array<IntArray>) {
    val rows: Int = data.size
    val columns: Int = data[0].size
    operator fun plus(other: Matrix): Matrix {
        val resultData = Array(rows) {IntArray(columns)}
        for (i in 0 until rows) {
            for (j in 0 until columns) {
                resultData[i][j] = data[i][j] + other.data[i][j]
            }
        }
        return Matrix(resultData)
    }
    operator fun minus(other: Matrix): Matrix {
        val resultData = Array(rows) {IntArray(columns)}
        for (i in 0 until rows) {
            for (j in 0 until columns) {
                resultData[i][j] = data[i][j] - other.data[i][j]
            }
        }
        return Matrix(resultData)
    }
    operator fun times(other: Matrix): Matrix {
        val resultData = Array(rows) {IntArray(other.columns) {0} }
        for (i in 0 until rows) {
            for (j in 0 until other.columns) {
                for (k in 0 until columns)
                    resultData[i][j] += data[i][k] * other.data[k][j]
            }
        }
        return Matrix(resultData)
    }
    override fun toString(): String {
        val sb = StringBuilder()
        for (i in 0 until rows) {
            for (j in 0 until columns) {
                sb.append("${data[i][j]}\t")
            }
            sb.append("\n")
        }
        return sb.toString()
    }
}
fun main() {
    val firstMatrix = Matrix(arrayOf(intArrayOf(3, -2, 5), intArrayOf(3, 0, 4)))
    val secondMatrix = Matrix(arrayOf(intArrayOf(2, 3), intArrayOf(-9, 0), intArrayOf(0, 4)))
    val secondMatrix1 = Matrix(arrayOf(intArrayOf(6, 3), intArrayOf(9, 0), intArrayOf(5, 4)))
    println("********** Addition **********")
    println("Matrix : 1 ")
    println(secondMatrix1)
    println("Matrix : 2 ")
    println(secondMatrix)
    val thirdMatrix = secondMatrix1 + secondMatrix
    println("Addition : ")
    println(thirdMatrix)
    println("********** Subtraction **********")
    println("Matrix : 1 ")
    println(secondMatrix1)
    println("Matrix : 2 ")
    println(secondMatrix)
    val subtractMatrix = secondMatrix1 - secondMatrix
    println("Subtraction : ")
    println(subtractMatrix)
    println("********** Multiplication **********")
    println("Matrix : 1 ")
    println(firstMatrix)
    println("Matrix : 2 ")
    println(secondMatrix)
    val multiplication = firstMatrix * secondMatrix
    println("Multiplication : ")
    println(multiplication)
}
