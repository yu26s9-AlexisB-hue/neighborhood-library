package com.pluralsight;
import com.pluralsight.Book;

public class Main {
    public static void main(String[] args){
        Book[] books = new Book[20];

        int numberOfBooks;

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

    }
}
