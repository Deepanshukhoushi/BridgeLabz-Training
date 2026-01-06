package com.edumentor;
import java.util.*;
public class Quiz {

	private List<String> questions;
	private final List<String> correctAnswers;
	
	public Quiz(String difficulty) {
		questions = new ArrayList<>();
		List<String> answers = new ArrayList<>();
		
		if(difficulty.equalsIgnoreCase("easy")) {
			questions.add("5-3");
			answers.add("2");
		} else if (difficulty.equalsIgnoreCase("medium")) {
			questions.add("500+423");
			answers.add("940");
		}else {
			questions.add("645/5");
			answers.add("129");
		}
		
		this.correctAnswers = Collections.unmodifiableList(answers);
	}
	public double evaluates(List<String> userAnswers) {
		int score = 0;
		
		for(int i = 0; i< correctAnswers.size(); i++) {
			if(userAnswers.get(i).equals(correctAnswers.get(i))) {
				score++;
			}
		}
		return ((double) score/correctAnswers.size()) * 100;
		
	}
	public List<String> getQuestions() {
		return questions;
	}
}
