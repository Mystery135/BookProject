import java.util.ArrayList;
import java.util.Scanner;

public class BookClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many books do you want to input?");

        int booksToInput = getNextInt(scanner, "How many books do you want to input?", true);
        scanner.nextLine();//Make scanner go to next line
        ArrayList<Book> books = new ArrayList<>();
        for (int i = 0; i<booksToInput; i++){
            System.out.println();
            System.out.println("Book #" + (i+1));
            System.out.print("Author (First Name Last Name): ");
            String author = scanner.nextLine();
            System.out.print("Title: ");
            String title = scanner.nextLine();
            System.out.print("# Pages: ");
            int pages = getNextInt(scanner, "# Pages: ", false);
            scanner.nextLine();
            System.out.print("Borrowed (true/false): ");
            boolean borrowed = getNextBoolean(scanner, "Borrowed (true/false): ", false);
            scanner.nextLine();
            books.add(new Book(author, title, pages, borrowed));//Adds ?????nhiosgfdsg
        }
    }
    private static int getNextInt(Scanner scanner, String prompt, boolean println){
        while (!scanner.hasNextInt()){
            System.out.println("Input a valid integer!");
            if (println){
                System.out.println(prompt);
            }else{
                System.out.print(prompt);
            }
            scanner.nextLine();
        }
        return scanner.nextInt();
    }
    private static boolean getNextBoolean(Scanner scanner, String prompt, boolean println){
        while (!scanner.hasNextBoolean()){
            System.out.println("Input a valid boolean! (true/false)");
            if (println){
                System.out.println(prompt);
            }else{
                System.out.print(prompt);
            }
            scanner.nextLine();
        }
        return scanner.nextBoolean();
    }
    private static void printBooks(ArrayList<Book> books, boolean details){
        System.out.println("Books:");
        for (Book book : books) {
            System.out.print("- ");
            if (details) {
                book.printDetails();
            } else {
                book.printTitle();
            }
            book.printTitle();
            System.out.println();
        }
    }
    private static void printBorrowed(ArrayList<Book> books, boolean details){
        System.out.println("Books:");
        for (Book book : books) {
            if (book.isBorrowed()) {
                System.out.print("- ");
                if (details) {
                    book.printDetails();
                } else {
                    book.printTitle();
                }
                System.out.println();
            }
        }
    }

}
