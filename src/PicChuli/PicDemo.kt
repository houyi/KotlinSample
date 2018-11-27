package PicChuli

import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

fun main(args: Array<String>) {

    val bufferedImage = BufferedImage(100, 100, BufferedImage.TYPE_3BYTE_BGR)
    var w = 0..99
    var h = 0..99

    //高阶函数  apply 是接受的函数里面T 就是 T的方法 下面的setRGB 就是this bufferedImage 对象
    bufferedImage.apply {
        for (i in w) {
            for (j in h) {
                setRGB(i, j, 0xff0000)
            }
        }
    }

    //工具类 输出
    ImageIO.write(bufferedImage, "bmp", File("a.bmp"))

}