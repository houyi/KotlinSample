package FilterDSLDemo

fun main(args: Array<String>) {

    //中缀表达式
    var d = GrilsList.chazhaonianl(25)
    //infix
    var d1 = GrilsList chazhaonianl 30



    var f = filterCity("洛阳")
    println(f)


    var f1 = filterAgeHeight(25, 185)
    println(f1)


    //高阶函数 maxBy minBy 最大的 最小的 括号里面是一个函数返回一个集合
    var f2 = GrilsList.maxBy { it.age }
    println(f2)


    //高阶函数 maxBy minBy
    var f3 = GrilsList.minBy { it.height }
    println(f3)

    //高阶函数 filter 返回一个boolean 比较
    var f4 = GrilsList.filter {
        (it.age > 20) and (it.height < 100)
    }
    println(f4)


    //高阶函数 map 重新放到一个 键值对MAP集合里面
    var f5 = GrilsList.map {
        "${it.name} : ${it.height}"
    }
    println(f5)


    //高阶函数 any 里面有没有这个
    var f6 = GrilsList.any {
        it.age == 20
    }
    println(f6)


    //高阶函数 count 里面有没有这个
    var f7 = GrilsList.count {
        it.city == "河南"
    }
    println(f7)


    //高阶函数 find 查找第一个
    var f8 = GrilsList.find {
        it.city == "河南"
    }
    println(f8)


    //高阶函数 groupby 分组 按照他的类型 地区进行分组
    //问号 的意思是 如果有人话 就打印出来后面 返回一个list 可以拿到get 值，然后遍历 出来
    var f9 = GrilsList.groupBy {
        it.city
    }.get("漯河")?.forEach { println(it) }


}