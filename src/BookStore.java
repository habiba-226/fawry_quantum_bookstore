import java.util.*;

public class BookStore {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("The book added is " + book.getTitle());
    }

    public void removeOutdatedBooks(int max, int currentYear) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (currentYear - book.getYear() > max) {
                System.out.println("Outdated book removed is " + book.getTitle());
                iterator.remove();
            }
        }
    }

    public double buyBook(String ISBN, int quantity, String email, String address) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                return book.buy(quantity, email, address);
            }
        }
        throw new IllegalArgumentException("Book not found with ISBN: " + ISBN);
    }
}