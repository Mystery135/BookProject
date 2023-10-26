import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many books do you want to input?");
        int booksToInput = scanner.nextInt();//error check
        List<Book> books = new ArrayList<>();
        for (int i = 0; i<booksToInput; i++){
            System.out.print("Input the ");
            System.out.print("Author: ");
            String author = scanner.nextLine();
            System.out.println(author);
            System.out.print("Title: ");
            String title = scanner.nextLine();
            System.out.print("# Pages: ");
            int pages = scanner.nextInt();//error check
            System.out.print("Borrowed: ");
            boolean borrowed = scanner.nextBoolean();//error check

            books.add(new Book(author, title, pages, borrowed));
        }

        printBooks(books);

    }

    private static void printBooks(List<Book> books){
        System.out.println("Books:");
        for (Book book : books){
            System.out.println("- Author: " + book.getTitle() + "\tTitle: " + book.getTitle() + "\tPages: " + book.getPages() + "\tBorrowed: " + book.isBorrowed());
        }
    }
    private static void printBorrowed(List<Book> books){
        System.out.println("Borrowed books:");

        for (Book book : books){
            if (book.isBorrowed()){
                System.out.println("- Author: " + book.getTitle() + "\tTitle: " + book.getTitle() + "\tPages: " + book.getPages() + "\tBorrowed: " + book.isBorrowed());
            }
        }
        }

}
