package com.examproctor;
import java.util.Scanner;
public class ExamProctorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        NavigationTracker navigation = new NavigationTracker();
        AnswerStore answerStore = new AnswerStore();
        Evaluator evaluator = new Evaluator();

        int totalQuestions = 3;

        for (int i = 1; i <= totalQuestions; i++) {

            navigation.visitQuestion(i);

            System.out.println("Question " + i + ": Choose option (A/B/C/D)");
            String answer = scanner.next();

            answerStore.saveAnswer(i, answer);

            System.out.println("Type 'back' to go to previous question or 'next' to continue:");
            String action = scanner.next();

            if (action.equalsIgnoreCase("back")) {
                navigation.goBack();
            }
        }

        int finalScore = evaluator.calculateScore(answerStore.getAnswers());
        System.out.println("\nExam Submitted!");
        System.out.println("Final Score: " + finalScore + " / " + totalQuestions);

        scanner.close();
    }
}
