package Interest;

import Interest.interfaces.InterestInterface;

public class TieredInterest implements InterestInterface {
    private double baseRate;
    private double bonusRate;
    private double threshold;

    public TieredInterest(double baseRate, double bonusRate, double threshold) {
        // precondition: baseRate < 0
        if (baseRate < 0) {
            throw new IllegalArgumentException("Base interest rate cannot be negative."); // if condition is true throw
                                                                                          // an exception error.
        }
        // precondition: bonusRate < 0
        if (bonusRate < 0) {
            throw new IllegalArgumentException("Bonus interest rate cannot be negative."); // if condition is true throw
                                                                                           // an exception error.
        }
        // precondition: threshold < 0
        if (threshold < 0) {
            throw new IllegalArgumentException("Threshold cannot be negative."); // if condition is true throw an
                                                                                 // exception error.
        }
        this.baseRate = baseRate;
        this.bonusRate = bonusRate;
        this.threshold = threshold;
    }

    @Override
    public double calculate(double balance) {
        // precondition: balance < 0
        if (balance < 0) {
            return 0; // if condition is true return 0 as interest cannot be calculated on negative
                      // balance.
        }
        // calculate base interest
        double baseInterest = balance * baseRate;

        // calculate bonus interest if balance exceeds threshold
        if (balance <= threshold) {
            return baseInterest;
        }

        double amountAboveThreshold = balance - threshold;
        return baseInterest + (amountAboveThreshold * bonusRate); // return the total interest calculated based on the
                                                                  // balance and rates.
    } // look up how to calculate tiered interest rates and implement the logic
      // accordingly.
}
