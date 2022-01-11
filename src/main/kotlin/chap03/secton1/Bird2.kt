package chap03.secton1

class Bird2(var name : String, var wing : Int, var beak : String, var color : String){
    init {
        println("===============초기화===============")
        println("이름은 $name, 부리는 $beak")
        this.sing(33)
        println("===============초기화===============")
    }

    fun fly() = println("Fly wing : $wing")
    fun sing(vol:Int) = println("Sing vla : $vol")
}

fun main(){
    val coco = Bird2("myBird", 2 , "short", "blue")

    coco.color = "yello"

}