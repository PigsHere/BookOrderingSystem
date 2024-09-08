import models.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // VARIABLES
        Scanner myInput = new Scanner(System.in);
        ArrayList<BookGenres> genres = new ArrayList<>();
        ArrayList<BooksInfo> books = new ArrayList<>();
        ArrayList<BooksOrder> booksOrderList = new ArrayList<>();

        // GENRES STORING ARRAYLIST SECTION
        genres.add(new BookGenres("Fiction", "A genre based on fictional works and facts created by the author.", 20));
        genres.add(new BookGenres("Non-Fiction", "A genre containing actual real-world facts and information", 15));
        genres.add(new BookGenres("Science Fiction", "A genre which explores stories by connecting realism and fiction", 12));
        genres.add(new BookGenres("Fantasy", "A genre featuring magical, mystic, and mythical elements.", 18));
        genres.add(new BookGenres("Mystery", "A genre centered around creating questions and solving them.", 10));
        genres.add(new BookGenres("Romance", "A genre focused on romantic relationships between the main characters.", 25));
        genres.add(new BookGenres("Thriller", "A genre built on creating suspense and excitement.", 14));
        genres.add(new BookGenres("Historical", "A genre which explores events of a specific time period.", 9));
        genres.add(new BookGenres("Biography", "A genre on the life of an individual.", 8));

        // BOOKS STORING ARRAYLIST SECTION
        books.add(new BooksInfo("The Great Jellybean Heist of 3021", "B. Wacky", "A thrilling adventure about a gang of jellybeans planning the ultimate heist.", 99.99f, 15, true, genres.get(0)));
        books.add(new BooksInfo("The Amazing Adventures of Captain Mustache", "D. Silly", "A non-fiction account of a superhero with an extraordinary mustache saving the world.", 129.99f, 7, true, genres.get(1)));
        books.add(new BooksInfo("Aliens Love Pineapple Pizza Too", "S. Quirk", "A sci-fi exploration of intergalactic food preferences and the universal love for pineapple pizza.", 159.99f, 20, true, genres.get(2)));
        books.add(new BooksInfo("The Chronicles of the Talking Rubber Duck", "F. Giggly", "A fantasy saga about a magical rubber duck that has epic conversations with bath toys.", 199.99f, 5, true, genres.get(3)));

        for (BooksInfo book : books) {
            System.out.println("Title: " + book.getBookTitle());
            System.out.println("Author: " + book.getBookAuthor());
            System.out.println("Genre: " + book.getBookGenre().getGenreName());
            System.out.println("Description: " + book.getBookInformation());
            System.out.println("Price: Rs" + book.getBookPrice());
            System.out.println("Stock: " + book.getBookQuantity());
            System.out.println();
        }

        // CUSTOMER INFORMATION SECTION
        System.out.println("Enter your name:");
        String name = myInput.nextLine();

        System.out.println("Enter your email:");
        String email = myInput.nextLine();

        System.out.println("Enter your city:");
        String city = myInput.nextLine();

        System.out.println("Enter your resident number:");
        String residentNo = myInput.nextLine();

        CustomersInfo customerInfo = new CustomersInfo(name, email, city, residentNo, 0);

        boolean ordering = true;
        while (ordering) {
            System.out.println("Which book do you want to order? (Enter a number corresponding to the book title)");
            int bookIndex = myInput.nextInt() - 1;
            if (bookIndex >= 0 && bookIndex < books.size()) {

                BooksInfo selectedBook = books.get(bookIndex);

                System.out.println("How many copies do you want?");
                int quantity = myInput.nextInt();

                if (quantity <= selectedBook.getBookQuantity()) {

                    BooksOrder booksOrder = new BooksOrder(selectedBook, quantity);
                    booksOrderList.add(booksOrder);
                    selectedBook.setBookQuantity(selectedBook.getBookQuantity() - quantity);

                    System.out.println("Successfully added to your cart.");
                } else {
                    System.out.println("Quantity is unavailable.");
                }
            } else {
                System.out.println("Invalid number.");
            }

            // Clear the newline character left by nextInt()
            myInput.nextLine();

            System.out.println("Do you want to order more books? (Y/N)");
            String userChoice = myInput.nextLine();

            if (!userChoice.toUpperCase().equals("Y")) {
                ordering = false;
            }
        }

        // NEW ORDER CREATION SECTION
        CustomersOrder order = new CustomersOrder(customerInfo, booksOrderList);
        float totalAmount = order.calculateTotalAmount();
        System.out.println("Total amount for your order: Rs" + totalAmount);

        // CUSTOMER PAYMENT SECTION
        boolean paymentStatus = false;
        while (!paymentStatus) {
            System.out.println("Enter amount to pay:");
            float payment = myInput.nextFloat();
            if (payment >= totalAmount) {
                float userChange = payment - totalAmount;

                // HIGHEST NOTES CALCULATING SECTION
                double[] cashNotes = {1000, 500, 100, 50, 20, 10, 5, 1};
                System.out.println("Your change is Rs. " + userChange);
                for (double noteNumber : cashNotes) {
                    if (userChange >= noteNumber) {
                        int noteCount = (int) (userChange / noteNumber);
                        userChange = (float)(userChange - noteCount * noteNumber);
                        System.out.println(noteCount + " Notes of Rs. " + noteNumber);
                    }
                }

                System.out.println("Thank you for your payment");
                order.processOrder();
                paymentStatus = true;
            } else {
                System.out.println("Insufficient amount. Please pay the sufficient amount.");
            }
        }

        // Print all orders
        System.out.println("Order Summary:");
        for (BooksOrder orderedBook : booksOrderList) {
            System.out.println("Book Title: " + orderedBook.getBook().getBookTitle() + ", Quantity: " + orderedBook.getQuantity());
        }
    }
}
