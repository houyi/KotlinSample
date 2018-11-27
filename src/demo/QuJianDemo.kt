package demo

fun main(args: Array<String>) {
    var num1 = 1..100
    for (num in num1) {
        print("${num} ,")
    }

    println()

    var num2 = 1 until 100
    for (num in num2) {
        print("${num} ,,")
    }

    println()
    var num3 = 1..80
    for (num in num3 step 2) {
        print("${num} ,")
    }

    println()
    var num4 = num3.reversed()
    for (a in num4) {
        print("${a} ,")
    }

    println()
    var num5 = num4.count()
    println(num5)
}

