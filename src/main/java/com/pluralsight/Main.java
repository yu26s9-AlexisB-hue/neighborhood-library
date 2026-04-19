package com.pluralsight;
import com.pluralsight.Book;

public class Main {
    public static void main(String[] args){
        Book[] books = new Book[20];

        int numberOfBooks;
        int command;

        books[0]= new Book(13447,"3354599","The Great Gatsby", true, "Jimmy Neutron");
        books[1] = new Book(13448, "7788991", "To Kill a Mockingbird", true, "Sarah Lee");
        books[2] = new Book(13449, "1122334", "1984", false, "Michael Brown");
        books[3] = new Book(13450, "5566778", "Pride and Prejudice", true, "Emily Davis");
        books[4] = new Book(13451, "9988776", "The Catcher in the Rye", false, "Chris Johnson");
        books[5] = new Book(13452, "4433221", "Moby Dick", true, "Patricia White");
        books[6] = new Book(13453, "6677889", "War and Peace", false, "David Martinez");
        books[7] = new Book(13454, "2211334", "The Hobbit", true, "Alex Thompson");
        books[8] = new Book(13455, "8899001", "Fahrenheit 451", false, "Jordan Clark");
        books[9] = new Book(13456, "3344556", "Jane Eyre", true, "Taylor Lewis");
        books[10] = new Book(13457, "7766554", "Brave New World", false, "Morgan Hall");
        books[11] = new Book(13458, "9900112", "The Odyssey", true, "Casey Allen");
        books[12] = new Book(13459, "1237894", "Crime and Punishment", false, "Riley Scott");

        numberOfBooks = 12;
        //whoCheckedOutBook( books , numberOfBooks);
        //ShowCheckedOutBooks(books, numberOfBooks, true);
        ShowAvailableBooks(books, numberOfBooks, false);
    }

    private static void whoCheckedOutBook(Book[] books, int numberOfBooks){
        for (int i = 0; i < numberOfBooks; i++){
          Book b = books[i];
          System.out.printf("%s \n", b.getCheckedOutTo());

        }
    }

    private static void ShowAvailableBooks(Book[] books, int numberOfBooks, boolean isCheckedOut){
        boolean found = true;
        for (int i = 0; i < numberOfBooks; i++){
            Book b = books[i];
            if (b.isCheckedOut()== isCheckedOut) {
                System.out.printf("%d %s %s \n", b.getId(), b.getIsbn(), b.getTitle());
                found = false;
            }
        }
    }

    private static void ShowCheckedOutBooks(Book[] books, int numberOfBooks, boolean isCheckedOut){
        boolean found = false;
        for (int i = 0; i < numberOfBooks; i++){
            Book b = books[i];
            if (b.isCheckedOut()== isCheckedOut) {
                System.out.printf("%d %s %s \n", b.getId(), b.getIsbn(), b.getTitle());
                found = true;
            }
        }
        if (!found){
            if (isCheckedOut){
                System.out.println("No books are currently checked out.");
            } else {
                System.out.println("No books are currently available.");
            }
        }

    }
}
