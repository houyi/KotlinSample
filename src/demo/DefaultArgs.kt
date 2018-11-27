package demo

fun main(args: Array<String>) {
    // 具名参数 banjing = 2.0f
    var result = yuanmianji(banjing = 2.0f)
    var result1 = yuanzhouchang(banjing = 2.0f)
    var result2 = yuanzhuzhouchang(banjing = 2.0f, gao = 3.0f)
    var result3 = qiutibiaomianji(banjing = 2.0f)

    println(result)
    println(result1)
    println(result2)
    println(result3)
}


val P = 3.14159f

// p 默认参数
fun yuanmianji(PI: Float = P, banjing: Float): Float = PI * banjing * banjing

fun yuanzhouchang(PI: Float = P, banjing: Float): Float = 2 * PI * banjing

fun yuanzhuzhouchang(PI: Float = P, banjing: Float, gao: Float): Float = 2 * PI * banjing * banjing * gao

fun qiutibiaomianji(PI: Float = P, banjing: Float): Float = PI * banjing * banjing * 4

