package demo

import java.math.BigInteger


fun main(args: Array<String>) {
    var result = BigInteger("70")

    var result1 = 0
    println(weidigui(10000, result1))
    println(jiecheng(result))
}

fun jiecheng(num: BigInteger): BigInteger {
    if (num == BigInteger.ONE) {
        return BigInteger.ONE
    } else {
        return num * jiecheng(num - BigInteger.ONE)
    }
}

/**
 * 尾递归
 */
tailrec fun weidigui(num: Int, result: Int): Int {
    println("第${num}次运算的结果,demo.result=${result}")
    if (num == 0) {
        return 1
    } else {
        return weidigui(num - 1, result + num)
    }
}