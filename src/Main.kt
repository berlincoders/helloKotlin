import java.util.*

fun main() {
    println("Hello Kotlin!")

    // Interpolation in kotlin  $num
    //       "       javascript ${num}
    //       "       ruby       #{num}
    //       "       Python      {num}

    // var:
    //Is like general variable and it's known as a mutable variable in Kotlin
    // and can be assigned multiple times.
    // val:
    // is like final variable and it's known as immutable in Kotlin
    // and can be initialized only single time

    var num : Int= 3
    println("the value of num is $num")
    num = 4
    println("The value of num is now $num ")

    //Arithmetic Operations
    val x = 3 * 4
    val y = 3f / 4f  // float values
    val z = 10 % 3   // rest
    println("The value of x is $x  and y is $y  and z $z")

    //strings
    val string =" kotlin is a cool language "
    println(string.uppercase()) /* toUpperCase() is deprecated. use uppercase() , the most important is to learn the shortcut (Option+ Caps + Enter) */

    // Null value and user Input
    val number1 = readln() ?:"0"   // if the input is null, it will be assigned to "0" string
    val number2 = readln() ?:"0"   //

    val result = number2.toInt() + number1.toInt() // question mark Allow to set the variable to null , (do not happen in Java )

    println(result)
}