package edu.isu.cs.cs2263;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class IOManager {

    List<Student> Students;
    String i = "0";

    public IOManager() {
    }

    public String readData(String file) {

        try {
            Gson gson = new Gson();

            Reader reader = Files.newBufferedReader(Paths.get(file));

            Students = new Gson().fromJson(reader, new TypeToken<List<Student>>() {
            }.getType());
            Students.forEach(System.out::println);
            writeData(Students);

            reader.close();


        } catch (Exception error) {
            error.printStackTrace();
            System.out.println("ERROR NO SUCH FILE");

        }
        return i;
    }

    public void writeData(List<Student> list) {
        Student currentStudent = new Student();
        for(Object employee  : list) {
            i += "1";
        }
    }
}
