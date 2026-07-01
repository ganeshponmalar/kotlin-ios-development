fun main() {

    val car = MyCar(name = "BMW", color = "Red", engines = 1, doors = 4)

    val plane = MyPlane(name = "Boeing", color = "White and Blue", engines = 4, doors = 4)

    car.move()
    car.stop()

    plane.move()
    plane.stop()
}

open class Vehicle(val name: String, val color: String) {
    open fun move(){
        println("$name move")
    }


    open fun stop() {
        println("$name is stopped")
    }
}


class MyCar(name: String, color: String, val engines: Int, val doors: Int) : Vehicle(name, color){
 override fun move(){
     moving()
     super.move()
 }
    fun moving() {
        println("$name is moving Fast")
    }

}

class MyPlane(name: String, color: String, val engines: Int, val doors: Int) : Vehicle(name, color){

    override fun move(){
        flying()
        super.move()
    }
    fun flying(){
        println("$name is flying in the sky")
    }

}