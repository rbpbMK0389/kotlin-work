// Task 7.7.1: program to compute stats for a numeric dataset


fun main(args: Array<String>) {
    val filename = args[0]

    computeMedian(filename)

    printStats(filename)
}