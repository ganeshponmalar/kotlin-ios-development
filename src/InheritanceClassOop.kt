fun main(){
var name = Human()
    var place : Human = Malai()
    var court = HighCourt()
    court.ganesh()
    place.ganesh()
    name.ganesh()


}

open class Human{


    open fun ganesh(){
        println("ganesh learning kotlin")
    }
}


 class Malai :Human(){

   override fun ganesh(){
        println("ganesh learning object oriented programming ")
    }
}

class HighCourt : Human(){
    override fun ganesh(){
        println("Ganesh going high court")
    }
}