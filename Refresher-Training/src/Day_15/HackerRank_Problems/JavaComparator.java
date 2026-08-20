package Day_15.HackerRank_Problems;

import java.util.*;

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class Checker implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b) {
        if (a.score == b.score) {
            return a.name.compareTo(b.name); // ascending by name
        } else {
            return b.score - a.score; // descending by score
        }
    }
}

public class JavaComparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Player[] players = new Player[n];
        for (int i = 0; i < n; i++) {
            players[i] = new Player(sc.next(), sc.nextInt());
        }
        sc.close();

        Arrays.sort(players, new Checker());
        for (Player p : players) {
            System.out.println(p.name + " " + p.score);
        }
    }
}
