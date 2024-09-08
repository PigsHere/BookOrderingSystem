package models;

import java.util.ArrayList;

public class CustomersOrder {

    // ORDER DATA SECTION
    private CustomersInfo customerDetails;
    private ArrayList<BooksOrder> orderedBooks;

    public CustomersOrder(CustomersInfo customerDetails, ArrayList<BooksOrder> orderedBooks) {
        this.customerDetails = customerDetails;
        this.orderedBooks = orderedBooks;
    }

    // GETTER SECTION
    public CustomersInfo getCustomerDetails() {
        return customerDetails;
    }

    public ArrayList<BooksOrder> getOrderedBooks() {
        return orderedBooks;
    }

    // SETTER SECTION
    public void setCustomerDetails(CustomersInfo customerDetails) {
        this.customerDetails = customerDetails;
    }

    public void setOrderedBooks(ArrayList<BooksOrder> orderedBooks) {
        this.orderedBooks = orderedBooks;
    }

    public float calculateTotalAmount() {
        float totalAmount = 0;
        for (BooksOrder booksOrder : orderedBooks) {
            totalAmount += booksOrder.calculateOrderPrice();
        }
        return totalAmount;
    }

    public void processOrder() {
        System.out.println("Processing order for customer: " + customerDetails.getCustomerName());
        // Additional processing logic
    }
}
