/**
 * Created by dominika on 10.01.18.
 */
import  java.util.Scanner;
import java.util.LinkedList;

public class Runner {

    LinkedList<Book> books = new LinkedList<Book>();

    public static void main(String[] args) {
        //LinkedList<Book> books = new LinkedList<Book>();
        //LinkedList<Book> books = new LinkedList<Book>();
        //Scanner readOut = new Scanner(System.in);

        //TODO: add, a function that allows you to add new books to the old list so that they will not be overwritten
        Book createList = new Book();
        Book booksy = new Book();
        createList.addBook();

        createList.readAllBooks(createList.getAllBooks());


    }


    // TODO: dodaje książkę do pamięci




}
