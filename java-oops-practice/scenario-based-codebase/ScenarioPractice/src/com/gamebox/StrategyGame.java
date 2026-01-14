package com.gamebox;
public class StrategyGame extends Game {
    public StrategyGame(String title, double price, double rating) {
        super(title, "Strategy", price, rating);
    }

    @Override
    public void playDemo() {
        System.out.println("Playing tactical Strategy demo of " + title);
    }
}
