package com.sorting.insertionsort.movietime;

import java.util.ArrayList;

public class SortMovie {
	public static void sortMovieTime (ArrayList<Movie> movies) {
		int n = movies.size();
		
		for(int i = 1; i<n; i++) {
			Movie key = movies.get(i);
			
			int j = i-1;
			
			while (j>=0 && movies.get(j).getTime().isAfter(key.getTime())) {
				movies.set(j+1, movies.get(j));
				j--;
			}
			j++;
			movies.set(j, key);
		}
	}
	
	
	
	public static void display (ArrayList<Movie> movies) {
		for(int i = 0;i <movies.size(); i++) {
			Movie movie = movies.get(i);
			System.out.println("Movie name: " + movie.getName() + ", Show time: " + movie.getTime());
		}
	}
}
