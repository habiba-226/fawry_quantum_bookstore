import java.util.*;

abstract class Book {
    private String ISBN;
    private String title;
    private String author;
    private int year;
    private double price;

    public Book(String ISBN, String title, String author, int year, double price) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double buy(int quantity, String email, String address);
}
