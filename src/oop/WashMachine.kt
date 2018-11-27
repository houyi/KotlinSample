package oop

class WashMachine(var moudle: String, var size: Int) {

    var isDoorOpen:Boolean = true
    //初始模式
    var chushileixing:Int = 0

    fun open() {
        println("开门，已经打开了")
        isDoorOpen = true
    }

    fun close() {
        println("关门，已经关闭了")
        isDoorOpen = false
    }


    fun start() {
        if (isDoorOpen) {
            println("bibibi...门是开着的不能 洗衣服...")
        } else {
            when (chushileixing) {
                0 -> {
                    println("初始化模式...自动选折...")
                }
                1 -> {
                    println("轻柔开始防水....")
                    println("马达转起来了....")
                    println("开始洗衣服....")
                }
                2 -> {
                    println("中柔开始防水....")
                    println("马达转起来了....")
                    println("开始洗衣服....")
                }
                3 -> {
                    println("强柔开始防水....")
                    setModeSpeed(2000)
                    println("马达转起来了....")
                    println("开始洗衣服....")
                }
                4 -> {
                    println("强柔开始防水....")
                    setModeSpeed(10000)
                    println("马达转起来了....")
                    println("开始洗衣服....")
                }
                else -> {
                    println("模式故障，错误！！！没有这个模式")
                }
            }


        }

    }


    //private就是封装
    private fun setModeSpeed(speed: Int) {
        println("现在的速度是${speed}圈")
    }

    fun mode(leixing: Int) {
        //这里 客户端输入参数 赋值给 chushileixing 0 变成 3
        chushileixing = leixing
        when (leixing) {
            1 -> println("轻柔模式")
            2 -> println("中模式")
            3 -> println("强柔模式")
            4 -> println("狂柔模式")
            else -> print("按钮模式错误。没有这个模式")
        }
    }
}