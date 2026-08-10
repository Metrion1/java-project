package Interest;

import Interest.interfaces.InterestInterface;

public class SimpleInterest implements InterestInterface {
    private double ratePercent;
    private int timeYears;

    // simple interest formula: I = P * R * T
    // constructor to initialize the rate and time
    // precondition: ratePercent < 0
    // postcondition: ratePercent = ratePercent
    // overide to calculate the simple interest based on the balance, rate and time

    public SimpleInterest(double ratePercent, int timeYears) {
        if (ratePercent < 0) {
            throw new IllegalArgumentException("Rate percent cannot be negative."); // if condition is true throw an
                                                                                    // exception error.
        }
        if (timeYears < 0) {
            throw new IllegalArgumentException("Time in years cannot be negative."); // if condition is true throw an
                                                                                     // exception error.
        }
        this.ratePercent = ratePercent;
        this.timeYears = timeYears;
    }

    @Override
    public double calculate(double balance) {
        // precondition: balance < 0
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative."); // if condition is true throw an
                                                                               // exception error.
        }
        // calculate simple interest
        return balance * ratePercent / 100 * timeYears;
    }
}
