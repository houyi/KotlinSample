package demo

fun main(args: Array<String>) {
    var ny1 = riji("黄三")
    println(ny1)


    var ny2 = riji("黄三1")
    println(ny2)


    var ny3 = riji("黄三2")
    println(ny3)

}


fun riji(placeName: String): String {
    var template = """ 今天天气晴朗，我们去${placeName}游玩，我们看到了${placeName.length}几个大字"""

    return template
}