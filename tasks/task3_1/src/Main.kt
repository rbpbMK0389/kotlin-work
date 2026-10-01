// Task 3.1: command line arguments

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    var n = 0
    while (n < args.size) {
        print(args[n])
        n = n + 1
    }
}
