package Kotlin

import java.util.*


fun main() {
    var a = "abcd"
    if (a != "") {
        a = a.substring(0, a.length-1)
        print(a)
    }
}