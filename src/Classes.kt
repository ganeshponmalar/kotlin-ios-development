fun main(args: Array<String>){
    val  user = User(name="Alex",lastName= "Dobica",age=23)
    val friend = User(name="arun",lastName="Andra",age=29)
    println("Name is  ${friend.name}  ")
   println("Name is ${user.name}")

}

class User(var name:String, var lastName: String,var age:Int){

    init{
        if(name.lowercase().startsWith("a")){

        this.name = name
    }else{
        this.name = "User"

        println("The name doesn't start with the letter 'a' or 'A'")
    }
}
    init{
        if(name.uppercase().startsWith("A")){
            this.name = name
        }
        else{
            this.name = "User"
            println("The name matching or not matching but matching uppercase letter")
        }
    }
}