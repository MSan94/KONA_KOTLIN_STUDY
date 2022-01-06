package chap02.section3

fun main(){
    var str1 : String? = "Hello Kotlin"
    //var str1 : String? = "Hello Kotlin"
    str1 = null
    println("str1 : $str1 length : ${str1?.length ?: -1}")

    val a : Int = 128
    val b : Int = 128

    val a1 : Int = 129
    val b1 : Int? = 129
    println(a == b)
    println(a === b)
    println(a1 == b1)
    println(a1 === b1)
}