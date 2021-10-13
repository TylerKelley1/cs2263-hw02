/**
 * @author Tyler Kelley
 * @author CS2263 Homework 2 Isaac Griffith
 * @version 2.0.0
 * @since 1.0.0
 */
package edu.isu.cs.cs2263;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;
import java.io.FileReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/**
 * IO manager class to read in the json file and write to our lists
 */
public class IOManager {

    List<Student> Students;
    int i = 0;
    String name;

    /**
     * Default constructor to make an IOManager object
     */
    public IOManager() {
    }

    /**
     * Method that will read a json file given the correct file path
     * @param file the file path where the json file is saved
     * @return the List of students that need to be added to the students list
     */
    public List<Student> readData(String file) {
/**
 * Try to read the json file using gson and create a list of students using gson.fromjson
 */
        try {
            Gson gson = new Gson();

            Reader reader = Files.newBufferedReader(Paths.get(file));

            Students = new Gson().fromJson(reader, new TypeToken<List<Student>>() {
            }.getType());
            writeData(Students);

            reader.close();

/**
 * Catch the error where either there is no file given or not the correct file path
 */
        } catch (Exception error) {
            System.out.println("ERROR NO SUCH FILE OR WRONG FILE PATH");

        }
        return Students;
    }

    /**
     * Method that will find alll the details of each student and add them to a list with correct names
     * @param list the list of students that was created from reading the json file
     */
    public void writeData(List<Student> list) {
        for(Object firstName  : list) {
            i++;
        }
    }
}
