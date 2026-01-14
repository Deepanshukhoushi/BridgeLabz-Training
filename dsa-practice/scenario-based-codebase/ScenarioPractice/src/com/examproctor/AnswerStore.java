package com.examproctor;
import java.util.HashMap;
public class AnswerStore {
    private HashMap<Integer, String> answers = new HashMap<>();
    public void saveAnswer(int questionId, String answer) {
        answers.put(questionId, answer.toUpperCase());
    }

    public HashMap<Integer, String> getAnswers() {
        return answers;
    }
}
