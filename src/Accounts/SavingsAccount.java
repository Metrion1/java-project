package Accounts;

import Interest.TieredInterest;

public class SavingsAccount extends Account {
    private int withdrawalLimit;
    private int withdrawalsMade;

    public SavingsAccount(String owner, double initialBalance, int withdrawalLimit) {
        // calls the constructor of the superclass Account with the provided owner and
        // initialBalance
        super(owner, initialBalance);
        // precondition: withdrawalLimit <= 0
        if (withdrawalLimit <= 0) {
            throw new IllegalArgumentException("Withdrawal limit must be greater than zero."); // if condition is true
                                                                                               // throw an exception
                                                                                               // error.
        }
        // postcondition: withdrawalLimit = withdrawalLimit
        this.withdrawalLimit = withdrawalLimit;
        this.withdrawalsMade = 0;
    }

    @Override
    public void withdraw(double amount) {
        // precondition: amount <= 0
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be greater than zero."); // if condition is true
                                                                                                // throw an exception
                                                                                                // error.
        }
        // precondition: withdrawalsMade >= withdrawalLimit
        if (withdrawalsMade >= withdrawalLimit) {
            throw new IllegalArgumentException("Withdrawal limit reached."); // if condition is true throw an exception
                                                                             // error.
        }

        // precondition: balance - amount < 0
        if (balance - amount < 0) {
            throw new IllegalArgumentException("Insufficient funds."); // if condition is true throw an exception error.
        }

        // postcondition: balance = balance - amount
        balance -= amount; // subtract the amount from the balance
        withdrawalsMade++; // increment the number of withdrawals made
    }

    @Override
    public String toString() {
        return String.format("Savings Account owner: %s, Balance: %.2f, Withdrawals Made: %d, Withdrawal Limit: %d",
                super.toString(), balance, withdrawalsMade, withdrawalLimit); // return a string representation of the
                                                                              // savings account
    }

    public void setInterestStrategy(TieredInterest strategy) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setInterestStrategy'");
    }
}
