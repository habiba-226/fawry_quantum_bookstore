public class PaperBook extends Book{
    private int stock;

    public PaperBook(String ISBN, String title, String author, int publishYear, double price, int stock) {
        super(ISBN, title, author, publishYear, price);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public double buy(int quantity, String email, String address) {
        if (quantity > stock) {
            throw new IllegalArgumentException("Not enough stock to buy paper book: " +  getTitle());
        }
        stock -= quantity;
        ShippingService.send(address);
        return quantity * getPrice();
    }

}
