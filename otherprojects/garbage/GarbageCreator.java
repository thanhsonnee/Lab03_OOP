import java.io.FileReader;
import java.io.IOException;

public class GarbageCreator {
    public static void main(String[] args){
        String filename = "text.txt"; // text.txt is the name or path to an executable file
        byte[] inputBytes = { 0 };
        long startTime, endTime;

        inputBytes = Files.readAllBytes(Paths.get(filename));
        startTime = System.currentTimeMillis();
        String outputString = "";
        for (byte b : inputBytes) {
            outputString += (char) b;
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    } 
}
