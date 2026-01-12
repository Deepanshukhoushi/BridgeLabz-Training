package com.artify;

abstract class Artwork implements IPurchasable {

    private String title;
    private String artist;
    protected String licenseType;
    protected double price;

    public Artwork(String title, String artist, double price, String licenseType) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.licenseType = licenseType;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void purchase(User user) {
        if (user.getWalletBalance() >= price) {
            user.deductBalance(price);
            System.out.println("Purchase successful: " + title);
        } else {
            System.out.println("Insufficient wallet balance!");
        }
    }
}
