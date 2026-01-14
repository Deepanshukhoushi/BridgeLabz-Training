package com.examproctor;
import java.util.HashMap;
public class Evaluator {
    private HashMap<Integer, String> correctAnswers = new HashMap<>();
    public Evaluator() {
        correctAnswers.put(1, "A");
        correctAnswers.put(2, "B");
        correctAnswers.put(3, "C");
    }

    public int calculateScore(HashMap<Integer, String> studentAnswers) {
        int score = 0;

        for (int qId : correctAnswers.keySet()) {
            if (studentAnswers.containsKey(qId) &&
                studentAnswers.get(qId).equals(correctAnswers.get(qId))) {
                score++;
            }
        }
        return score;
    }
}

