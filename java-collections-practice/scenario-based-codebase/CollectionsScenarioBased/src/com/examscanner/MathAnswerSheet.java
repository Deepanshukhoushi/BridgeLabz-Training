package com.examscanner;

import java.util.List;

public class MathAnswerSheet implements AnswerSheet<String> {

    private List<String> answers;

    public MathAnswerSheet(List<String> answers) {
        this.answers = answers;
    }

    @Override
    public List<String> getAnswers() {
        return answers;
    }
}
