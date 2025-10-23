
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file: ");
        String file = scanner.nextLine();
        try {
            Scanner textFile = new Scanner(Paths.get(file));
            boolean found = false;
            while (textFile.hasNextLine()){
                String row = textFile.nextLine();
                String[] parts = row.split(",");
                String name = parts[0];
                String age = parts[1];
                String qualifier = (Integer.valueOf(age) == 1)? " year" : " years";
                System.out.println(name + ", age: " + age + qualifier );
            }
        } catch (Exception e){
            System.out.println("Reading the file " + file + " failed.");
        }
    }
}
