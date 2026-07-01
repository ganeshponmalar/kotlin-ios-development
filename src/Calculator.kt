fun main(args: Array<String>){
    val result = Calculator.sum(a=100,b=300)
    val max : Int = Int.MAX_VALUE
    println(" max value is $max ")
    println("The result is $result")
}


class Calculator{
    companion object{
        fun sum(a: Int,b:Int):Int{
            return a+b
        }
    }
}