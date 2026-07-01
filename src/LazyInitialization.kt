fun main(args: Array<String>){
    val user1 = BookUser(firstName = "Peter", lastName = "Dobbin", age = 25)
    val user2: BookUser by lazy {
        BookUser(firstName = "user1", lastName = "Dobbin", age = 0)
    }
    println("user2.firstName = ${user2.firstName}")

}


class BookUser(var firstName: String, var lastName: String, var age: Int){

    init {
        println("BookUser: $firstName was created")
    }

}
