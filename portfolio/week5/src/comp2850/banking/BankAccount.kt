// COMP2850 Portfolio: Week 5
// BankAccount class

// work by Majeedah Khan

package comp2850.banking

val MAX_OVERDRAFT = 100 // needed in tests for some reason

abstract class BankAccount(val holder: String) { // abstract is open by default
    init {
        require(holder.isNotBlank()) { "Account holder must not be blank" }
    }

    var balance = 0 // visible to subclass StudentAccount
        protected set(value) {
            field = value
        }

    fun deposit(amount: Int) {
        require(amount > 0) { "Deposit amount must be greater than 0" }
        balance += amount
    }

    // partialally creates fun for withdraw in subclass
    abstract fun withdraw(amount: Int) 
}

// class StudentAccount(holder: String) : BankAccount(holder) {

//     // uses setter to set overdraft, O otherwise
//     var overdraft = 0
//         set(value) {
//             require(value >= 0 && value <= 100) 
//             field = value
//         }

//     override fun toString(): String {
//         return "Account for ${holder}, balance = ${balance} (overdraft = ${overdraft})"
//     }

//     // uses override since withdraw is an abstract class in BankAccount
//     override fun withdraw(amount: Int) {
//         require(amount > 0) {"Withdrawal amount must be greater than 0"}

//         if ((balance - amount) < (-overdraft)) {
//             throw IllegalArgumentException("Insufficient funds for withdrawal")
//         }

//         balance = balance - amount
//     }

//     fun withdrawalsAllowed(): Boolean {
//         if (balance > (-overdraft)) {
//             return true
//         }
//         return false
//     }
// }
