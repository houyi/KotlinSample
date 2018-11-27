package AbstractInterface

class Man(var name: String) : Person(name) {
    override fun eat() {
        println("${name}是那人我很强壮 大口吃饭")
    }

    override fun pee() {
        println("${name}我是站着袅袅....")
    }
}