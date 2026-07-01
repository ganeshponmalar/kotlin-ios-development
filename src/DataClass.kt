fun main(){
    val more1 = More(firstName="John", lastName="Doe", age=23)
    val more2 = More(firstName="John", lastName="Doe", age=23)
    println(more1.equals(more2))

}

data class More(var firstName: String, var lastName: String, var age: Int)



//In Kotlin, a data class is a class specifically designed to hold data. Kotlin automatically generates useful methods such as:

//toString()
//equals()
//hashCode()
//copy()
//Component functions (component1(), component2(), etc.) for destructuring