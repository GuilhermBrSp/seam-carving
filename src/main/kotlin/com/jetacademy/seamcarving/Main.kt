package com.jetacademy.seamcarving

import com.jetacademy.seamcarving.extensions.drawVerticalSeam
import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

fun main(args: Array<String>) {
    val inputFile = args[args.indexOf("-in") + 1]
    val outputFile = args[args.indexOf("-out") + 1]
    val bufferedInputImage: BufferedImage = ImageIO.read(File(inputFile))

    ImageIO.write(bufferedInputImage.drawVerticalSeam(), "png", File(outputFile))
}






