package demo

import java.util.*

fun main(args: Array<String>) {
    var lists = listOf("修改","啊哈哈","ssss")
    for ((i,e) in lists.withIndex()) {
        println("$i  $e")
    }


    var maps = TreeMap<String,String>()
    maps["好"] = "goood"
    maps["好1"] = "goood1"
    maps["好2"] = "goood2"
    
    println(maps["好"])
}


