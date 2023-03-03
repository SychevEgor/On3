package Calculate;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;



public class Logger {
    public static void log(Complex a, Complex b, String move, Complex result) {
        Date now  = new Date();
        try {
            FileWriter fileToWtite = new FileWriter("C:\\Users\\egorc\\IdeaProjects\\On3\\src\\main\\java\\Calculate\\log.txt", true);
            fileToWtite.write(now + ": " + a.toString() + move + b.toString() + "=" + result.toString() + "\n");
            fileToWtite.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

