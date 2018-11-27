package SealedClass

//子类类型有限 更在意的是类型

sealed class SonClass {
    //2中类型
    class xiaolv : SonClass()
    class xiaolou : SonClass()

    //2个后代都会说话
    fun sayHello() {
        println("你好世界")
    }
}