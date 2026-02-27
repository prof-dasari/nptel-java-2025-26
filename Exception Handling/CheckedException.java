
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {

    public static void main(String[] args) {
        try {
            File file = new File("nonexistent.txt");
            FileReader reader = new FileReader(file);
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }
}


