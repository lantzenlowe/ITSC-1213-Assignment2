/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoweLantzenAssignment2;

/**
 * Account
 * @author Lantzen Lowe
 */
public class Account {
    private String accountHolder;
    private double balance;
    private int number;
    private double interestRate;

    /**
     * Account Constructor with parameters
     * @param accountHolder the account holder's name
     * @param number the account number
     * @param interestRate the interest rate of the account
     */
    public Account(String accountHolder, int number, double interestRate) {
        this.accountHolder = accountHolder;
        this.number = number;
        this.interestRate = interestRate;
    }

    /**
     * Method that gets the account's balance
     * @return balance
     */
    public double getBalance() {
        return balance;
    }
    
    /**
     * Method that deposits money into the account's balance
     * @param money the amount of money that will be deposited
     */
    public void deposit(double money){
        balance += money;
    }
    
    /**
     * Method that withdraws money from the account's balance
     * @param money the amount of money that will be withdrawn
     */
    public void withdraw(double money){
        if(money >= balance){
            balance -= money;
            System.out.println("Money has been withdrawn.");
        }
        else 
            System.out.println("Your withdrawal amount exceeds the available funds.");
    }

    /**
     * Method that gets the account holder's name
     * @return accountHolder
     */
    public String getAccountHolder() {
        return accountHolder;
    }

    /**
     * Method that sets the account holder's name
     * @param accountHolder the account holder's name
     */
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    
    /**
     * Method that gets the account's number
     * @return number
     */
    public int getAccountNumber() {
        return number;
    }

    /**
     * Method that sets the account's number
     * @param number the account number
     */
    public void setAccountNumber(int number) {
        this.number = number;
    }

    /**
     * Method that gets the account's interest rate
     * @return interestRate
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * Method that sets the account's interest rate
     * @param interestRate the interest rate of the account
     */
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    
    // print method (Account) - override
    @Override
    public String toString(){
        return "Account holder: " + this.accountHolder + "\tAccount Number: " + this.number + "\tBalance: " + this.balance;
    }
    
}
