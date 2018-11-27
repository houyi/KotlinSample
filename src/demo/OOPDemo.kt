package demo

fun main(args: Array<String>) {
    var result = Rect(20, 10)
    println("宽度：=${result.height}")
    println("高度：=${result.width}")


    var result1 = Girl("小红", "女", 20)
    println("我叫:${result1.name} 性别:${result1.sex}今年:${result1.age}岁")
    result1.smaile()
    result1.cry()
}


class Rect(var height: Int, var width: Int)

//属性
class Girl(var name: String, var sex: String, var age: Int) {
    //行为
    fun smaile() {
        println("我在哈哈大笑")
    }

    fun cry() {
        println("我在哈哈哈大哭")
    }
}