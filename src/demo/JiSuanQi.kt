package demo

fun main(args: Array<String>) {
    var a: Int = 5
    var b: Int = 2

    println(jia(a, b))
    println(jian(a, b))
    println(cheng(a, b))
    println(chu(a, b))
    println(cheak(80))

}


fun jia(a: Int, b: Int): Int {
    return a + b
}

fun jian(a: Int, b: Int): Int {
    return a - b
}

fun cheng(a: Int, b: Int): Int {
    return a * b
}

fun chu(a: Int, b: Int): Int {
    return a / b
}

fun cheak(age: Int): Boolean {
    if (age > 20) return true else return false
}