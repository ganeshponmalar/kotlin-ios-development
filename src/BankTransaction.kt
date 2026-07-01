fun main() {

    val ganeshAccount = Account("Ganesh")

    ganeshAccount.deposit(10000)
    ganeshAccount.withdraw(5000)
    ganeshAccount.deposit(-5000)
    ganeshAccount.withdraw(-5000)

    println("Final Balance = ${ganeshAccount.calculateBalance()}")
}

class Account(val accountName: String) {
    var balance = 0
    var transactions = mutableListOf<Int>()

    fun deposit(amount: Int) {
        if (amount > 0) {
            transactions.add(amount)
            balance += amount
            println("$amount deposited. Balance = $balance")
        } else {
            println("Cannot deposit negative amount.")
        }
    }

    fun withdraw(withdrawal: Int) {

        if (withdrawal > 0) {
            transactions.add(-withdrawal)
            balance -= withdrawal
            println("$withdrawal withdrawn. Balance = $balance")
        } else {
            println("Cannot withdraw a negative amount.")
        }
    }


    fun calculateBalance(): Int {

        balance = 0

        for (transaction in transactions) {
            balance += transaction
        }
        return balance
    }
}