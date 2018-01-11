/**
 * Created by dominika on 10.01.18.
 */
import  java.util.Scanner;
import java.util.LinkedList;
public class Runner {


    public static void main(String[] args) {

        LinkedList<Book> books = new LinkedList<Book>();
        Scanner readOut = new Scanner(System.in);


        String bookTitle;
        do {
            Book book2 = new Book();
            bookTitle = readOut.nextLine();
            book2.setTitle(bookTitle);

            System.out.println("Podaj autora");
            String author;
            author = readOut.nextLine();
            book2.setAuthor(author);
            books.add(new Book(String bookTitle, String author));

        }

        while (bookTitle.equals("quit!!"));

        for(int i)

    }
}
