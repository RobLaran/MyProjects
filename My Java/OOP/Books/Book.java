package OOP.Books;

import java.util.ArrayList;

public class Book {
    static ArrayList<Book> collection = new ArrayList<Book>();

    private String title;
    private String author;
    private String ISBN;

    public Book(String title, String author, String ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getISBN(){
        return ISBN;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }

    public static void addBook(Book book){
        collection.add(book);
    }

    public static void removeBook(Book book){
        collection.remove(book);
    }

    public static ArrayList<Book> getAllBooks(){
        return collection;
    }

}
