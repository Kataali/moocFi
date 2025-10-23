
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String filePath = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
//        ArrayList<String> persons = new ArrayList<>();
        try{
            Scanner recordsFile = new Scanner(Paths.get(filePath));
            int count = 0;
            int wins = 0;
            int losses = 0;
            while(recordsFile.hasNextLine()){
                String row = recordsFile.nextLine();
                String[] parts = row.split(",");
                String team1 = parts[0];
                String team2 = parts[1];
                int team1Score = Integer.valueOf(parts[2]);
                int team2Score = Integer.valueOf(parts[3]);
                if (team1.equals(team)){
                    count++;
                    if (team1Score > team2Score){
                        wins++;
                    } else {
                        losses++;
                    }
                } else if (team2.equals(team)){
                    count++;
                    if (team2Score > team1Score){
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }
            System.out.println("Games: " + count);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
