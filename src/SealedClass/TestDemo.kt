package SealedClass

fun main(args: Array<String>) {
    var s1 = SonClass.xiaolou()
    var s2 = SonClass.xiaolou()
    var s3 = SonClass.xiaolv()


    var list = listOf<SonClass>(s1, s2, s3)
    for (l in list) {
        //如果l是 xiaolv类型 is
        if (l is SonClass.xiaolou) {
            l.sayHello()
        }
    }
}