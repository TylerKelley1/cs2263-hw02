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

public class IOManager {

    List<Student> Students;
    int i = 0;
    String name;

    public IOManager() {
    }

    public List<Student> readData(String file) {

        try {
            Gson gson = new Gson();

            Reader reader = Files.newBufferedReader(Paths.get(file));

            Students = new Gson().fromJson(reader, new TypeToken<List<Student>>() {
            }.getType());
            writeData(Students);

            reader.close();


        } catch (Exception error) {
            System.out.println("ERROR NO SUCH FILE");

        }
        return Students;
    }

    public void writeData(List<Student> list) {
        for(Object firstName  : list) {
            i++;
        }
    }
}
