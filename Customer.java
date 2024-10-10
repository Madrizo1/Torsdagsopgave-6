//Task 1: ArrayList og objekter
package Task1;

import java.util.ArrayList;



public class Customer {
    private String firstName;
    private String lastName;
    private String username;
    private int id;

    private static int counter = 0;

    public Customer(String firstName, String lastName, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.id = counter++;
    }

    //Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public int getId() {
        return id;
    }

    //Setters

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public static int getCounter() {
        return getCounter();
    }

    public String toString() {
        return "Customer ID: " + id + ", Name: " + firstName + " " + lastName + ", Username: " + username;
    }
}

