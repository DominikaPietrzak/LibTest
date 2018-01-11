import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by dominika on 10.01.18.
 */
public class Book {
    /**
     * Created by dominika on 12.11.17.
     */
        LinkedList<Book> books = new LinkedList<Book>();
        private String title;
        private String author; //
        private boolean read;
        private boolean toRead;
        private String type; // for example horror fictional
        private int numberOfPages;
        private int lastPage;

        public Book(String title, String author, boolean read, boolean toRead, String type, int numberOfPages, int lastPage ){

            this.title = title;
            this.author = author;
            this.read = read;
            this.toRead = toRead;
            this.type = type;
            this.numberOfPages =numberOfPages;
            this.lastPage = lastPage;

        }

        public Book() {

        }

        public Book(String title, String author) {

            this.title = title;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public boolean getRead() { return read; }

        public boolean getToRead() {
            return toRead;
        }

        public String getType() {
            return type;
        }

        public int getNumberOfPages() {
            return numberOfPages;
        }

        public int getLastPage() {
            return lastPage;
        }

        public String getAuthor() { return author; }

        public void setAuthor(String author) { this.author = author; }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setRead(boolean read) {
            this.read = read;
        }

        public void setToRead(boolean toRead) {
            this.toRead = toRead;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setNumberOfPages(int numberOfPages) {
            this.numberOfPages = numberOfPages;
        }

        public void setLastPage(int lastPage) {
            this.lastPage = lastPage;
        }


    public  void addBook() {

        Scanner readOut = new Scanner(System.in);



        System.out.println("Podaj tytuł");
        this.title = readOut.nextLine();

        System.out.println("Podaj autora");
        this.author = readOut.nextLine();

        this.books.add(new Book(title, author));

        //int lastBookNumber = books.size();
        //Book lastBook = books.get(lastBookNumber);
        //return lastBook;
        // musi zwrócić typ Book
        }

    public LinkedList<Book>  getAllBooks(){ return books;}

    public   void readAllBooks (LinkedList<Book> books){ //LinkedList<Book> books

        for(int i=0; i< books.size();i++){
            System.out.println(books.get(i).getAuthor());
            System.out.println(books.get(i).getTitle());

        }
    }
    }

