package oop

import java.util.regex.Pattern


fun main(args: Array<String>) {
    //这里面的逻辑 不完善

    var machine = WashMachine("小天和", 20)

    while (true) {
        println("请输入模式：")
        var num = readLine()

        try {
            var numstr = num!!.toString()
            if (isCheck(numstr)) {
                machine.open()
                machine.close()
                machine.mode(numstr.toInt())
                machine.start()
                break
            } else {
                println("输入有误，请冲洗初..")
            }

        } catch (e: Exception) {
            println("异常错苏")
        }

    }


}

private fun isCheck(num: String): Boolean {
    var pattern = Pattern.compile("[0-3]*")
    var isNum = pattern.matcher(num)

    if (!isNum.matches()) {
        return false
    }
    return true
}
