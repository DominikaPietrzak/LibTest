/**
 * Created by dominika on 10.01.18.
 */
import  java.util.Scanner;
import java.util.LinkedList;

public class Runner {


    public static void main(String[] args) {

        //LinkedList<Book> books = new LinkedList<Book>();
        //Scanner readOut = new Scanner(System.in);
        //TODO: after entering quit !!,no new book is added
        //TODO: add, a function that allows you to add new books to the old list so that they will not be overwritten

        addBook();
        getAllBooks(addBook());

    }

    public static LinkedList addBook() {

        LinkedList<Book> books = new LinkedList<Book>();
        Scanner readOut = new Scanner(System.in);
        String bookTitle;
        String author;
        do {
            System.out.println("Podaj tytuł");
            bookTitle = readOut.nextLine();

            if (bookTitle.equals("quit!!")) {
                break;
            }

            System.out.println("Podaj autora");
            author = readOut.nextLine();

            books.add(new Book(bookTitle, author));

            return books;
        }

        while (true);

        return books;
    }

    public static void getAllBooks(LinkedList books){

        for(int i=0; i<books.size();i++){
            System.out.println(books.get(i).getAuthor());
            System.out.println(books.get(i).getTitle());

        }
    }
}
