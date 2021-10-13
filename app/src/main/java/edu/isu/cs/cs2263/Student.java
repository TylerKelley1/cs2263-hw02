/**
 * @author Tyler Kelley
 * @author CS2263 Homework 2 Isaac Griffith
 * @version 2.0.0
 * @since 1.0.0
 */
package edu.isu.cs.cs2263;

/**
 * Public class student that will help gather and send student information
 */
public class Student {
    /**
     * Variables used to get first and last names
     */
    public String firstName;
    public String lastName;

    /**
     * Student constructor to create a student object
     */
    public Student(){

    }

    /**
     * Set the firstname to the string varaible firstName
     * @param firstName The students first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Set the last name to the string variable lastName
     * @param lastName students last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Get the first name of the current student object
     * @return the students first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Get the last name of the current student object
     * @return students last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Get the students first name and last name as one whole string
     * @return a string of the students full name in one combined string
     */
    public String toString(){
        return firstName + lastName;
    }
}
