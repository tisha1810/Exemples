package examples.json;

import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonExample {

    public static void main(String[] args) throws IOException {
        String data = new String(Files.readAllBytes(Paths.get("/Users/tisha/IdeaProjects/Exemples/Person DATA.json")));
        JSONObject jsonObject = new JSONObject(data);

        String name = jsonObject.getString("name");
        String sex = jsonObject.getString("sex");
        int age = jsonObject.getInt("age");

        System.out.println(name);
        System.out.println(sex);
        System.out.println(age);

        FileWriter file = new FileWriter("Boris.json");
        file.write(jsonObject.toString());
        file.flush();
        file.close();
    }
}
