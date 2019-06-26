package main;
import main.Book;

import java.util.Scanner;
import java.util.ArrayList;

public class BookApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> books= new ArrayList<Integer>();


        Book harryPotter = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "You're a wizard arry...", 25, true);
        books.add(harryPotter.getPrice());
        harryPotter.getDisplayText();

        System.out.println();

        Book wildThings = new Book("Where the wild Things are", "N/A", "There are Wild Things", 10, true);
        books.add(wildThings.getPrice());

        wildThings.setAuthor("Me");
        wildThings.getDisplayText();
        System.out.println("$" + wildThings.getPrice());

        Book hungerGames = new Book("The Hunger Games", "Suzanne Collins", "About a girl trying to survive", 100, true);
        books.add(hungerGames.getPrice());

        Book mockingBird = new Book("To Kill a Mockingbird", "Harper Lee", "You never kill a mocking bird", 50, false);
//        books.add(mockingBird);
        Book twilight = new Book("Twilight", "Stephenie Meyer", "Vampires and Werewolves", 25, true);
        books.add(twilight.getPrice());

        Book animalFarm = new Book("Animal Farm", "George Orwell", "About Animals on a farm", 10, true);
        books.add(animalFarm.getPrice());


        System.out.println("Enter how many books you want to buy: ");
        int number = scanner.nextInt();

        if(number <= books.size()){
            int total = 0;

            for(int i = 0; i < number; i++){
                total += books.get(i);
            }
            System.out.println("That'll be $" + total);
        }else{
            System.out.println("Your choice is too large there are not enough books. Try again");
        }


    }
    public static void checkout(int number){

    }


}
