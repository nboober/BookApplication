package main;

public class Book {

    private String title = "";
    private String author = "";
    private String description = "";
    private int price = 0;
    private boolean isInStock = false;

    //default constructor

    //Overloaded constructor
    public Book(String title, String author, String description, int price, boolean isInStock){
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getString(){
        return this.title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getAuthor(){
        return this.author;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }

    public void setIsInStock(boolean isInStock){
        this.isInStock = isInStock;
    }

    public boolean getIsInStock(){
        return this.isInStock;
    }

    public void getDisplayText(){
        System.out.println("Author: " + this.author + " , Title: " + this.title + " , Description: " + this.description);
    }

}
