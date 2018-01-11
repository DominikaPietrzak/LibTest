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
        String author;
        do {
            System.out.println("Podaj tytuł");
            bookTitle = readOut.nextLine();

            System.out.println("Podaj autora");

            author = readOut.nextLine();

            books.add(new Book(bookTitle, author));

        }

        while (!bookTitle.equals("quit!!"));

        for(int i=0; i<books.size();i++){
            System.out.println(books.get(i).getAuthor());
            System.out.println(books.get(i).getTitle());

        }

    }
}
