// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

// work by Majeedah Khan
// 01/06/26

import kotlin.math.sqrt
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size < 3) {
        // checks that enough command line args are there
        println("Error: values for a, b, c required on command line")
        exitProcess(1)
    }

    // assigns and converts the command line args
    val a = args[0].toDouble()
    val b = args[1].toDouble()
    val c = args[2].toDouble()

    val s = (a + b + c) / 2

    // uses the formula
    val area = Math.sqrt(s*(s - a)*(s - b)*(s - c))

    // uses the format modifier to print area to 5dp
    println("Area = %.5f".format(area))
}