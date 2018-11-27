package demo

fun main(args: Array<String>) {
    var a = 2
    var b = 5
    println("${a}和${b}中最大的那个数是${bijiao(a, b)}")
}


fun bijiao(a:Int, b:Int):Int {
    if(a>b) return a else return b
}