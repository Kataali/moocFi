
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
        try {
            Scanner textFile = new Scanner(Paths.get("data.txt"));
            while (textFile.hasNextLine()){
                String row = textFile.nextLine();
                System.out.println(row);
            }
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
