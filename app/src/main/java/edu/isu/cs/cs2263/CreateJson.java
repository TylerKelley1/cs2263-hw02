/**
 * @author Tyler Kelley
 * @author CS2263 Homework 2 Isaac Griffith
 * @version 2.1.0
 * @since 1.0.0
 */
package edu.isu.cs.cs2263;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CreateJson {
    /**
     * Create a json file with all the students information
     * @param args main method
     */
    public static void main(String args[]) {
        {
            //First Student
            JSONObject studentDetails = new JSONObject();
            studentDetails.put("firstName", "Isaac");
            studentDetails.put("lastName", "Griffith");

            JSONObject studentObject = new JSONObject();
            studentObject.put("Student", studentDetails);

            //Second Student
            JSONObject studentDetails2 = new JSONObject();
            studentDetails2.put("firstName", "Bob");
            studentDetails2.put("lastName", "Sampson");

            JSONObject studentObject2 = new JSONObject();
            studentObject2.put("Student", studentDetails2);

            //Third Student
            JSONObject studentDetails3 = new JSONObject();
            studentDetails3.put("firstName", "Sarah");
            studentDetails3.put("lastName", "James");

            JSONObject studentObject3 = new JSONObject();
            studentObject3.put("Student", studentDetails3);

            //Add Students to list
            JSONArray studentList = new JSONArray();
            studentList.add(studentObject);
            studentList.add(studentObject2);
            studentList.add(studentObject3);

            //Write JSON file
            try (FileWriter file = new FileWriter("students.json")) {
                file.write(studentList.toJSONString());
                file.flush();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
