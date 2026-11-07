// COMP2850 Portfolio: Week 4
// Triangle class

import kotlin.math.sqrt

// week3:
// typealias Triangle = Triple<Double,Double,Double>

// // Add isValidTriangle() and triangleArea() functions here

// fun isValidTriangle(triangle: Triangle): Boolean {

//     // assigns the arguments
//     val (a, b, c) = triangle
//     //if each side is smaller than the sum of the other sides -> then valid triangle
//     if (a<b+c && b<a+c && c<a+b){
//         return true
//     }
//     else{
//         return false
//     }
// }

// fun triangleArea(triangle: Triangle): Double {

//     require(isValidTriangle(triangle)) {"Triangle must be Valid"}

//     // assigns the arguments
//     val (a, b, c) = triangle

//     val s = (a + b + c) / 2

//     // uses the formula
//     val area = Math.sqrt(s*(s - a)*(s - b)*(s - c))

//     return area
// }


class Triangle constructor(val sideA: Double, val sideB: Double, val sideC: Double) {
    init {
        require((sideA<sideB+sideC && sideB<sideA+sideC && sideC<sideA+sideB)) {"Chosen values do not represent a valid triangle"}
    }
    
    val perimeter get() = sideA + sideB + sideC
    val semiPerimeter get() = perimeter/2
    val area get() = Math.sqrt(semiPerimeter * (semiPerimeter - sideA)*(semiPerimeter - sideB)*(semiPerimeter - sideC))

    override fun toString():String {return "Triangle($sideA, $sideB, $sideC)"} 
}