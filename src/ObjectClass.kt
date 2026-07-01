fun main() {
    // Creating object
    val bullet = Bike(
        name = "Classic 350",
        company = "Royal Enfield",
        address = "malai",
        price = 200000.0,
        isAvailable = true
    )

    bullet.displayDetails()
}

class Bike(
    val name: String,
    val company: String,
    val address: String,
    val price: Double,
    val isAvailable: Boolean
)

{

    fun displayDetails() {
        println("Name: $name")
        println("Company: $company")
        println("Price: $price")
        println("Address: $address")
        println("Is Available: $isAvailable")
    }
}
