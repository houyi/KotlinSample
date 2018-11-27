package gaojiehanshu


fun main(args: Array<String>) {

    var list = listOf<String>("西瓜", "香蕉", "苹果")
    //第一种
    list.forEach(shuchu)

    //第二种 闭包函数 匿名函数 参数是a 参数内容是a
    list.forEach {
        a -> println(a)
    }
    //第二种简写 参数是it 默认的参数是it
    list.forEach {
        println(it)
    }
}


//第一种函数式编程 forEach 里面是一个函数
var shuchu = fun(name: String): Unit {
    println(name)
}