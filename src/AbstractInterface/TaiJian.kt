package AbstractInterface

class TaiJian(var name: String) : Person(name), IMan {
    override fun eat() {
        println("${name}大口吃饭")
    }

    override fun pee() {
        println("${name}我不可以牛尿")
    }

    override fun xuxu() {
        println("${name}我不能嘘嘘")
    }
}