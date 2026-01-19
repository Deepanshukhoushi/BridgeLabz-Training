package com.bagnballorganizer;
import java.util.ArrayList;
import java.util.List;

public class Bag implements Storable {
    private String id;
    private String color;
    private int capacity;
    private List<Ball> balls;

    public Bag(String id, String color, int capacity) {
        this.id = id;
        this.color = color;
        this.capacity = capacity;
        this.balls = new ArrayList<>();
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getColor() {
        return color;
    }

    public int getBallCount() {
        return balls.size();
    }

    public boolean addBall(Ball ball) {
        if (balls.size() >= capacity) {
            System.out.println("Bag is full!");
            return false;
        }
        balls.add(ball);
        System.out.println("Ball added successfully.");
        return true;
    }

    public boolean removeBall(String ballId) {
        for (Ball ball : balls) {
            if (ball.getId().equals(ballId)) {
                balls.remove(ball);
                System.out.println("Ball removed successfully.");
                return true;
            }
        }
        System.out.println("Ball not found.");
        return false;
    }

    public void displayBalls() {
        if (balls.isEmpty()) {
            System.out.println("No balls in this bag.");
            return;
        }
        for (Ball ball : balls) {
            System.out.println(ball);
        }
    }
}
