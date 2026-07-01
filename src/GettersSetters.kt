fun main(args:Array<String>) {

    val user = Rat(firstName = "Alex")
    val friend = Rat(firstName = "Jhon", lastName = "smith")
    val user2 = Rat(age = 29, firstName = "Jhones", lastName = "Dobbi")

    user.firstName = "Architecture"

    println( user.firstName)
    println( user.lastName)
    println( user.age)

    println("\n")

    println(friend.firstName)
    println(friend.lastName)
    println(friend.age)

}

class Rat(firstName: String, var lastName: String = "LastName" ,var age: Int=0){
    var firstName = firstName
        get(){
            return "FirstName: $field"
        }
        set(value){
            println("$value was assigned to firstName property")
            field = value
        }
}