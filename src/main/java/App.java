import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import com.google.gson.Gson;
/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            Gson gson = new Gson();
            FileReader jsonFile = new FileReader("src/main/java/Countact.json");
            BookQuiry [] book = gson.fromJson(jsonFile, BookQuiry[].class);
            System.out.println(book.length);
            Random random = new Random();
            int randomNumber = random.nextInt(100-1) + 1;
            System.out.println(book[randomNumber]);
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }}

}

