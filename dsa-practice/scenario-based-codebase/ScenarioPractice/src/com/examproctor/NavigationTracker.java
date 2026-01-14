package com.examproctor;
import java.util.Stack;
public class NavigationTracker {
    private Stack<Integer> questionStack = new Stack<>();
    public void visitQuestion(int questionId) {
        questionStack.push(questionId);
        System.out.println("Visited Question: " + questionId);
    }

    public void goBack() {
        if (!questionStack.isEmpty()) {
            System.out.println("Back from Question: " + questionStack.pop());
        } else {
            System.out.println("No previous question available.");
        }
    }
}
