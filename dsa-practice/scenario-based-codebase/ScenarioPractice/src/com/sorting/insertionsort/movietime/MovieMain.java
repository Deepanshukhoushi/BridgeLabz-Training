package com.sorting.insertionsort.movietime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;
public class MovieMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter no. of movies: ");
		int num = input.nextInt();
		input.nextLine();
		
		ArrayList<Movie> movies = new ArrayList<>();
		
		for (int i = 0; i<num; i++) {
			System.out.println("Enter Movie name and Show Timing (HH:MM): ");
			String name = input.nextLine();

			String time = input.nextLine();
			LocalTime showTime = LocalTime.parse(time);
			
			movies.add(new Movie(name, showTime));
		}
		
		SortMovie.sortMovieTime(movies);
		
		System.out.println("\nAll Movies are sorted By Show Time: \n");
		SortMovie.display(movies);
		input.close();
	}
}
