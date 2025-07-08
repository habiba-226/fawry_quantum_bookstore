public class Main {
    public static void main(String[] args) {
        BookStore bookStore = new BookStore();

        bookStore.addBook(new PaperBook("001", "Java Fundamentals", "Alice", 2015, 200.0, 10));
        bookStore.addBook(new EBook("002", "Python Fundamentals", "Bob", 2020, 150.0, "PDF"));
        bookStore.addBook(new ShowcaseBook("003", "C Fundamentals", "John", 2020));
        bookStore.addBook(new PaperBook("004", "C# Fundamentals", "Dexter", 2015, 250.0, 2));
        bookStore.addBook(new PaperBook("005", "C++ Fundamentals", "Bella", 1990, 250.0, 2));


        //remove C Fundamentals
        bookStore.removeOutdatedBooks(10, 2025);

        //testing to buy paper book
        try {
            double paid = bookStore.buyBook("001", 2, "user@example.com", "Alexandria");
            System.out.println("Paid amount: " + paid);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            bookStore.buyBook("004", 5, "user@example.com", "Alexandria");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            bookStore.buyBook("005", 1, "user@example.com", "Alexandria");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //testing to buy ebook
        try {
            double paid = bookStore.buyBook("002", 1, "user@example.com", "Alexandria");
            System.out.println("Paid amount: " + paid);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //testing to buy showcase book
        try {
            bookStore.buyBook("003", 1, "user@example.com", "Alexandria");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}