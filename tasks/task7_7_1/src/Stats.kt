// Task 7.7.1: statistics functions

fun median(filename: String): Float {
    // to find median:
    // order list of nums lowest to highest
    // list of nums is odd -> (n+1)/2
    // '' ''   '' is even -> find 2 middle nums, avg of that
    // n/2 = first no, (n/2)+1 = second no

    val list = readData(filename)

    require(list.isNotEmpty()) {println("List cannot be empty")}

    val sorted = list.sorted()

    fun List<Float>.isOdd() = this.size % 2 != 0 // checks if len of a list is odd

    if (sorted.isOdd()) {
        val median = sorted.elementAt(list.size/2) // gets the item at middle

        return median
    }

    else {
        val first = sorted.elementAt((list.size/2)-1) // gets middle item towards the beginning
        val second = sorted.elementAt(list.size/2) // likewise for the end

        val median = (first + second) / 2 // averages 2 middles then gets the results

        return median
    }



}

fun printStats(filename: String) {

    val list = readData(filename)

    println("Median: ${median(filename)}")
    println("Mean: %.2f".format(list.average()))
    println("Min: ${list.min()}")
    println("Max: ${list.max()}")


}