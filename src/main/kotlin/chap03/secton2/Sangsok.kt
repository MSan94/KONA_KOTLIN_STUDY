package chap03.secton2
/*open class Sangsok{
    var name : String
    var wing : Int
    var beak : String
    var color : String
    constructor(name : String ,wing : Int,beak : String, color : String){
        this.name = name
        this.wing = wing
        this.beak = beak
        this.color = color
    }
    fun fly() = println("Fly wing : $wing")
    fun show() = println("HelloSangSok")
    fun sing(vol : Int) = println("Sing vol : $vol")
}*/
open class Sangsok(var name : String , var wing : Int, var beak : String, var color : String){
    fun fly() = println("Fly wing : $wing")
    fun show() = println("HelloSangSok")
    open fun sing(vol : Int) = println("Sing vol : $vol")
}

// 주 생성자
class Lark(name : String, wing : Int, beak : String, color : String) : Sangsok(name,wing,beak,color){
    fun singHitone() = println("Happy Song!")
    override fun sing(vol: Int) = println("LarksVol : $vol")

}

// 부 생성자
class Parrot : Sangsok {
    val language : String
    constructor(name : String, wing : Int, beak : String, color : String, language : String) : super(name,wing,beak,color){
        this.language = language
    }

    override fun sing(vol: Int) {
        println("=========super==========")
        super.sing(2)
        println("Parrot : $vol")
        println("=========super==========")
    }
    fun speak() = println("Speak! $language")
}

fun main() {
    val coco = Sangsok("myBird",2,"short","blue")
    val lark = Lark("myLark",2,"long","brown")
    val parrot = Parrot("myParrot",2,"short","multiple","Korean")

    println("coco : ${coco.name} , ${coco.wing} , ${coco.beak} , ${coco.color}")
    println("lark : ${lark.name} , ${lark.wing} , ${lark.beak} , ${lark.color}")
    println("parrot : ${parrot.name} , ${parrot.wing} , ${parrot.beak} , ${parrot.color} , ${parrot.language}")

    lark.singHitone()
    parrot.speak()
    lark.fly()

    coco.sing(1)
    lark.sing(2)
    parrot.sing(3)


}