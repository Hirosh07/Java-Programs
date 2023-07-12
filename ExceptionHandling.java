import java.io.FileNotFoundException;
import java.io.IOException;
public class ${NAME} {
    public static void main(String[] args) {
        try {
            // code that may throw an exception
            File file = new File("myfile.txt");
            file.createNewFile();
        } catch (FileNotFoundException e) {
            // handle the exception
            System.out.println("File not found");
        } catch (IOException e) {
            // handle the exception
            System.out.println("IO Exception");
        } finally {
            // code that will always be executed
            System.out.println("This code will always be executed");
        }
    }
}

