package main;
import main.Book;
import java.util.Scanner;

import java.util.Scanner;

public class BookApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Book harryPotter = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "You're a wizard arry...", 25, true);
        harryPotter.getDisplayText();

        System.out.println();

        Book wildThings = new Book("Where the wild Things are", "N/A", "There are Wild Things", 10, true);
        wildThings.setAuthor("Me");
        wildThings.getDisplayText();
        System.out.println("$" + wildThings.getPrice());

        Book hungerGames = new Book("The Hunger Games", "Suzanne Collins", "About a girl trying to survive", 100, true);
        Book mockingBird = new Book("To Kill a Mockingbird", "Harper Lee", "You never kill a mocking bird", 50, false);
        Book twilight = new Book("Twilight", "Stephenie Meyer", "Vampires and Werewolves", 25, false);
        Book animalFarm = new Book("Animal Farm", "George Orwell", "About Animals on a farm", 10, true);


    }

}
