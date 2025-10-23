
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics stat = new Statistics();
        Statistics statsEven = new Statistics();
        Statistics statsOdd = new Statistics();
        System.out.println("Enter numbers:");
        while (true) {
         try {
        int number = Integer.parseInt(scanner.nextLine());
        if (number != -1){
            stat.addNumber(number);
            System.out.println(stat.average());
            if (number % 2 == 0){
                statsEven.addNumber(number);
            }else{
                statsOdd.addNumber(number);
            }
        } else {
            break;
        }
         } catch (Exception e){
         continue;
        }
        }
        System.out.println("Sum: " + stat.sum());
        System.out.println("Sum of even numbers: " + statsEven.sum());
        System.out.println("Sum of odd numbers: " + statsOdd.sum());
        
    }
}
