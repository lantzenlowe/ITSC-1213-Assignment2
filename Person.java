/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoweLantzenAssignment2;

/**
 * Person
 * @author Lantzen Lowe
 */
public class Person {
    private String name;
    private int id; // changed from String to int
    
    /**
     * Person Constructor
     */
    public Person(){
        name = "NoName";
        id = 0;
    }

    /**
     * Person Constructor with parameters
     * @param name name of person
     * @param id id number of person
     */
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    /**
     * Method that gets the person's name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Method that sets the person's name
     * @param name name of person
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method that gets the person's id
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Method that sets the person's id
     * @param id id number of person
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * Person toString method
     * @return String
     */
    // print method (Person)
    @Override
    public String toString(){
        return "Name: " + this.name + "\tID: " + this.id;
    }
}
