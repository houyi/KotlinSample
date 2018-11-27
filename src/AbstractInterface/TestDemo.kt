package AbstractInterface

import javax.swing.ImageIcon

fun main(args: Array<String>) {
    var person1 = Man("金正恩")

    var person2 = Woman("李开复")

    var person3 = Man("小小")

    var person4 = Man("哈哈")

    //多肽
    var heziList = listOf<Person>(person1, person2, person3, person4)
    for (h in heziList) {
        h.pee()
        h.eat()
    }

    var person6 = TaiJian("太监")
    var TaiajinList = listOf<Person>(person6,person1)
    for (t in TaiajinList) {
        t.eat()
        t.pee()

    }

}