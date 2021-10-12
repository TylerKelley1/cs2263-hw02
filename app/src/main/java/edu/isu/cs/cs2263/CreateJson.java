package edu.isu.cs.cs2263;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CreateJson {

    public static void main(String args[]) {
        {
            //First Employee
            JSONObject employeeDetails = new JSONObject();
            employeeDetails.put("firstName", "Isaac");
            employeeDetails.put("lastName", "Griffith");

            JSONObject employeeObject = new JSONObject();
            employeeObject.put("employee", employeeDetails);

            //Second Employee
            JSONObject employeeDetails2 = new JSONObject();
            employeeDetails2.put("firstName", "Bob");
            employeeDetails2.put("lastName", "Sampson");

            JSONObject employeeObject2 = new JSONObject();
            employeeObject2.put("employee", employeeDetails2);

            //Third Employee
            JSONObject employeeDetails3 = new JSONObject();
            employeeDetails3.put("firstName", "Sarah");
            employeeDetails3.put("lastName", "James");

            JSONObject employeeObject3 = new JSONObject();
            employeeObject3.put("employee", employeeDetails3);

            //Add employees to list
            JSONArray employeeList = new JSONArray();
            employeeList.add(employeeObject);
            employeeList.add(employeeObject2);
            employeeList.add(employeeObject3);

            //Write JSON file
            try (FileWriter file = new FileWriter("employees.json")) {
                //We can write any JSONArray or JSONObject instance to the file
                file.write(employeeList.toJSONString());
                file.flush();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
