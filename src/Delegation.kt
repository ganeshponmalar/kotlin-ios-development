interface Printer {
    fun print()
}

class HpPrinter : Printer {

    override fun print() {
        println("Printing using HP Printer")
    }
}

class Computer(printer: Printer) : Printer by printer

fun main() {

    val hpPrinter = HpPrinter()
    val computer = Computer(hpPrinter)

    computer.print()
}



