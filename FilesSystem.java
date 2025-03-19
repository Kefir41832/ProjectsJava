import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesSystem {
    public static void main(String[] args) {
        Path start = Paths.get("C:\\Users\\Surface\\Documents");
        try {
         Files.walk(start).forEach(path->{
           int depth = start.relativize(path).getNameCount(); 
           String indent = " ".repeat(depth);
           System.out.println(indent + "|-- " + path.getFileName());
           });  
        }
        catch(IOException e){ e.printStackTrace(); }
    }
}
