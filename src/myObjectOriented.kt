
fun main(args: Array<String>){

    val car1 = Car(name="Tesla",model="S Plaid",color="Black",doors=4)


    println("Name is =${car1.name}")
    println("Model is =${car1.model}")
    println("Color is = ${car1.color}")
    println("Number of Doors is = ${car1.doors}")

    car1.move()
    car1.stop()

    val car2 = Car( name ="Ford", model="Musting", color="Blue",doors= 2)


    println("\n")

    println("Name is =${car2.name}")
    println("Model is =${car2.model}")
    println("Color is = ${car2.color}")
    println("Number of Doors is = ${car2.doors}")

    car2.move()
    car2.stop()
}

//creating constructor
class Car (name: String, var model: String, var color: String, var doors: Int){
    var name = name.trim()

    fun move(){
        println("The car ${name} has moving")
    }

    fun stop(){
        println("The car ${name} has stopped")
    }

}
