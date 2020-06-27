/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoweLantzenAssignment2;

/**
 * Employee
 * @author Lantzen Lowe
 */
public class Employee extends Person {
    private String position;
    private double salary;

    /**
     * Employee Constructor with Person parameters
     * @param name the name of the employee
     * @param id the id number of the employee
     */
    public Employee(String name, int id) {
        super(name, id);
        position = "None";
        salary = 0.0;
    }

    /**
     * Employee Constructor with Person and Employee parameters
     * @param name the name of the employee
     * @param id the id number of the employee
     * @param position the position of the employee
     * @param salary the salary of the employee
     */
    public Employee(String name, int id, String position, double salary) { 
        super(name, id);
        this.position = position;
        this.salary = salary;
    }
    
    /**
     * Method that gets the employee's position
     * @return position
     */
    public String getPosition() {
        return position;
    }

    /**
     * Method that sets the employee's position
     * @param position the position of the employee
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * Method that gets the employee's salary
     * @return salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Method that sets the employee's salary
     * @param salary the salary of the employee
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    // print method (Person) - override
    @Override
    public String toString(){
        return super.toString() + "\tPosition: " + this.position + "\tSalary: $" + this.salary;
    }
}
