/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoweLantzenAssignment2;

import java.util.ArrayList;

/**
 * Bank
 * @author Lantzen Lowe
 */
public class Bank {
    private ArrayList<Account> accounts;
    private ArrayList<Employee> employees;
    private ArrayList<Customer> customers;

    /**
     * Bank Constructor
     */
    public Bank() {
        accounts = new ArrayList<>();
        employees = new ArrayList<>();
        customers = new ArrayList<>();
    }
    
    /**
     * Method that adds an account entry to the bank account list
     * @param entry account entry
     */
    public void addAccount(Account entry){
        Customer cust = null;
        boolean exists = false;
        for(Customer c: customers){
            if(c.getName().matches(entry.getAccountHolder())){
                exists = true;
                cust = c;
                cust.addAccount(entry);
            }
        }
        if(exists == false){
            cust = new Customer(entry.getAccountHolder());
            addCustomer(cust);
            cust.addAccount(entry);
        }
        accounts.add(entry);
        
    }
    
    /**
     * Method that uses the account holder's name to find an account
     * @param holderName account holder's name
     */
    public void findAccount(String holderName){
        boolean found = false;
        for(Account a: accounts){
            if(a.getAccountHolder().matches(holderName)){
                found = true;
                System.out.println(a);
                return;
            }
        }
        if(found == false)
            System.out.println("This user does not have any accounts.");
    }

    /**
     * Method that uses the account number to find and remove an account
     * @param accountNumber account number
     */
    public void removeAccount(int accountNumber){
        boolean found = false;
        for(Account a: accounts){
            if(a.getAccountNumber() == accountNumber) {
                accounts.remove(a);
                System.out.println("The account has been removed.");
                found = true;
                break;
            }
        }
        if(found == false)
            System.out.println("The account could not be found.");
    }
    
    /**
     * Method that adds a new employee to the employee list
     * @param newHire the new employee
     */
    public void hireEmployee(Employee newHire){
        employees.add(newHire);
    }
    
    /**
     * Method that uses an employee's name to locate and remove them from the employee list
     * @param name the name of the employee that will be fired
     */
    public void fireEmployee(String name){
        boolean found = false;
        for(Employee e: employees){
            if(e.getName().matches(name)){
                employees.remove(e);
                System.out.println("The employee has been fired.");
                found = true;
                break;
            }
        }
        if(found == false)
            System.out.println("This individual does not work here.");
    }
    
    /**
     * Method that adds a new customer to the customer list
     * @param newCustomer the new customer
     */
    public void addCustomer(Customer newCustomer){
        customers.add(newCustomer);
    }
    
    /**
     * Method that uses a customer's name to locate and remove them from the customer list
     * @param name the name of the customer that will be removed
     */
    public void dropCustomer(String name){
        boolean found = false;
        for(Customer c: customers){
            if(c.getName().matches(name)){
                customers.remove(c);
                System.out.println("The customer has been removed.");
                found = true;
                break;
            }
        }
        if(found == false)
            System.out.println("The customer could not be found.");
    }

    /**
     * Method that returns the account list
     * @return accounts
     */
    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    /**
     * Method that returns the employee list
     * @return employees
     */
    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    /**
     * Method that returns the customer list
     * @return customers
     */
    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    /**
     * Method that prints all the bank's information
     */
    public void print(){    // print method (Bank)
        System.out.println("\n\tBANK ");
        System.out.println("ACCOUNTS:");
        for(Account a : accounts)
            System.out.println(a);
        System.out.println();
        System.out.println("EMPLOYEES:");
        for(Employee e: employees)
            System.out.println(e);
        System.out.println();
        System.out.println("CUSTOMERS:");
        for(Customer c: customers)
            System.out.println(c);
    }
}
