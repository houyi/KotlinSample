package FilterDSLDemo

// 里面放一种数据类型
data class GrilDemo(var name: String, var city: String, var age: Int, var height: Int)

var GrilsList = listOf<GrilDemo>(
        GrilDemo("笑话", "河南", 20, 160),
        GrilDemo("笑话1", "洛阳", 30, 120),
        GrilDemo("笑话2", "河南", 10, 190),
        GrilDemo("笑话43", "漯河", 15, 220),
        GrilDemo("笑话6", "漯河", 40, 50)
)

//双冒号操作符 表示把一个方法当做一个参数，传递到另一个方法中进行使用，通俗的来讲就是引用一个方法
//DSL 扩展函数 中缀表达式
infix fun List<GrilDemo>.chazhaonianl(age: Int) {
    //这里用高阶函数
    filter {
        it.age > age
    }.forEach(::println)
}


//过滤城市

fun filterCity(city: String): Int {

    var fiterList = ArrayList<GrilDemo>()
    for (f in GrilsList) {
        if (f.city == city) {
            fiterList.add(f)
        }
    }

    for (g in fiterList) {
        println("${g.city}----${g.age}-----${g.height}----${g.name}")
    }

    //返回集合里面复合条件的个数
    return fiterList.count()
}

//新的需求

fun filterAgeHeight(age: Int, height: Int): Int {

    var fiterList = ArrayList<GrilDemo>()
    for (f in GrilsList) {
        //and 比较要用小括号
        if ((f.age < age) and (f.height > height)) {
            fiterList.add(f)
        }
    }

    for (g in fiterList) {
        println("${g.city}----${g.age}-----${g.height}----${g.name}")
    }

    //返回集合里面复合条件的个数
    return fiterList.count()
}