/*
17. Online Quiz Application
Ask 5 questions (MCQs) from a user.
● Use arrays and for-loop.
● Record score.
● Switch for answer checking. Apply clear indentation and structured layout.
*/

import java.util.Scanner;
public class QuizApplication {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int score = 0;

        String[] questions = {
                "1. Which keyword is used to create an object in Java?\n" +
                "a) class\nb) new\nc) object\nd) create\n",

                "2. Which of the following is NOT a primitive data type?\n" +
                "a) int\nb) float\nc) String\nd) char\n",

                "3. Which loop is guaranteed to execute at least once?\n" +
                "a) for\nb) while\nc) do-while\nd) foreach\n",

                "4. Which symbol is used for single-line comments in Java?\n" +
                "a) /* */\nb) <!-- -->\nc) //\nd) ##\n",

                "5. Which method is the entry point of a Java program?\n" +
                "a) start()\nb) main()\nc) run()\nd) execute()\n"
        };

        char[] correctAnswers = {'b', 'c', 'c', 'c', 'b'};

        for (int i = 0; i < questions.length; i++) {

            System.out.println(questions[i]);
            System.out.print("Choose the correct option: ");
            char answer = input.next().toLowerCase().charAt(0);

            switch (answer) {
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                    if (answer == correctAnswers[i]) {
                        System.out.println("Correct Answer!\n");
                        score++;
                    } else {
                        System.out.println("Wrong Answer!\n");
                    }
                    break;

                default:
                    System.out.println("Invalid input!\n");
            }
        }

        System.out.println("Final Score: " + score + " / " + questions.length);
        input.close();
    }
}
