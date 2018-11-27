package demo

fun main(args: Array<String>) {
    result(8)
    dirayjilu("颐和园")
}

fun result(i: Int) {
    when (i) {
        10 -> println("考的不错")
        7 -> println("考的不错1")
        8 -> println("考的不错2")
        6 -> println("考的不错3")
        5 -> println("考的不错4")
        else -> println("其他都不是")
    }
}


fun dirayjilu(placeName: String) {
    var driay = """ 今天天气晴朗，我们去了${placeName}旅游，
        并且看到 ${placeName}的${num1(placeName.length)}个
        |鎏金大字
    """
    println(driay)
}

fun num1(i: Int): String {
    var result = when (i) {
        1 -> "一"
        2 -> "二"
        3 -> "三"
        4 -> "丝"
        else -> "什么都不是"
    }
    return result
}
