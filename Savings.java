/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoweLantzenAssignment2;

/**
 * Savings
 * @author Lantzen Lowe
 */
public class Savings extends Account {
    private int maxWithdrawals;

    /**
     * Savings Constructor with parameters
     * @param accountHolder the account holder's name
     * @param number the account number
     * @param interestRate the interest rate of the account
     * @param maxWithdrawals the maximum number of withdrawals allowed for the account
     */
    public Savings(String accountHolder, int number, double interestRate, int maxWithdrawals) {  
        super(accountHolder,number, interestRate);
        this.maxWithdrawals = maxWithdrawals;
    }
        
    /**
     * Method that gets the maximum number of withdrawals
     * @return maxWithdrawals
     */
    public int getMaxWithdrawals() {
        return maxWithdrawals;
    }

    /**
     * Method that sets the maximum number of withdrawals
     * @param maxWithdrawals the maximum number of withdrawals allowed for the account
     */
    public void setMaxWithdrawals(int maxWithdrawals) {
        this.maxWithdrawals = maxWithdrawals;
    }
        
    // print method (Account) - override
    @Override
    public String toString(){
        return super.toString() + "\tMax withdrawals: " + this.maxWithdrawals;
    }
}
