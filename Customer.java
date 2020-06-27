/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoweLantzenAssignment2;

import java.util.ArrayList;

/**
 * Customer
 * @author Lantzen Lowe
 */
public class Customer extends Person {
    private ArrayList<Account> accounts = new ArrayList<>();

    /**
     * Customer constructor
     * @param name name of customer
     */
    public Customer(String name) {
        super(name, 0);
    }
    
    /**
     * Method that adds an account to the customer's account list
     * @param a the account that will be added
     */
    public void addAccount(Account a){
        accounts.add(a);
    }
    
    /**
     * Customer toString method
     * @return String
     */
    @Override
    public String toString(){   // print method (Person) - override
        return "Name: " + this.getName();
    }
}
