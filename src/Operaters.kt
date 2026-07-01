fun main(){

    var x = 5
    x = 800
    var y = 3
    y=300



    println("the value of x plus y  = ${x+y}")
    println("the value of x sub y  = ${x-y}")
    println("the value of x multi y  = ${x*y}")
    println("the value of x div y  = ${x/y}")
    println("the value of x per y  = ${x%y}")

    var result = x + y

    result = result + 2
    println("the result is $result")

    result = result - 2
    println("the result is $result")

    result = result * 2
    println("the result is $result")

    result = result / 2
    println("the result is $result")

    result = result % 2
    println("the result is $result")

    println("3+10*5${3+10*5}")

    x = 1
    println("x = $x++")
    println("y = ${++x}")

    val isActive = false
    if(isActive == true){
        println("The user is active ")
    }
    else{
        println("no active mode")
    }

    val myValue = 100
    if(myValue < 150){
        println("Greater than 150")
    }else if(myValue > 90){
        println("greater than 90")
    }
    else{
        println("greater than $myValue")
    }


}
