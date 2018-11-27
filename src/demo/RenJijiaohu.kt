package demo

fun main(args: Array<String>) {

    while (true) {

        println("请输入第一个数字：")

        var num1 = readLine()
        println("请输入第2个数字：")
        var num2 = readLine()


        try {
            //readLine 是string? 是允许null的 所以 在转换toInt的时候，加上！！输入进来的数据 不是null 就可以了
            var numstr1 = num1!!.toInt()
            var numstr2 = num2!!.toInt()
            println(numstr1 + numstr2)
            println("${numstr1 + numstr2}")
        } catch (e: Exception) {
            println("请输入数字啊，不然有错误")
        }
    }

}