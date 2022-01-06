package chap03.section3

fun main(){
    val num1 = 10
    val num2 = 13
    val result : Int = max(num1 , num2)
    println(result)
    println(max(13,52,33))
    unitMax(num1, num2)
    defaultFunc("MyeongSeong")
    defaultFunc("MyeongSeong2","sktior@hanmail.net")
    defaultFunc("MyeongSeong3","ms1994s@naver.com")
}

fun max(num1 : Int, num2 : Int) : Int = if(num1 > num2) num1 else num2

fun max(num1:Int, num2:Int, num3:Int) : Int{
    var max = -100
    if(num1 > max) max = num1
    if(num2 > max) max = num2
    if(num3 > max) max = num3
    return max
}

fun unitMax(num1 : Int, num2 : Int) : Unit = if(num1 > num2) println("num1") else println("num2")

fun defaultFunc(name:String, email:String = "default"){
    println("$name | $email")
}