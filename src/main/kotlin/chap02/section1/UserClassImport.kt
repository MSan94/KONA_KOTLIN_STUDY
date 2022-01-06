package chap02.section1

fun main(){
    var user1 = Person("kildong", 30)
    var user2 = Person("myeongSeong",29)
    println(user1.name)
    println(user1.age)
    println(user2.name)
    println(user2.age)
    user2.age = 100
    println(user2.name)
    println(user2.age)
}