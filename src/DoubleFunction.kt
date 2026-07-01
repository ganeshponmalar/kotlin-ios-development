fun main(args: Array<String>){

    val man =getMax(a=100.1,b=200.2,c=300.3)
    println(man)
}





fun getMax(a: Double,b:Double,c:Double) : Double{
    val max = if(a>=b && a>=c){
        return a

    }else if(b>=a && b>=c){
        return b
    }
    else
    {
        return c
    }
}
