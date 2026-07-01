fun main() {

    val user = Rain(name = "Alex")
    val friend = Rain(name = "John", lastname = "Smith")

    println("Name = ${user.name}")
    println(" LastNmae = ${user.name}")
    println("Age = ${user.age}")


    println("\n")
    println("Name: ${friend.name}")
    println("Name: ${friend.lastname}")
    println("Name: ${friend.age}")

}

class Rain(var name: String, var lastname: String, var age: Int) {

    // Secondary constructor 1
    constructor(name: String) : this(name, "Unknown", 0) {
        println("Second constructor called")
    }

    // Secondary constructor 2
    constructor(name: String, lastname: String) : this(name, lastname, 0) {
        println("Third constructor called")
    }
}