import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList();
        
        while(true){
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()){
                break;
            }
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year: ");
            int pubYear = Integer.valueOf(scanner.nextLine());
            Book curBook = new Book(title, pages, pubYear);
            books.add(curBook);
            }
        
            System.out.println("What information would you like to be printed?");
            String answer = scanner.nextLine();
            boolean isEverything = answer.toLowerCase().equals("everything");
            for (Book book : books){
                if (isEverything){
                    System.out.println(book);
                } else {
                    System.out.println(book.getName());
                }
        }
    }
}
