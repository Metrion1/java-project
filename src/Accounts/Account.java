package Accounts;

import Interest.SimpleInterest;
import Interest.TieredInterest;

public class Account {
    private String owner;
    protected double balance;
    private InterestStrategy interestStrategy;
    // protected double balance; // protected access modifier allows subclasses to
    // access the balance variable

    protected Account(String owner, double initialBalance) { // protected constructor allows subclasses to call the
                                                             // constructor of the superclass
        // precondition: owner == null || owner.isEmpty()
        if (owner == null || owner.isEmpty()) {
            throw new IllegalArgumentException("Owner name cannot be null or empty."); // if condition is true throw an
                                                                                       // exception error.
        }
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative."); // if condition is true throw an
                                                                                       // exception error.
        }

        this.owner = owner; // set the owner of the account
        this.balance = initialBalance; // set the initial balance of the account
    }

    public void deposit(double amount) {
        // precondition: amount <= 0
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be greater than zero."); // if condition is true
                                                                                             // throw an exception
                                                                                             // error.
        }

        // postcondition: balance = balance + amount
        balance += amount; // add the amount to the balance
    }

    public void withdraw(double amount) {
        // precondition: amount <= 0
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be greater than zero."); // if condition is true
                                                                                                // throw an exception
                                                                                                // error.
        }
        // precondition: balance - amount < 0
        if (balance - amount < 0) {
            throw new IllegalArgumentException("Insufficient funds."); // if condition is true throw an exception error.
        }

        // postcondition: balance = balance - amount
        balance -= amount; // subtract the amount from the balance
    }

    public double getBalance() {
        return balance; // return the balance
    }

    public void setInterestStrategy(TieredInterest strategy) {
        this.interestStrategy = (InterestStrategy) strategy;
    }
    public void setInterestStrategy(SimpleInterest strategy) {
        this.interestStrategy = (InterestStrategy) strategy;
    }

    public double applyInterest() {
        if (interestStrategy == null) {
            throw new IllegalStateException("No interest strategy set.");
        }
        double interest = interestStrategy.calculateInterest(balance);
        balance += interest;
        return interest;
    }

    @Override
    public String toString() {
        return String.format("Account owner: %s, Balance: %.2f", owner, balance); // return a string representation of
                                                                                  // the account
    }

    public interface InterestStrategy {
        double calculateInterest(double balance);
    }
}
