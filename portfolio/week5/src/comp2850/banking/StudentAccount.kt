package comp2850.banking

class StudentAccount(holder: String) : BankAccount(holder) {

    // uses setter to set overdraft, O otherwise
    var overdraft = 0
        set(value) {
            require(value >= 0 && value <= 100) 
            field = value
        }

    override fun toString(): String {
        return "Account for ${holder}, balance = ${balance} (overdraft = ${overdraft})"
    }

    // uses override since withdraw is an abstract class in BankAccount
    override fun withdraw(amount: Int) {
        require(amount > 0) {"Withdrawal amount must be greater than 0"}

        if ((balance - amount) < (-overdraft)) {
            throw IllegalArgumentException("Insufficient funds for withdrawal")
        }

        balance = balance - amount
    }

    fun withdrawalsAllowed(): Boolean {
        if (balance > (-overdraft)) {
            return true
        }
        return false
    }
}