/*
7. The Number Guessing Game 🎲
A game asks the player to guess a number between 1 and 100.
Core Java Scenario Based Problem Statements
● Use do-while loop.
● Give hints like "Too high" or "Too low".
● Count attempts and exit after 5 wrong tries.
*/

import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame{
    public static void main(String[] args){
	int random = (int) (Math.random() * 90)+ 10;
	Scanner input = new Scanner(System.in);
	System.out.println("Guess a number b/w 1 and 100: ");
	int attempt = 1;
	do{
	    int num = input.nextInt();	
	    if (num > random){
		System.out.println("Too high");
		System.out.println((5-attempt) + " attempts left");
	    } else if (random > num) {
		System.out.println("Too low");
		System.out.println((5-attempt) + " attempts left");
	    }else if (num == random) {
		System.out.println("You got the number");
		return;
	    }
	    attempt++;
	} while (attempt <= 5);
	System.out.println("Running out of Attemps");
    }
}
	