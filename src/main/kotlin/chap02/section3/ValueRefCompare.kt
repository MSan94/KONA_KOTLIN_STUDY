package chap02.section3

fun main(){
    val a : Int = 128
    val b = a
    println(a === b) // 자료형아 기본형인 int가 되어 true

    val c : Int? = a
    val d : Int? = a
    val e : Int? = c

    println(c == d) // 값만 비교하므로 true
    println(c === d) // 값의 내용은 같지만 참조 주소를 비교해 다른 객체이므로 false
    println(c === e) // c,e는 값도 값고 참조된 객체도 같아서 true , c -> a , e -> c
}