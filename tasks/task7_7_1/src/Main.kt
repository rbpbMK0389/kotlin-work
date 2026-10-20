// Task 7.7.1: program to compute stats for a numeric dataset


fun main(args: Array<String>) {

    require(args.isNotEmpty()) {"filename is required"}
    val filename = args[0]

    median(filename)

    printStats(filename)
}