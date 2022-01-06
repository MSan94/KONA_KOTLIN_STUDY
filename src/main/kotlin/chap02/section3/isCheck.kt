package chap02.section3

fun main(){
    val num = 256

    if(num is Int){
        println("int")
    }else if(num !is Int){
        print("Not int")
    }
}