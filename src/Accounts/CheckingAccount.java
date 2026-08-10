package Accounts;

public class CheckingAccount extends Account {

    private double overdraftLimit;
    private double transactionFee;

    public CheckingAccount(String owner, double initialBalance, double overdraftLimit, double transactionFee) {
        // calls the constructor of the superclass Account with the provided owner and
        // initialBalance
        super(owner, initialBalance);
        // precondition: initialBalance < 0
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative."); // if condition is true throw an
                                                                                       // exception error.
        }
        // precondition: overdraftLimit < 0
        if (overdraftLimit < 0) {
            throw new IllegalArgumentException("Overdraft limit cannot be negative."); // if condition is true throw an
                                                                                       // exception error.
        }
        // precondition: transactionFee < 0
        if (transactionFee < 0) {
            throw new IllegalArgumentException("Transaction fee cannot be negative."); // if condition is true throw an
                                                                                       // exception error.
        }
        this.overdraftLimit = overdraftLimit;
        this.transactionFee = transactionFee;
    }

    @Override
    public void withdraw(double amount) {
        // precondition: amount <= 0
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be greater than zero."); // if condition is true
                                                                                                // throw an exception
                                                                                                // error.
        }
        // precondition: balance - amount - transactionFee < -overdraftLimit
        if (balance - amount - transactionFee < -overdraftLimit) {
            throw new IllegalArgumentException("Insufficient funds, overdraft limit exceeded."); // if condition is true
                                                                                                 // throw an exception
                                                                                                 // error.
        }

        // postcondition: balance = balance - amount - transactionFee
        balance -= (amount + transactionFee); // subtract the amount and transaction fee from the balance
    }
}
