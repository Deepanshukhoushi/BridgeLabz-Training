package com.edumentor;

import java.util.*;

public class EduMentorApp {
	public static void main(String[] args) {
		Instructor instructor = new Instructor("who", "xyz@gmail.com", 101);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Learner name, email, userId, course Type");
		String name = input.next();
		String email = input.next();
		int userId = input.nextInt();
		String type = input.next();
		Learner learner = new Learner(name, email, userId, type);
		
		System.out.println("Enter difficulty level Easy/medium/hard");
		String difficulty = input.next();
		Quiz quiz = new Quiz(difficulty);
		
		List<String> learnerAnswers = new ArrayList<>();
		learnerAnswers.add("30");
		
		double percentage = quiz.evaluates(learnerAnswers);
		learner.setPercentage(percentage);
		
		System.out.println("Quiz Score: " + percentage + "%");
		learner.generateCertificate();
		input.close();
	}
}
