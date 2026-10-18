// Task 8.3: weather station temperature analysis program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
    val filename = args[0]

    val lowestRecord = fetchData(filename).minBy {it.second}

    val highestRecord = fetchData(filename).maxBy {it.second}

    println("${lowestRecord.first}, ${lowestRecord.second}")
}
