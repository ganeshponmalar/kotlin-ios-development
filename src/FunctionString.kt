fun main(args: Array<String>){
    sendMessage(name="Hello gayatheri")

}


fun sendMessage(name:String,message:String=sendText()){

    println("Name: $name, message: $message")
}

fun sendText(): String{
    return "i think god has different plan "
}


