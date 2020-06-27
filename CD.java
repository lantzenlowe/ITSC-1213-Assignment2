/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoweLantzenAssignment2;

/**
 * CD
 * @author Lantzen Lowe
 */
public class CD extends Account {
    private int holdingTime;
    private double withdrawalPenalty;
    
    /**
     * CD Constructor with parameters
     * @param accountHolder the account holder's name
     * @param number the account number
     * @param interestRate the interest rate of the account
     * @param holdingTime the number of years that must pass before money can be withdrawn from the account
     * @param withdrawalPenalty the amount of money that must be paid if money is withdrawn before the holding time passes
     */
    public CD(String accountHolder, int number, double interestRate, int holdingTime, double withdrawalPenalty) {
        super(accountHolder, number, interestRate);
        this.holdingTime = holdingTime;
        this.withdrawalPenalty = withdrawalPenalty;
    }

    /**
     * Method that gets the account's holding time in years
     * @return holdingTime
     */
    public int getHoldingTime() {
        return holdingTime;
    }

    /**
     * Method that sets the account's holding time
     * @param holdingTime the number of years that must pass before money can be withdrawn from the account
     */
    public void setHoldingTime(int holdingTime) {
        this.holdingTime = holdingTime;
    }

    /**
     * Method that gets the account's withdrawal penalty in dollars
     * @return withdrawalPenalty
     */
    public double getWithdrawalPenalty() {
        return withdrawalPenalty;
    }

    /**
     * Method that sets the account's withdrawal penalty
     * @param withdrawalPenalty the amount of money that must be paid if money is withdrawn before the holding time passes
     */
    public void setWithdrawalPenalty(double withdrawalPenalty) {
        this.withdrawalPenalty = withdrawalPenalty;
    }
    
    // print method (Account) - override
    @Override
    public String toString(){
        return super.toString() + "\tHolding time: " + this.holdingTime + " years\t\tWithdrawal penalty: $" + this.withdrawalPenalty;
    }

}
