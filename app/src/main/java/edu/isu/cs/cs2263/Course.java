package edu.isu.cs.cs2263;

public class Course {

    private int number;
    private String subject;
    private String title;

    public Course(){

    }

    public int getNumber() {
        return number;
    }

    public String getSubject(){
        return subject;
    }

    public String getTitle(){
        return title;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString(){
        return number + subject + title;
    }
}
