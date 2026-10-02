// Task 3.5: simple file I/O

import kotlin.io.path.Path
import kotlin.io.path.appendText
import kotlin.io.path.readText
import kotlin.io.path.writeText
import kotlin.io.path.appendText
import kotlin.system.exitProcess

fun main() {

    // get file path
    val path = Path("text.txt")
    // get line from console input
    var input_line = readln()
    // if input == newline, quit
    while (input_line != "") {
        // write console input to file
        path.appendText(input_line + "\n")
        input_line = readln()
    }

    exitProcess(0)
}
