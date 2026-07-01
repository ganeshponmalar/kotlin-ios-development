fun main(){


    var number: Int = 29

    val maxIntegerValue: Int = Int.MAX_VALUE
    val minIntegerValue: Int = Int.MIN_VALUE
    println("Int maximum value is : $maxIntegerValue")
    println("Int minimum value is: $minIntegerValue")

    number=2147483647

    val myMaxByteValue: Byte = Byte.MAX_VALUE
    val myMinByteValue: Byte = Byte.MIN_VALUE

    println("Int minimum value is $myMinByteValue and the maximum value is $myMaxByteValue")

    val myMaxShortValue: Short = Short.MAX_VALUE
    val myMinShortValue: Short = Short.MIN_VALUE

    println("Short Maximum value is $myMinShortValue and the maximum Short value is $myMaxShortValue")

    val myMaxLongValue: Long = Long.MAX_VALUE
    val myMinLongValue: Long = Long.MIN_VALUE

    println("Long maximum value is $myMaxLongValue and the minimum Long value is $myMinLongValue")


    val myNumber = 288888888888
    println("$myNumber is ${myNumber * myMaxLongValue}")


}
