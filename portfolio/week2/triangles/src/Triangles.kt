// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

// work by Majeedah Khan
// 09/10/26

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here

fun isValidTriangle(triangle: Triangle): Boolean {

    // assigns the arguments
    val (a, b, c) = triangle
    //if each side is smaller than the sum of the other sides -> then valid triangle
    if (a<b+c && b<a+c && c<a+b){
        return true
    }
    else{
        return false
    }
}

fun triangleArea(triangle: Triangle): Double {

    // assigns the arguments
    val (a, b, c) = triangle

    val s = (a + b + c) / 2

    // uses the formula
    val area = Math.sqrt(s*(s - a)*(s - b)*(s - c))

    return area
}