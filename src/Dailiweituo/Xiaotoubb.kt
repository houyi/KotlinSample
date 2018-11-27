package Dailiweituo

//小头爸爸委托大头儿子洗碗 by 关键字。接口代理  不加括号，不需要重新创建son 单例模式
class Xiaotoubb : WashWan by DatouSon {
    override fun xiwan() {
        //代理前做的事情
        println("我是小头阿爸爸，我委托儿子，洗碗给1块钱")
        DatouSon.xiwan() //这里要有且只有一个
        //代理后做的事情
        println("我是大头子，玩，洗好了..")
    }

}