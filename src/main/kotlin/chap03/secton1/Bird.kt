package chap03.secton1

class Bird{
    var name: String = "mybird"
    var wing : Int = 2
    var beak : String = "short"
    var color : String = "blue"
    constructor()
    constructor(name : String, wing:Int, beak : String, color:String){
        this.name = name
        this.wing = wing
        this.beak = beak
        this.color = color
    }

    fun fly() = println("Fly wing : $wing")
    fun sing(vol : Int) = println("Sing vol : $vol")
    fun all() = println("$name , $wing , $beak , $color")
}

fun main(){
    val coco = Bird()
    println("${coco.color}")
    coco.color = "white"
    println("${coco.color}")
    coco.fly()
    coco.sing(3)
    coco.all()
    println("========================")
    val coco2 = Bird("kaka",10,"long","green")
    coco2.all()
}