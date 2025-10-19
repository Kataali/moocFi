
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("First name: ");
            String firstName = scanner.nextLine();
            if (firstName.isEmpty()) {
                break;
            }

            System.out.print("Last name: ");

            String lastName = scanner.nextLine();

            System.out.println("Identification number: ");
            String id = scanner.nextLine();

            // We add a new person to the list.
            // The person's name and age were decided by the user
            infoCollection.add(new PersonalInformation(firstName, lastName, id));
        }
        System.out.println("\n");
        for (PersonalInformation info : infoCollection){
            System.out.println(info.getFirstName().concat(" " + info.getLastName()));
        }
    }
}
