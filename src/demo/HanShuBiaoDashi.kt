package demo

fun main(args: Array<String>) {
    var result = jiajia(3, 5)
    println(result)


    //第二种 函数表达式
    var i = { a: Int, b: Int -> a + b }
    var result1 = i(3, 5)
    println(result1)

    //第三种 函数表达式
    var j: (Int, Int) -> Int = { x, y -> x + y }
    var result2 = j(4, 5)
    println(result2)
}

//第一种 函数返回值写法
fun jiajia(a: Int, b: Int): Int = a + b