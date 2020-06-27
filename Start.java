/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoweLantzenAssignment2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Start
 * @author Lantzen Lowe
 * 
 * 5 Major functions
 *      addAccount(Account a)
 *          This method adds account a to the bank, creates a new customer with the account holder's name, and adds the account to the customer's account list. 
 *      findAccount(String holderName)
 *          This method locates an account with the account holder (holderName) and prints out the account information.
 *      removeAccount(int accountNumber)
 *          This method takes in the account number as a parameter and removes the corresponding account from the bank.
 *      hireEmployee(Employee e)
 *          This method adds employee e to the bank staff/employee list.
 *      print()
 *          This method prints all of the bank's information (accounts, employees, and customers).
 */
public class Start {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice = -1;
        Bank bank = new Bank();
        System.out.println("\nHello trusted employee, welcome to the Global Bank!");
        try{
            while(choice != 0){
                displayMenu();
                choice = scan.nextInt();    // Get user input for menu choice
                //System.out.println();
                if(choice < 0 || choice > 7)
                    throw new Exception("Input out of bounds.");    // Throw exception if user input is out of bounds
                switch(choice){
                    case 0: // Exit
                        break;
                    case 1: // Open account
                        int accountType = 0;
                        // Display various account types and get user choice
                        System.out.println("\tAccount Types");
                        System.out.println("1. Checking");
                        System.out.println("2. Savings");
                        System.out.println("3. CD");
                        System.out.print("What type of account would you like to open? ");
                        accountType = scan.nextInt();
                        if(accountType > 3 || accountType < 0)
                            throw new Exception("Input out of bounds.");    // Throw exception if user choice is out of bounds
                        switch(accountType){    // Get account information based on user choice
                            case 1:
                                int number1 = bank.getAccounts().size() + 1;
                                double interest1 = 0.04; 
                                System.out.print("Enter the name of the account holder: ");
                                scan.nextLine();
                                String holderName1 = scan.nextLine();
                                System.out.print("Enter the 12-digit card number for this new checking account: ");
                                String cardNumber = scan.next();
                                bank.addAccount(new Checking(holderName1, number1, interest1, cardNumber));     // Use input information to create new Checking object
                                System.out.println("You have successfully opened a new Checking account for " + holderName1 + ".");
                                break;
                            case 2:
                                int number2 = bank.getAccounts().size() + 1;
                                double interest2 = 0.018;
                                System.out.print("Enter the name of the account holder: ");
                                scan.nextLine();
                                String holderName2 = scan.nextLine();
                                bank.addAccount(new Savings(holderName2, number2, interest2, 5));       // Use input information to create new Savings object
                                System.out.println("You have successfully opened a new Savings account for " + holderName2 + ".");
                                break;
                            case 3:
                                int number3 = bank.getAccounts().size() + 1;
                                double interest3 = 0.0084;
                                System.out.print("Enter the name of the account holder: ");
                                scan.nextLine();
                                String holderName3 = scan.nextLine();
                                bank.addAccount(new CD(holderName3, number3, interest3, 5 , 100.0));        // Use input information to create new CD object
                                System.out.println("You have successfully opened a new CD account " + holderName3 + ".");
                                break;
                        }
                        break;
                    case 2:   // Find account
                        System.out.print("Enter the account holder's name: ");
                        scan.nextLine();
                        String holder = scan.nextLine();
                        bank.findAccount(holder);       // Locate account using user input for account holder's name
                        break;
                    case 3: // Close account
                        System.out.print("Enter the account number of the account you would like to close: ");
                        int accountNumber = scan.nextInt();
                        bank.removeAccount(accountNumber);      // Remove the account which has the corresponding account number
                        break;
                    case 4: // Hire employee
                        // Get the name, position and salary of the new employee
                        System.out.print("Enter the name of the new employee: ");
                        scan.nextLine();
                        String newEmployeeName = scan.nextLine();
                        System.out.print("Enter the position of the new employee: ");
                        String position = scan.nextLine();
                        System.out.print("Enter the salary of the new employee: ");
                        double salary = scan.nextDouble();
                        bank.hireEmployee(new Employee(newEmployeeName, bank.getEmployees().size() + 1, position, salary));   // Use the user input information to create the new Employee object and add it to the bank
                        System.out.println("You have successfully added " + newEmployeeName + " to the staff.");
                        break;
                    case 5: // Fire employee
                        System.out.print("Enter the name of the employee you would like to fire: ");
                        scan.nextLine();
                        String employeeName = scan.nextLine();
                        bank.fireEmployee(employeeName);    // Remove the employee with the name that corresponds to the user-provided name
                        break;
                    case 6: // Remove customer
                        System.out.print("Enter the name of the customer you would like to remove: ");
                        scan.nextLine();
                        String customerName = scan.nextLine();
                        bank.dropCustomer(customerName);    // Remove the customer with the name that corresponds to the user-provided name
                        break;
                    case 7: // Print bank information
                        bank.print();
                        break;
                }
            }
        }catch(InputMismatchException e){       // Catch if the user provides an input that varies from the desired input type
            System.out.println("Invalid input type.");
        }catch(Exception e){                    // Catch new Excpetion
            System.out.println(e.getMessage());
        }
    }
    
    public static void displayMenu(){   // Method that displays the menu
        System.out.println("\n\tMENU");
        System.out.println("1. Open account");
        System.out.println("2. Find account");
        System.out.println("3. Close account");
        System.out.println("4. Hire employee");
        System.out.println("5. Fire employee");
        System.out.println("6. Remove customer");
        System.out.println("7. Print bank information");
        System.out.println("0. Exit");
        System.out.print("Enter choice: ");
    }
}
