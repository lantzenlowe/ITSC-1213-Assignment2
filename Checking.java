/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoweLantzenAssignment2;

/**
 * Checking
 * @author Lantzen Lowe
 */
public class Checking extends Account {
    private String cardNumber;

    /**
     * Checking Constructor with parameters
     * @param accountHolder the account holder's name
     * @param number the account number
     * @param interestRate the interest rate of the account
     * @param cardNumber the card number associated with the account
     */
    public Checking(String accountHolder, int number, double interestRate, String cardNumber) { 
        super(accountHolder, number, interestRate);
        this.cardNumber = cardNumber;
    }
            
    /**
     * Method that gets the checking account's card number
     * @return cardNumber
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Method that sets the checking account's card number
     * @param cardNumber the card number associated with the account
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    
    // print method (Account) - override
    @Override
    public String toString(){
        return super.toString() + "\tCard Number: " + this.cardNumber;
    }
}
