public class ShowcaseBook extends Book {
    public ShowcaseBook(String ISBN, String title, String author, int publishYear) {
        super(ISBN, title, author, publishYear, 0);
    }

    @Override
    public double buy(int quantity, String email, String address) {
        throw new UnsupportedOperationException("Showcase book not for sale.");
    }
}