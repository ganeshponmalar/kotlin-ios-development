fun main(args: Array<String>){

    val user=  Mouse(firstName = "Alexer")
    val friend = Mouse(firstName ="Alex", lastName="Smith")
    val user2 = Mouse(age=19, firstName ="Ioana",lastName="Dobbi")

    println("Name= ${user.firstName}")
    println("LastName= ${user.lastName}")
    println("Age= ${user.age}")
    

    println("\n")

    println("Name = ${friend.firstName}")
    println("LastName=${friend.lastName}")
    println("Age = ${friend.age}")


}


class Mouse(var firstName:String, var lastName: String="LastName", var age: Int=0){


}
