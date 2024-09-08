package models;

public class BooksInfo {

    // BOOKS DATA SECTION
    private String bookTitle;
    private String bookAuthor;
    private String bookInformation;
    private float bookPrice;
    private int bookQuantity;
    private boolean isBookInStock;
    private BookGenres bookGenre;

    public BooksInfo(String bookTitle, String bookAuthor, String bookInformation, float bookPrice, int bookQuantity, boolean isBookInStock, BookGenres bookGenre) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookInformation = bookInformation;
        this.bookPrice = bookPrice;
        this.bookQuantity = bookQuantity;
        this.isBookInStock = isBookInStock;
        this.bookGenre = bookGenre;
    }

    // GETTER SECTION
    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getBookInformation() {
        return bookInformation;
    }

    public float getBookPrice() {
        return bookPrice;
    }

    public int getBookQuantity() {
        return bookQuantity;
    }

    public boolean isBookInStock() {
        return bookQuantity > 0;
    }

    public BookGenres getBookGenre() {
        return bookGenre;
    }

    // SETTER SECTION
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public void setBookInformation(String bookInformation) {
        this.bookInformation = bookInformation;
    }

    public void setBookPrice(float bookPrice) {
        this.bookPrice = bookPrice;
    }

    public void setBookQuantity(int bookQuantity) {
        this.bookQuantity = bookQuantity;
    }

    public void setBookGenre(BookGenres bookGenre) {
        this.bookGenre = bookGenre;
    }
}
