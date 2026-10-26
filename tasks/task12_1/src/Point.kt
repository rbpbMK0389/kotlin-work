// Task 12.1: Point class
import kotlin.math.hypot
class Point (x: Double, y: Double){
    constructor(): this(0.0, 0.0)
    var x = x
    var y = y

    fun distance() = hypot(x, y)

}
