package com.birdsanctuary;
import java.util.*;
//import java.lang.reflect.*;
public class SanctuaryService {
    private ArrayList<Bird> birds = new ArrayList<>();
    public void addBird(Bird bird) {
        birds.add(bird);
        System.out.println("Bird added successfully!");
    }

    public void displayAllBirds() {
        for (Bird b : birds) {
            b.displayInfo();
            b.eat();

            if (b instanceof Flyable) {
                ((Flyable) b).fly();
            }
            if (b instanceof Swimmable) {
                ((Swimmable) b).swim();
            }
            System.out.println("-------------------");
        }
    }

    public void removeBirdById(String id) {
        birds.removeIf(b -> b.getId().equals(id));
        System.out.println("Bird removed if ID existed.");
    }

    public void report() {
        int fly = 0, swim = 0, both = 0, neither = 0;

        for (Bird b : birds) {
            boolean f = b instanceof Flyable;
            boolean s = b instanceof Swimmable;

            if (f && s) both++;
            else if (f) fly++;
            else if (s) swim++;
            else neither++;
        }

        System.out.println("---- Sanctuary Report ----");
        System.out.println("Flyable: " + fly);
        System.out.println("Swimmable: " + swim);
        System.out.println("Both: " + both);
        System.out.println("Neither: " + neither);
    }

    public void showDeveloperInfo() {
        Class<Bird> cls = Bird.class;

        if (cls.isAnnotationPresent(DeveloperInfo.class)) {
            DeveloperInfo info = cls.getAnnotation(DeveloperInfo.class);
            System.out.println("Developer: " + info.name());
            System.out.println("Version: " + info.version());
        }
    }
}
