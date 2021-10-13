package edu.isu.cs.cs2263;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CreateJson {

    public static void main(String args[]) {
        {
            //First Employee
            JSONObject studentDetails = new JSONObject();
            studentDetails.put("firstName", "Isaac");
            studentDetails.put("lastName", "Griffith");

            JSONObject studentObject = new JSONObject();
            studentObject.put("employee", studentDetails);

            //Second Employee
            JSONObject studentDetails2 = new JSONObject();
            studentDetails2.put("firstName", "Bob");
            studentDetails2.put("lastName", "Sampson");

            JSONObject studentObject2 = new JSONObject();
            studentObject2.put("employee", studentDetails2);

            //Third Employee
            JSONObject studentDetails3 = new JSONObject();
            studentDetails3.put("firstName", "Sarah");
            studentDetails3.put("lastName", "James");

            JSONObject employeeObject3 = new JSONObject();
            employeeObject3.put("employee", studentDetails3);

            //Add employees to list
            JSONArray studentList = new JSONArray();
            studentList.add(studentObject);
            studentList.add(studentObject2);
            studentList.add(employeeObject3);

            //Write JSON file
            try (FileWriter file = new FileWriter("students.json")) {
                //We can write any JSONArray or JSONObject instance to the file
                file.write(studentList.toJSONString());
                file.flush();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
