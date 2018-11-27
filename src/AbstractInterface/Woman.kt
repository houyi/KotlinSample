package AbstractInterface

class Woman(var name: String) : Person(name) {
    override fun eat() {
        println("${name}是女人我很揉搓我 小口吃饭")
    }

    override fun pee() {
        println("${name}我是蹲着尿尿....")
    }
}