package com.gamebox;
import java.util.ArrayList;
import java.util.List;
public class User {
    private final String username;
    private final List<Game> ownedGames;  

    public User(String username) {
        this.username = username;
        this.ownedGames = new ArrayList<>();
    }

    public void buyGame(Game game) {
        ownedGames.add(game);
        System.out.println(game.getTitle() + " added to your library");
    }

    public void showOwnedGames() {
        System.out.println("\nOwned Games:");
        if (ownedGames.isEmpty()) {
            System.out.println("No games owned");
            return;
        }
        for (Game game : ownedGames) {
            game.displayGameInfo();
        }
    }
}

