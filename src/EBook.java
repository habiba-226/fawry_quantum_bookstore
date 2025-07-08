public class EBook extends Book {
    private String fileType;

    public EBook(String ISBN, String title, String author, int publishYear, double price, String fileType) {
        super(ISBN, title, author, publishYear, price);
        this.fileType = fileType;
    }

    @Override
    public double buy(int quantity, String email, String address) {
        if (quantity > 1) {
            throw new IllegalArgumentException("Only 1 Ebook is allowed");
        }
        MailService.send(email);
        return getPrice();
    }
}

