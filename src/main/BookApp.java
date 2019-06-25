package main;
import main.Book;

public class BookApp {
    public static void main(String[] args){

        Book harryPotter = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "You're a wizard arry...", 25, true);
        harryPotter.getDisplayText();

        System.out.println();

        Book wildThings = new Book("Where the wild Things are", "N/A", "There are Wild Things", 10, true);
        wildThings.setAuthor("Me");

        wildThings.getDisplayText();
        System.out.println("$" + wildThings.getPrice());
    }
}
