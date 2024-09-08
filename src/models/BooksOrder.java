package models;

public class BooksOrder {

    // ORDER DATA SECTION
    private BooksInfo book;
    private int quantity;

    public BooksOrder(BooksInfo book, int quantity) {
        this.book = book;
        this.quantity = quantity;
    }

    // GETTER SECTION
    public BooksInfo getBook() {
        return book;
    }

    public int getQuantity() {
        return quantity;
    }

    // SETTER SECTION
    public void setBook(BooksInfo book) {
        this.book = book;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float calculateOrderPrice() {
        return book.getBookPrice() * quantity;
    }
}
