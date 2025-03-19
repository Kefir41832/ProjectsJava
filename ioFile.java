import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ioFile {
    public static void main(String[] args) {
        Path file = Paths.get("C:\\Users\\Surface\\Documents\\text.txt");
        //Writing
        String text = "We are lern Java with Aston.Company!";
        try{
            Files.write(file, text.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.println("String has add");
        }
        catch(IOException e){ e.printStackTrace(); }
        //Reading
        try{
            List<String> strs = Files.readAllLines(file);
            System.out.println("Datas of file:");
            strs.forEach(System.out::println);
        }
        catch (IOException e) { e.printStackTrace(); }
    }
    
}
