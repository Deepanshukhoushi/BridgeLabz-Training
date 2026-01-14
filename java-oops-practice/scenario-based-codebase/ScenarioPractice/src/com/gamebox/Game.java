package com.gamebox;
public abstract class Game implements IDownloadable {
    protected String title;
    protected String genre;
    protected double price;
    protected double rating;

    protected Game(String title, String genre, double price, double rating) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public void applyDiscount(double discountPercent) {
        price = price - (price * discountPercent / 100);
    }

    public void displayGameInfo() {
        System.out.println("Game: " + title + " | Genre: " + genre + " | Price: ₹" + price + " | Rating: " + rating);
    }

    @Override
    public void download() {
        System.out.println(title + " downloaded successfully");
    }
}
