fun main() {

    val savings = SavingsAccount()
    savings.deposit(1000)
    savings.withdraw(500)

    val current = CurrentAccount()
    current.deposit(2000)
    current.withdraw(2500)
}

abstract class BankAccount {

    var balance = 0

    fun deposit(amount: Int) {
        balance += amount
        println("Deposited: $amount")
    }

    abstract fun withdraw(amount: Int)
}


class SavingsAccount : BankAccount() {

    override fun withdraw(amount: Int) {
        if (balance - amount >= 500) {
            balance -= amount
            println("Savings Balance: $balance")
        } else {
            println("Minimum balance required.")
        }
    }
}



class CurrentAccount : BankAccount() {

    override fun withdraw(amount: Int) {
        balance -= amount
        println("Current Balance: $balance")
    }
}