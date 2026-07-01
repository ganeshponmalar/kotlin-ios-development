fun main(args: Array<String>) {


        println(Direction.NORTH.direction)
        println(Direction.NORTH.distance)
        println(Direction.NORTH.name)

        Direction.WEST.printData()



}

enum class Direction(var direction: String, var distance: Int) {
    NORTH("north", 10),
    SOUTH("south", 20),
    EAST("east", 15),
    WEST("west", 40);

    fun printData(){
        println("Direction= $direction and Distance = $distance")
    }


}