

fun main(args: Array<String>) {
    sayHello(name = "Alex", age = 29)


    val hasInternetConnection = false


    if (hasInternetConnection) {
        getData(data="Some data")
    } else {
        showMessage()
    }
    }


    fun sayHello(name: String, age: Int) {
        var number = age
        number = 70

        println("Hello, $name! ganesh you age is $age and $age")
    }


    fun getData(data: String) {
        println("Your data is :$data")
    }


    fun showMessage() {
        println("I am a message no internet connection")
    }
