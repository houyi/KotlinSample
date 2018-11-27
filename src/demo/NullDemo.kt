package demo

fun main(args: Array<String>) {
    var result = heat(null)

    println(result)
}

/**
 * ？加问好是可以为Null输出的
 */

fun heat(a:String?):String {
    return "热"+a
}