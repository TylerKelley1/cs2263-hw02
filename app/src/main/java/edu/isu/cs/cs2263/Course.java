/**
 * @author Tyler Kelley
 * @author CS2263 Homework 2 Isaac Griffith
 * @version 2.0.0
 * @since 1.0.0
 */
package edu.isu.cs.cs2263;

/**
 * Class used to store and get courses each student has
 */
public class Course {

    private int number;
    private String subject;
    private String title;

    /**
     * Default constructor method to create a course object
     */
    public Course(){

    }

    /**
     * Method used to get the course number
     * @return the course number
     */
    public int getNumber() {
        return number;
    }

    /**
     * Method used to get the subject of the course
     * @return the subject
     */
    public String getSubject(){
        return subject;
    }

    /**
     * Method used to get the title of the course
     * @return the title of the course
     */
    public String getTitle(){
        return title;
    }

    /**
     * Set method to set the course number to a variable to be used later
     * @param number the course number of the current selected course
     */
    public void setNumber(int number){
        this.number = number;
    }

    /**
     * Set method to set the subject of the course to a variable to be used later
     * @param subject the subject that the course falls under
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * Set method to set the title of the course to a variable to be used later
     * @param title the title of the course
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Method used to create a string to put in the list of all the components inside the course object
     * @return the course with all the needed details
     */
    public String toString(){
        return number + subject + title;
    }
}
